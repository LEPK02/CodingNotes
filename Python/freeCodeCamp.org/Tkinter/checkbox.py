from tkinter import *
from PIL import ImageTk, Image

# Create root widget
root = Tk()
root.title("Hello World")  # change window title text
root.iconbitmap("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_icon.ico")
root.geometry("400x400")

# Create function to show sum of checked boxes
def sum():
	global label_1
	label_1.destroy()
	label_1 = Label(root, text=str(var_1.get()+var_2.get()+var_3.get()))
	label_1.pack()

# Create variables to hold checkbox values
var_1 = IntVar()
var_2 = IntVar()
var_3 = IntVar()

# Create checkboxes
cb_1 = Checkbutton(root, text="1", variable=var_1, onvalue=1, offvalue=0)
cb_1.deselect()
cb_1.pack()

cb_2 = Checkbutton(root, text="2", variable=var_2, onvalue=2, offvalue=0)
cb_2.deselect()
cb_2.pack()

cb_3 = Checkbutton(root, text="3", variable=var_3, onvalue=3, offvalue=0)
cb_3.deselect()
cb_3.pack()

# Create button to apply values
button_1 = Button(root, text="Submit", command=sum)
button_1.pack()

label_1 = Label(root, text="0")
label_1.pack()

# Create main event loop
root.mainloop()