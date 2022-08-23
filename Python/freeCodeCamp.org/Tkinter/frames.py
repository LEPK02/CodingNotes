from tkinter import *

# Create root widget
root = Tk()

# Create frame
frame = LabelFrame(root, text="Hello World!", fg="white", bg="red")
frame.pack(padx=100, pady=100, ipadx=30, ipady=50)

# Create button
myLabel = Button(frame, text="Goodbye World!", anchor="se", fg="white", bg="blue")
myLabel.pack(fill="both", expand=True, side="left")

myLabel1 = Button(frame, text="Goodbye World!", anchor="s", fg="white", bg="green", pady=20)
myLabel1.pack(expand=True, side="right", padx=100)

# Create main event loop
root.mainloop()