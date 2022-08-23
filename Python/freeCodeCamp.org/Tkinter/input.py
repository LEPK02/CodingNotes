from tkinter import *

# Create root widget
root = Tk()

# Create text
label1 = Label(root, text="What is your name?").pack()

# Create input field
e = Entry(root,
		  borderwidth=5,
		  fg="grey")
# e.insert(0, "John")
e.pack()

# Generate text on click
def clicked():
		label2 = Label(root, text=f"Hello {e.get()}!")
		label2.pack()

# Create button
button1 = Button(root,
				 text="Hello World!",
				 command=clicked,
				 fg="white",
				 bg="black")

# Add widget to top
button1.pack()

# Create main event loop
root.mainloop()