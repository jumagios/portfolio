import os.path
from tkinter import *
from random import choice, randint, shuffle
import pandas

# ---------------------------- CONSTANTS ------------------------------- #
BACKGROUND_COLOR = "#B1DDC6"
actual_card = {}
words_to_learn = {}
to_learn = {}
data = None
# ---------------------------- DATA READ ------------------------------- #
try:
    data = pandas.read_csv("data/words_to_learn.csv")
except FileNotFoundError:
    original_data = pandas.read_csv("data/french_words.csv")
    to_learn = original_data.to_dict(orient="records")
else:
    to_learn = data.to_dict(orient="records")


# ---------------------------- CHECK CORRECT WORD ------------------------------- #

def check_correct():
    to_learn.remove(actual_card)
    df = pandas.DataFrame(to_learn)
    df.to_csv("data/words_to_learn.csv", index=False)
    word_generator()


# ---------------------------- WORD GENERATOR ------------------------------- #


def change_card():
    canvas.itemconfig(title_text, fill="white", text="English")
    canvas.itemconfig(word_text, fill="white", text=actual_card["English"])
    canvas.itemconfig(card_background, image=card_back_image)


def word_generator():
    global actual_card, flip_timer
    window.after_cancel(flip_timer)
    actual_card = choice(to_learn)
    canvas.itemconfig(title_text, text="French", fill="black")
    canvas.itemconfig(word_text, text=actual_card["French"], fill="black")
    canvas.itemconfig(card_background, image=card_front_image)
    flip_timer = window.after(3000, change_card)


# ---------------------------- UI SETUP ------------------------------- #

window = Tk()
window.title("Flashy")
window.config(padx=50, pady=50, bg=BACKGROUND_COLOR)

flip_timer = window.after(3000, change_card)

# Button
cancel_image = PhotoImage(file="images/wrong.png")
cancel_button = Button(image=cancel_image, highlightthickness=0, command=word_generator)
cancel_button.grid(column=1, row=2)
right_image = PhotoImage(file="images/right.png")
right_button = Button(image=right_image, highlightthickness=0, command=check_correct)
right_button.grid(column=2, row=2)

canvas = Canvas(width=820, height=540, bg=BACKGROUND_COLOR, highlightthickness=0)
card_front_image = PhotoImage(file="images/card_front.png")
card_back_image = PhotoImage(file="images/card_back.png")
card_background = canvas.create_image(410, 270, image=card_front_image)

title_text = canvas.create_text(410, 210, text="", fill="black", font=("Arial", 20, "italic"))
word_text = canvas.create_text(410, 280, text="", fill="black", font=("Arial", 40, "bold"))
canvas.grid(column=1, row=1, columnspan=2)

word_generator()

window.mainloop()
