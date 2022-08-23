from tkinter import *

# Create root widget
root = Tk()

# # Helper variables
# value = 0  # current value
# operation = "" # current operation

# Add number to equation
def num(number):
	e.insert(END, number)
	return

# Add operator to equation
def operation(oper):
	if len(e.get()) > 0:
		if oper == "+":
			if e.get()[-1] not in ["+", "-", "×", "÷"]:
				e.insert(END, "+")
		elif oper == "-":
			if e.get()[-1] not in ["+", "-", "×", "÷"]:
				e.insert(END, "-")
		elif oper == "×":
			if e.get()[-1] not in ["+", "-", "×", "÷"]:
				e.insert(END, "×")
		elif oper == "÷":
			if e.get()[-1] not in ["+", "-", "×", "÷"]:
				e.insert(END, "÷")

	return

# Compute equation
def equals():
	if len(e.get()) > 0:
		if e.get()[-1] in ["+", "-", "×", "÷"]:
			pass
		else:
			val = e.get().replace("×", "*").replace("÷", "/")
			e.delete(0, END)
			e.insert(END, eval(val))
	return

# Create input box
e = Entry(root, width=40, borderwidth=5)
e.grid(row=0, column=0, columnspan=4, padx=10, pady=10)
e.bind("<Key>", lambda e: "break") 

# Create buttons
# Buttons 0-9
button1 = Button(root, text=1, width=12, height=6, command=lambda: num(1)).grid(row=1, column=0)
button2 = Button(root, text=2, width=12, height=6, command=lambda: num(2)).grid(row=1, column=1)
button3 = Button(root, text=3, width=12, height=6, command=lambda: num(3)).grid(row=1, column=2)
button4 = Button(root, text=4, width=12, height=6, command=lambda: num(4)).grid(row=2, column=0)
button5 = Button(root, text=5, width=12, height=6, command=lambda: num(5)).grid(row=2, column=1)
button6 = Button(root, text=6, width=12, height=6, command=lambda: num(6)).grid(row=2, column=2)
button7 = Button(root, text=7, width=12, height=6, command=lambda: num(7)).grid(row=3, column=0)
button8 = Button(root, text=8, width=12, height=6, command=lambda: num(8)).grid(row=3, column=1)
button9 = Button(root, text=9, width=12, height=6, command=lambda: num(9)).grid(row=3, column=2)
button0 = Button(root, text=0, width=12, height=6, command=lambda: num(0)).grid(row=4, column=0)
# Button CLR
button_clr = Button(root, text="CLR", width=12, height=6, command=lambda: e.delete(0, END)).grid(row=4, column=1)

# Button for operations
button_eql = Button(root, text="=", width=12, height=6, command=equals).grid(row=4, column=2)
button_add = Button(root, text="+", width=12, height=6, command=lambda: operation("+")).grid(row=1, column=4)
button_sub = Button(root, text="-", width=12, height=6, command=lambda: operation("-")).grid(row=2, column=4)
button_mul = Button(root, text="×", width=12, height=6, command=lambda: operation("×")).grid(row=3, column=4)
button_div = Button(root, text="÷", width=12, height=6, command=lambda: operation("÷")).grid(row=4, column=4)

# Create main event loop
root.mainloop()