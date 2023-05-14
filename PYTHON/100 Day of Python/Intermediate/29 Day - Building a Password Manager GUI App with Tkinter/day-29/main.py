from tkinter import *
from tkinter import messagebox
from random import choice, randint, shuffle
import pyperclip
import json

# ---------------------------- CONSTANTS ------------------------------- #
WHITE = "#ffffff"


# ---------------------------- FIND PASSWORD ------------------------------- #
def find_password():
    website = website_entry.get()
    try:
        with open("data.json", "r") as data_file:
            data = json.load(data_file)
    except FileNotFoundError:
        messagebox.showinfo(message="No Data File Found")
    else:
        if website in data:
            email = data[website]["email"]
            password = data[website]["password"]
            messagebox.showinfo(title=website, message=f"Email: {email}\nPassword: {password}")
        else:
            messagebox.showinfo(message="No details for the website exist")


# ---------------------------- PASSWORD GENERATOR ------------------------------- #
# Password Generator Project
def generate_password():
    letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
               'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
               'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
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
    new_data = {
        website: {
            "email": email,
            "password": password,
        }
    }
    if len(website) == 0 or len(password) == 0:
        messagebox.showinfo(title="Oops", message="Please don't leave any fields empty.")
    else:
        try:
            with open("data.json", "r") as new_file:
                # Reading old data
                data = json.load(new_file)
        except FileNotFoundError:
            with open("data.json", "w") as new_file:
                # Create new data json
                json.dump(new_data, new_file, indent=4)

        else:
            # Updating old data with new data
            data.update(new_data)

            with open("data.json", "w") as new_file:
                # Saving updated data
                json.dump(data, new_file, indent=4)
        finally:
            reset_entries()


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
website_entry = Entry(width=32)
website_entry.grid(column=2, row=2)
website_entry.focus()
email_user_entry = Entry(width=52)
email_user_entry.grid(column=2, row=3, columnspan=2)
email_user_entry.insert(0, "juangimenezos@hotmail.com")
password_entry = Entry(width=32)
password_entry.grid(column=2, row=4)

# Button
generate_password_button = Button(text="Generate Password", bg=WHITE, width=15, command=generate_password)
generate_password_button.grid(column=3, row=4)
add_button = Button(text="Add", bg="white", width=44, command=save)
add_button.grid(column=2, row=5, columnspan=2)
search_button = Button(text="Search", bg=WHITE, width=15, command=find_password)
search_button.grid(column=3, row=2)

window.mainloop()
