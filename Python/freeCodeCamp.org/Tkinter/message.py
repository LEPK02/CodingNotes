from tkinter import *
from tkinter import messagebox
from PIL import ImageTk, Image

# Create root widget
root = Tk()
root.title("Bayern 2019-20")
root.iconbitmap("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_icon.ico")

# Create popup function
def popup():
	response = messagebox.askyesno("Popup title", "Popup text")  # showinfo, showwarning, showerror, askqustion, askokcancel, askyesno
	if response == 1:
		Label(root, text="Yes").pack()
	elif response == 0:
		Label(root, text="No").pack()

# Create button
Button(root, text="Create popup", command=popup).pack()

# Create main event loop
root.mainloop()