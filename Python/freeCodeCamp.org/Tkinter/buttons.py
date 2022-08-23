from tkinter import *

# Create root widget
root = Tk()

# Generate text on click
def clicked():
		label1 = Label(root, text="Hello!")
		label1.pack()

# Create button
button1 = Button(root,
				 text="Hello World!",
				 command=clicked,
				 fg="white",
				 bg="black")
button2 = Button(root,
				 text="Goodbye World!",
				 state=DISABLED,
				 padx=100,
				 pady=50,
				 fg="white",
				 bg="black")

# Add widget to top
button1.pack()
button2.pack()

# Create main event loop
root.mainloop()