from tkinter import *
from tkinter import messagebox
from random import choice, randint, shuffle
import pyperclip
# ---------------------------- CONSTANTS ------------------------------- #
WHITE = "#ffffff"


# ---------------------------- PASSWORD GENERATOR ------------------------------- #
#Password Generator Project
def generate_password():
    letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
    numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
    symbols = ['!', '#', '$', '%', '&', '(', ')', '*', '+']

    nr_letters = randint(8, 10)
    nr_symbols = randint(2, 4)
    nr_numbers = randint(2, 4)

    password_list = []


    [password_list.append(choice(letters)) for letter in range(nr_letters)]
    [password_list.append(choice(symbols)) for symbol in range(nr_symbols)]
    [password_list.append(choice(numbers)) for num in range(nr_numbers)]


    shuffle(password_list)

    password = "".join(password_list)

    password_entry.insert(0, password)
    if len(password_entry.get()) > 0:
        password_entry.delete(0, END)
        password_entry.insert(0, password)
    pyperclip.copy(password)
# ---------------------------- SAVE PASSWORD ------------------------------- #

def save():
    website = website_entry.get()
    email = email_user_entry.get()
    password = password_entry.get()

    is_ok = messagebox.askokcancel(title=website, message=f"These are the details entered: \nEmail: {email} "
                                                          f"\nPassword: {password} \nIs it ok to save?")
    if not (empty_entry(website, password)):

        if is_ok:
            with open("data.txt", "a") as new_file:
                new_file.write(f"{website} | {email} | {password}\n")
                reset_entries()
    else:
        messagebox.showinfo(title="Oops", message="Please don't leave any fields empty!")


def empty_entry(web, password):
    return len(web) == 0 or len(password) == 0


def reset_entries():
    website_entry.delete(0, END)
    password_entry.delete(0, END)


# ---------------------------- UI SETUP ------------------------------- #
window = Tk()
window.title("Password Manager")
window.config(padx=20, pady=20, bg=WHITE)

canvas = Canvas(width=200, height=200, bg=WHITE, highlightthickness=0)
lock_image = PhotoImage(file="logo.png")
canvas.create_image(100, 100, image=lock_image)

canvas.grid(column=2, row=1)

# Label
website_text = Label(text="Website", bg=WHITE)
website_text.grid(column=1, row=2)
email_user_text = Label(text="Email/Username:", bg=WHITE)
email_user_text.grid(column=1, row=3)
password_text = Label(text="Password:", bg=WHITE)
password_text.grid(column=1, row=4)

# Entry
website_entry = Entry(width=52)
website_entry.grid(column=2, row=2, columnspan=2)
website_entry.focus()
email_user_entry = Entry(width=52)
email_user_entry.grid(column=2, row=3, columnspan=2)
email_user_entry.insert(0, "juangimenezos@hotmail.com")
password_entry = Entry(width=32)
password_entry.grid(column=2, row=4)

# Button
generate_password_button = Button(text="Generate Password", bg="white", width=15, command=generate_password)
generate_password_button.grid(column=3, row=4)
add_button = Button(text="Add", bg="white", width=44, command=save)
add_button.grid(column=2, row=5, columnspan=2)

window.mainloop()
