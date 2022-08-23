from tkinter import *
from tkinter import messagebox
from PIL import ImageTk, Image
import sqlite3

# Create root widget
root = Tk()
root.title("Hello World")  # change window title text
root.iconbitmap("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_icon.ico")
root.geometry("400x400")

# Create a database
connect = sqlite3.connect("address.db")

# Create a cursor
cursor = connect.cursor()

# Create a table
# cursor.execute("""CREATE TABLE addresses(
# 				first_name text,
# 				last_name text,
# 				address text,
# 				city text,
# 				state text,
# 				zipcode integer)
# 				""")

# Create textbox
first_name = Entry(root, width=30)
first_name.grid(row=0, column=1, padx=20)
last_name = Entry(root, width=30)
last_name.grid(row=1, column=1, padx=20)
address = Entry(root, width=30)
address.grid(row=2, column=1, padx=20)
city = Entry(root, width=30)
city.grid(row=3, column=1, padx=20)
state = Entry(root, width=30)
state.grid(row=4, column=1, padx=20)
zipcode = Entry(root, width=30)
zipcode.grid(row=5, column=1, padx=20)

# Create textbox labels
first_name_label = Label(root, text="First Name")
first_name_label.grid(row=0, column=0, padx=20)
last_name_label = Label(root, text="Last Name")
last_name_label.grid(row=1, column=0, padx=20)
address_label = Label(root, text="Address")
address_label.grid(row=2, column=0, padx=20)
city_label = Label(root, text="City")
city_label.grid(row=3, column=0, padx=20)
state_label = Label(root, text="State")
state_label.grid(row=4, column=0, padx=20)
zipcode_label = Label(root, text="Zipcode")
zipcode_label.grid(row=5, column=0, padx=20)

# Create submit function
def submit():
	# Create a database
	connect = sqlite3.connect("address.db")

	# Create a cursor
	cursor = connect.cursor()

	# Insert into table
	cursor.execute("INSERT INTO addresses VALUES (:first_name, :last_name, :address, :city, :state, :zipcode)",
		{"first_name": first_name.get(),
		"last_name": last_name.get(),
		"address": address.get(),
		"city": city.get(),
		"state": state.get(),
		"zipcode": zipcode.get()})

	# Commit changes
	connect.commit()

	# Close connection
	connect.close()

	# Clear text boxes
	first_name.delete(0, END)
	last_name.delete(0, END)
	address.delete(0, END)
	city.delete(0, END)
	state.delete(0, END)
	zipcode.delete(0, END)

# Create submit button
submit_button = Button(root, text="Add to Database", command=submit)
submit_button.grid(row=6, column=0, columnspan=2, pady=10, padx=10, ipadx=100)

# Create function for query button
def query():
	# Create a database
	connect = sqlite3.connect("address.db")

	# Create a cursor
	cursor = connect.cursor()

	# Query the database
	cursor.execute("SELECT *, oid FROM addresses")
	records = cursor.fetchall()
	
	# Create new window
	viewer = Tk()
	viewer.title("Show Records")
	viewer.iconbitmap("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_icon.ico")
	viewer.geometry("400x400")
	for record in records:
		Label(viewer, text=f"{record[0]} {record[1]} {record[-1]}").pack()
	close_button = Button(viewer, text="Back", command=lambda: viewer.destroy())
	close_button.pack()

	# Commit changes
	connect.commit()

	# Close connection
	connect.close()

# Create query button
query_button = Button(root, text="Show Database", command=query)
query_button.grid(row=7, column=0, columnspan=2, pady=10, padx=10, ipadx=100)

# Create delete function
def delete():
	# Create a database
	connect = sqlite3.connect("address.db")

	# Create a cursor
	cursor = connect.cursor()

	# Delete a record
	try:
		cursor.execute("DELETE FROM addresses WHERE oid=" + delete_box.get())
	except sqlite3.OperationalError:
		response = messagebox.showerror("Error", "Please enter a record ID")
	delete_box.delete(0, END)

	# Commit changes
	connect.commit()

	# Close connection
	connect.close()

# Create delete button
delete_button = Button(root, text="Delete from Database", command=delete)
delete_button.grid(row=10, column=0, columnspan=2, pady=10, padx=10, ipadx=100)

# Create delete box
delete_box = Entry(root, width=30)
delete_box.grid(row=9, column=1)
delete_box_label = Label(root, text="Enter ID to Delete Entry")
delete_box_label.grid(row=9, column=0)


