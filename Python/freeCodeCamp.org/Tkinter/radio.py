from tkinter import *
from PIL import ImageTk, Image

# Create root widget
root = Tk()
root.title("Favourite Player")  # change window title text
root.iconbitmap("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_icon.ico")

# Create radio variable
player = StringVar()
player.set("Lewa")

# Create function that updates radio variable when clicking radio buttons
def selected(value):
		label = Label(root, text=value)
		label.pack()

MODES = [("Robert Lewandowski", "Lewa"), ("Thomas Muller", "Mull"), ("Joshua Kimmich", "Kimm")]

# Create radio buttons using loop
for name, mode in MODES:
	Radiobutton(root, text=name, variable=player, value=mode).pack(anchor="w")

# Create radio buttons
# Radiobutton(root, text="Robert Lewandowski", variable=r, value=1, command=lambda: selected(r.get())).pack(anchor="w")
# Radiobutton(root, text="Thomas Muller", variable=r, value=2, command=lambda: selected(r.get())).pack(anchor="w")

# Create submit button
button_submit = Button(root, text="Submit", command=lambda: selected(player.get())).pack()

# Create main event loop
root.mainloop()