from tkinter import *

window = Tk()
window.title("My First GUI Program")
window.minsize(width=500, height=300)
window.config(padx=20, pady=20)

# Label
my_label = Label(text="I Am a Label", font=("Arial", 24, "bold"))
my_label.grid(column=0, row=0)

my_label["text"] = "New Text"
my_label.config(text="New Text")
my_label.config(pady=15, padx=20)


# Button

def button_clicked():
    my_label.config(text=entry.get())


button = Button(text="Click Me", command=button_clicked)
button.grid(column=1, row=1)
button.config(pady=5, padx=5)

# New Button

def new_button_clicked():
    my_label.config(text=entry.get())


new_button = Button(text="Click Me", command=button_clicked)
new_button.grid(column=2, row=0)
new_button.config(pady=5, padx=5)
# Entry

entry = Entry()
entry.grid(column=3, row=3)

window.mainloop()