# Create save record function
def save():
	# Set variables
	record_id = update_box.get()
	global first_name_editor
	global last_name_editor
	global address_editor
	global city_editor
	global state_editor
	global zipcode_editor
	global editor

	# Create a database
	connect = sqlite3.connect("address.db")

	# Create a cursor
	cursor = connect.cursor()

	# Create a table
	cursor.execute("""UPDATE addresses SET
					first_name = :first_name,
					last_name = :last_name,
					address = :address,
					city = :city,
					state = :state,
					zipcode = :zipcode

					WHERE oid = :oid""",

					{
					"first_name": first_name_editor.get(),
					"last_name": last_name_editor.get(),
					"address": address_editor.get(),
					"city": city_editor.get(),
					"state": state_editor.get(),
					"zipcode": zipcode_editor.get(),
					"oid": record_id
					})

	# Commit changes
	connect.commit()

	# Close connection
	connect.close()

	# Close window
	editor.destroy()


# Create update function
def update():
	# Make textbox and editor variables global
	global first_name_editor
	global last_name_editor
	global address_editor
	global city_editor
	global state_editor
	global zipcode_editor
	global editor

	# Create a database
	connect = sqlite3.connect("address.db")

	# Create a cursor
	cursor = connect.cursor()

	# Query the database
	record_id = update_box.get()
	try:
		cursor.execute("SELECT * FROM addresses WHERE oid=" + record_id)
	# Reject empty text box
	except sqlite3.OperationalError:
		response = messagebox.showerror("Error", "Please enter a record ID")
		return
	records = cursor.fetchall()

	# Message that record does not exist
	if records == []: 
		response = messagebox.showerror("Error", "Record does not exist")
		return

	# Commit changes
	connect.commit()

	# Close connection
	connect.close()

	# Create new window
	editor = Tk()
	editor.title("Edit Database")
	editor.iconbitmap("C:/Users/Janice/Desktop/Coding/Code/Python/Notes/freeCodeCamp.org/Tkinter/images/bayern_icon.ico")
	editor.geometry("400x400")

	# Create textbox
	first_name_editor = Entry(editor, width=30)
	first_name_editor.grid(row=0, column=1, padx=20)
	last_name_editor = Entry(editor, width=30)
	last_name_editor.grid(row=1, column=1, padx=20)
	address_editor = Entry(editor, width=30)
	address_editor.grid(row=2, column=1, padx=20)
	city_editor = Entry(editor, width=30)
	city_editor.grid(row=3, column=1, padx=20)
	state_editor = Entry(editor, width=30)
	state_editor.grid(row=4, column=1, padx=20)
	zipcode_editor = Entry(editor, width=30)
	zipcode_editor.grid(row=5, column=1, padx=20)

	# Create textbox labels
	first_name_label_editor = Label(editor, text="First Name")
	first_name_label_editor.grid(row=0, column=0, padx=20)
	last_name_label_editor = Label(editor, text="Last Name")
	last_name_label_editor.grid(row=1, column=0, padx=20)
	address_label_editor = Label(editor, text="Address")
	address_label_editor.grid(row=2, column=0, padx=20)
	city_label_editor = Label(editor, text="City")
	city_label_editor.grid(row=3, column=0, padx=20)
	state_label_editor = Label(editor, text="State")
	state_label_editor.grid(row=4, column=0, padx=20)
	zipcode_label_editor = Label(editor, text="Zipcode")
	zipcode_label_editor.grid(row=5, column=0, padx=20)

	# Create save button
	save_button = Button(editor, text="Save Record", command=save)
	save_button.grid(row=6, column=0, columnspan=2, pady=10, padx=10, ipadx=100)

	# Fill text boxes with existing record
	for record in records:  # local variable from querying the database
		first_name_editor.insert(0, record[0])
		last_name_editor.insert(0, record[1])
		address_editor.insert(0, record[2])
		city_editor.insert(0, record[3])
		state_editor.insert(0, record[4])
		zipcode_editor.insert(0, record[5])


# Create update button
update_button = Button(root, text="Edit Database", command=update)
update_button.grid(row=12, column=0, columnspan=2, pady=10, padx=10, ipadx=100)

# Create update box
update_box = Entry(root, width=30)
update_box.grid(row=11, column=1)
update_box_label = Label(root, text="Enter ID to Select Entry")
update_box_label.grid(row=11, column=0)

# Commit changes
connect.commit()

# Close connection
connect.close()

# Create main event loop
root.mainloop()