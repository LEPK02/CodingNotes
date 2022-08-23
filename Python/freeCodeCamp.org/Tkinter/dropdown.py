from tkinter import *
from PIL import ImageTk, Image

# Create root widget
root = Tk()
root.title("Hello World")  # change window title text
root.iconbitmap("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_icon.ico")
root.geometry("400x400")

# Create variable for dropdown
options = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday"]
clicked = StringVar()
clicked.set(options[0])

# Create dropdown menu
drop_1 = OptionMenu(root, clicked, *options)
drop_1.pack()

# Create main event loop
root.mainloop()