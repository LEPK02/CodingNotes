from tkinter import *
from PIL import ImageTk, Image

# Create root widget
root = Tk()
root.title("Bayern 2019-20")
root.iconbitmap("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_icon.ico")
root.geometry("400x400")

# Create sliders controlled by buttons
vertical = Scale(root, from_=400, to=1000)
vertical.pack(anchor="e")

horizontal = Scale(root, from_=400, to=1000, orient=HORIZONTAL)
horizontal.pack(anchor="s")

# Create function that changes window size
def slide():
	label_1 = Label(root, text=f"Rescaled to {horizontal.get()} by {vertical.get()}").pack()
	root.geometry(f"{horizontal.get()}x{vertical.get()}")

# Create button to apply changes to window size
button_1 = Button(root, text="Apply", command=slide).pack()

# Create function that changes window size (auto-slide)
def auto_slide(v):
	global label_2
	label_2.destroy()
	label_2 = Label(root, text=f"Rescaled to {horizontal_1.get()} by {vertical_1.get()}")
	label_2.pack()
	root.geometry(f"{horizontal_1.get()}x{vertical_1.get()}")


# Create automatic sliders
vertical_1 = Scale(root, from_=400, to=1000, command=auto_slide)
vertical_1.pack(anchor="w")

horizontal_1 = Scale(root, from_=400, to=1000, orient=HORIZONTAL, command=auto_slide)
horizontal_1.pack(anchor="sw")

label_2 = Label(root, text=f"Scale is {horizontal_1.get()} by {vertical_1.get()}")

# Create main event loop
root.mainloop()