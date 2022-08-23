from tkinter import *
from PIL import ImageTk, Image

# Create root widget
root = Tk()
root.title("Bayern 2019-20")  # change window title text
root.iconbitmap("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_icon.ico")

# Add images
img_1 = ImageTk.PhotoImage(Image.open("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_lineup.jpg").resize((600,400), Image.ANTIALIAS))
img_2 = ImageTk.PhotoImage(Image.open("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bundesliga.jpg").resize((600,400), Image.ANTIALIAS))
img_3 = ImageTk.PhotoImage(Image.open("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/dfb_pokal.jpg").resize((600,400), Image.ANTIALIAS))
img_4 = ImageTk.PhotoImage(Image.open("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/ucl.jpeg").resize((600,400), Image.ANTIALIAS))
img_lst = [img_1, img_2, img_3, img_4]

label_1 = Label(image=img_1, width= 600, height= 400)  # limits image size
label_1.grid(row=0, column=0, columnspan=3)

# Create status bar
status = Label(root, text=f"Image 1 of {len(img_lst)}", bd=1, relief=SUNKEN, anchor=E)
status.grid(row=2, column=0, columnspan=3, pady=5, sticky=W+E)

# Create forward command
def forward(img_num):
	# Import global variables
	global label_1
	global button_back
	global button_forward

	# Change image
	label_1.grid_forget()  # clear image
	label_1 = Label(root, image=img_lst[img_num])
	label_1.grid(row=0, column=0, columnspan=3)

	# Update image of buttons
	if img_num + 1 >= len(img_lst):  # disables forward button if at last image
		button_forward = Button(root, text=">>", state=DISABLED)
		button_forward.grid(row=1, column=2, sticky="w")
	else:
		button_forward = Button(root, text=">>", command=lambda: forward(img_num+1))
		button_forward.grid(row=1, column=2, sticky="w")
	button_back = Button(root, text="<<", command=lambda: back(img_num-1))
	button_back.grid(row=1, column=0, sticky="e")

	# Update status bar
	status = Label(root, text=f"Image {img_num+1} of {len(img_lst)}", bd=1, relief=SUNKEN, anchor=E)
	status.grid(row=2, column=0, columnspan=3, pady=5, sticky=W+E)

# Create backward command
def back(img_num):
	# Import global variables
	global label_1
	global button_back
	global button_forward

	# Change image
	label_1.grid_forget()
	label_1 = Label(root, image=img_lst[img_num])
	label_1.grid(row=0, column=0, columnspan=3)

	# Update image number on buttons
	button_forward = Button(root, text=">>", command=lambda: forward(img_num+1))
	button_forward.grid(row=1, column=2, sticky="w")
	if img_num - 1 <= -1: # disables back button if at first image
		button_back = Button(root, text="<<", state=DISABLED)
		button_back.grid(row=1, column=0, sticky="e")
	else:
		button_back = Button(root, text="<<", command=lambda: back(img_num-1))
		button_back.grid(row=1, column=0, sticky="e")

	# Update status bar
	status = Label(root, text=f"Image {img_num+1} of {len(img_lst)}", bd=1, relief=SUNKEN, anchor=E)
	status.grid(row=2, column=0, columnspan=3, pady=5, sticky=W+E)

# Create buttons
button_back = Button(root, text="<<", state=DISABLED)
button_back.grid(row=1, column=0, sticky="e")

button_quit = Button(root, text="Quit", command=root.quit)
button_quit.grid(row=1, column=1)

button_forward = Button(root, text=">>", command=lambda: forward(1))
button_forward.grid(row=1, column=2, sticky="w")

# Create main event loop
root.mainloop()