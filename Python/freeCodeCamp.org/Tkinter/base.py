from tkinter import *
from PIL import ImageTk, Image

# Create root widget
root = Tk()
root.title("Bayern 2019-20")
root.iconbitmap("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_icon.ico")

# New window function
def open():
    global my_img

    # Create new window
    top = Toplevel()
    top.title("UCL Winners 2019/20")
    top.iconbitmap("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_icon.ico")
    
    # Load image
    my_img = ImageTk.PhotoImage(Image.open("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/ucl.jpeg").resize((600,400)))
    label = Label(top, image=my_img).pack()

    # Button to close window
    button_2 = Button(top, text="Close", command=top.destroy).pack()

# Create button to open window
button_1 = Button(root, text="UCL Winners", command=open).pack()

# Create main event loop
root.mainloop()