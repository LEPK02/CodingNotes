from tkinter import *

# Create root widget
root = Tk()

# Create label widget
label1 = Label(root, text="Hello World!")
label2 = Label(root, text="Goodbye World!")

# Add widget into grid
label1.grid(row=0, column=0)
label2.grid(row=1, column=1)

# Create main event loop
root.mainloop()