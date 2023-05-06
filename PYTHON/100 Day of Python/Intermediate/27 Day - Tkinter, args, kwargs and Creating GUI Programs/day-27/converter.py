from tkinter import *

window = Tk()
window.title("Mile to Km Converter")
window.minsize(width=300, height=150)
window.config(padx=20, pady=20)

# Labels
miles_label = Label(text="Miles", font=("Arial", 11, "normal"))
miles_label.grid(column=2, row=0)

equal_to_label = Label(text="is equal to", font=("Arial", 11, "normal"))
equal_to_label.grid(column=0, row=1)

km_label = Label(text="Km", font=("Arial", 11, "normal"))
km_label.grid(column=2, row=1)

result_label = Label(text="0", font=("Arial", 11, "normal"))
result_label.grid(column=1, row=0)


# Entry

entry_miles = Entry(width=8)
entry_miles.grid(column=1, row=1)



# Button

def convert_miles_to_km():
    km = float(entry_miles.get()) * 1.609
    result_label.config(text=km)


button = Button(text="Calculate", command=convert_miles_to_km)
button.grid(column=1, row=2)


window.mainloop()