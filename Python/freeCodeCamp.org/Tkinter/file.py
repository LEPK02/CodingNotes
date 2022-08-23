from tkinter import *
from tkinter import filedialog
from PIL import ImageTk, Image

# Create root widget
root = Tk()
root.title("Bayern 2019-20")
root.iconbitmap("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_icon.ico")

# Create function for file dialog window
def open():
	global img_1
	# Create file dialog window
	root.filename = filedialog.askopenfilename(initialdir="C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images",
												title="Open",
												filetypes=(("PNG Image", "*.png"),
															("JPG Image", "*.jpg"),
															("JPEG Image", "*.jpeg"),
															("All Files", "*.*")))

	# Load image
	if "img_1_label" in globals():
		img_1_label.destroy()
	img_1 = ImageTk.PhotoImage(Image.open(root.filename).resize((600,400)))
	img_1_label = Label(root, image=img_1)
	img_1_label.grid(row=0, column=0)

	# Move button to bottom of page
	button_1.grid_forget()
	button_1.grid(row=1, column=0)

# Create button
button_1 = Button(root, text="Open File", command=open)
button_1.grid(row=0, column=0, columnspan=2)

# Create main event loop
root.mainloop()