package com.beginner;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.util.HashMap;
import java.util.Calendar;
import java.util.TimerTask;
import java.util.Timer;
import java.io.ObjectStreamClass;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Integer;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {

		// OOP
		// Car myCar = new Car();
		// System.out.println(myCar.model);

		// myCar.drive();
		// myCar.brake();


		// Constructor
		// method called when an object is instantiated
		// Human bobTheBuilder = new Human ("Bob", 21, 69);
		// Human barneyTheDinosaur = new Human ("Barney", 2, 159);
		// System.out.println(bobTheBuilder.name);
		// System.out.println(barneyTheDinosaur.name);
		// bobTheBuilder.eat();
		// barneyTheDinosaur.drink();


		// Variable scope
		// DiceRoller roll = new DiceRoller();


		// Overloaded constructors --> multiple constructors within a class with the same name, but have different parameters
		// Pizza pizza1 = new Pizza("thick", "tomato", "cheddar", "pepperoni");
		// Pizza pizza2 = new Pizza("thick", "tomato");
		// pizza1.printOrder();
		// pizza2.printOrder();


		// toString
		// A textual representation of an object; inherited by all objects
		// Car car = new Car();
		// System.out.println(car); // implicitly calling toString(), prints object's address in memory by default
		// System.out.println(car.toString());


		// Array of objects
		// Food food1 = new Food("pizza");
		// Food food2 = new Food("fries");
		// Food food3 = new Food("burger");

		// Individually add objects to array
		// Food[] fridge = new Food[3];

		// fridge[0] = food1;
		// fridge[1] = food2;
		// fridge[2] = food3;

		// Add multiple objects to array at once
		// Food[] fridge = {food1, food2, food3};

		// System.out.println(fridge[0].name);


		// Passing objects as arguments
		// Garage garage = new Garage();
		// Car lightningMcQueen = new Car("Lightning McQueen");
		// Car mater = new Car("Mater");

		// garage.park(lightningMcQueen);
		// garage.park(mater);


		/* Static keyword
		Modifier. A single copy of a variable/method is created and shared. The class "owns" the static member */
		// Static variable
		// System.out.println(Friend.numberOfFriends);

		// Friend friend1 = new Friend("Spongebob");
		// Friend friend2 = new Friend("Patrick");

		// System.out.println(Friend.numberOfFriends);
		// System.out.println(friend1); // accessing static variables via an instance of the class is not recommended

		// Static method
		// Friend.displayFriends();

		// Static methods are easier to access, e.g.:
		// Math.round(1);


		/* Inheritance
		Process where one class acquires the methods and attributes of another */
		// Bicycle bike = new Bicycle();
		// Vehicle vehicle = new Vehicle();
		// System.out.println(vehicle.topSpeed);
		// System.out.println(bike.topSpeed);
		// bike.start();


		/* Method Overriding 
		Declaring a method in the sub class that already exists in the parent class such that the child class uses its own implementation */
		// Animal animal = new animal();
		// Dog dog = new Dog();

		// animal.spawn();
		// dog.spawn();


		/* Super
		Refers to the superclass (parent) of an object */
		// Dog dog1 = new Dog("Male", "Mongrel");
		// System.out.println(dog1.toString());


		/* Abstraction
		Abstract classes cannot be instantiated but can have a subclass
		Abstract methods are declared without an implementation */
		// Car car = new Car("Mercedes", 1_000_000.0);
		// car.buy();


		/* Access modifiers */
		// Public access modifier: visible to class, package, subclass, global
    	// public String publicMessage = "Public modifier";

	    // // Protected modifier, visible, to class, package, subclass
	    // protected String protectedMessage = "Protected modifier";

	    // // No access modifier (default): visible to class, package
	    // String defaultMessage = "Default: no access modifier";

	    // // Private modifier: visible to class
	    // private String privateMessage = "Private modifier";


	    /* Encapsulation
	    Hidden/private attributes of a class that can only be accessed through methods (getters and setters) 
	    Attributes should be made private if they are not public or protected */
	    // Car car = new Car("BMW", "Bob");

	    // car.setOwnerName("Bob the Builder");
	    // System.out.println(car.getOwnerName());


	    /* Copying objects
	    Setting x = y does not copy y to x but makes x point to memory address of y */
	    // Car carBob = new Car("BMW", "Bob");
	    // Car carWendy = new Car("Ford", "Wendy");

	    // carBob.copy(carWendy);
	    // System.out.println(carBob);
	    // System.out.println(carWendy);
	    // System.out.println(carBob.getOwnerName());
	    // System.out.println(carWendy.getOwnerName());


	    /* Interface
	    Template that can be applied to a class
	    Similar to interface, but specifies what a class has/must do
	    Classes can apply more than one interface while inheritance is limited to 1 super */
	    // Rabbit rabbit = new Rabbit();
	    // rabbit.flee();
	    // rabbit.hunt();

	    // Hawk hawk = new Hawk();
	    // hawk.hunt();


	    /* Polymorphism
	    The ability of an object to identify as more than one type */
	    // Car car = new Car("BMW", "Bob");
	    // Bicycle bike = new Bicycle(100.0);

	    // Vehicle[] forSale = {car, bike};

	    // for (Vehicle x : forSale) {

	    // 	x.buy();
	    // };


	    /* Dynamic polymorphism
	    Dynamic = after compilation (during runtime) */
	    // Animal animal;
	    // Scanner scanner = new Scanner(System.in);
	    // System.out.print("What animal do you want?\n(1=dog) or (2=cat)\t");
	    // int choice = scanner.nextInt();

	    // if (choice == 1) {
	    // 	animal = new Dog("Male", "Mongrel");
	    // 	animal.spawn();
	    // } else if (choice == 2) {
	    // 	animal = new Cat("Female");
	    // 	animal.spawn();
	    // } else {
	    // 	animal = new Animal("Male");
	    // 	System.out.println("Invalid choice, try again");
	    // 	animal.spawn();
	    // }
	    // scanner.close();


	    /* Exceptions
	    An event that occurs during the execution of a program that disrupts the normal flow of instructions */
		// Scanner scanner = new Scanner(System.in);

		// try {
		//     System.out.println("Enter a whole number, x:\t");
		//     int x = scanner.nextInt();

		//     System.out.println("Enter another whole number, y:\t");
		//     int y = scanner.nextInt();

		//     int z = x / y;

		//     System.out.println("x/y = " + z);
		// }
		// catch (ArithmeticException e) {
		// 	System.out.println("You cannot divide by zero");
		// }
		// catch (InputMismatchException e) {
		// 	System.out.println("Invalid input");
		// }
		// catch (Exception e) {
		// 	System.out.println("Something went wrong");
		// }
		// finally {
		// 	scanner.close();
		// }


	    /* File class
	    File = an abstract representation of file and memory directory pathnames */
	    // File file = new File("C:/Coding Notes/Java/Java Full Course/src/com/beginner/hello.txt");

	    // if (file.exists()) {
	    // 	System.out.println("File found");
	    // 	System.out.print(file.getPath());
	    // 	System.out.println(file.getAbsolutePath());
	    // 	System.out.println(file.isFile());
	    // 	file.delete();
	    // } else {
	    // 	System.out.println("File not found");
	    // }


	    /* FileWriter */
	    // try {
	    // 	FileWriter writer = new FileWriter("poem.txt");
	    // 	writer.write("Roses are red");
	    // 	writer.append("\nViolets are blue");
	    // 	writer.close();	
	    // } catch (IOException e)	{
	    // 	e.printStackTrace();
	    // }


	    /* FileReader
	    The read() method returns an int value which contains the byte value
	    When read() returns -1, there is no more data to be read */
	    // try {
	    // 	FileReader reader = new FileReader("poem.txt");
	    // 	int data = reader.read();
	    // 	while (data != -1) {
	    // 		System.out.print((char) data); // Do not use println!
	    // 		data = reader.read();
	    // 	}
	    // 	reader.close();
	    // } catch (FileNotFoundException e) {
	    // 	e.printStackTrace();
	    // } catch (IOException e)	{
	    // 	e.printStackTrace();
	    // }


	    /* Audio
	    .wav files only */
	    // Audio audio = new Audio();
	    // audio.play("Heal You - Freedom Trail Studio.wav");


	    /* Generics
        Enables types (classes and interfaces) to be parameters when defining classes, interfaces and methods
        Use one version for all reference data types */
   //      Integer[] intArray = {1, 2, 3, 4, 5};
   //      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
   //      Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
   //      String[] stringArray = {"Hello", "Goodbye"};

   //      class Local {
			// <Thing> Thing getFirst(Thing[] array) {
   //      		System.out.println(array[0]);
   //      		return array[0];
   //      	}
   //      }

   //      new Local().getFirst(intArray);
   //      new Local().getFirst(doubleArray);
   //      new Local().getFirst(charArray);
   //      new Local().getFirst(stringArray);

        // Generic classes
        // GenericAnimal <String, Integer> cat = new GenericAnimal("Male", 10);
        // GenericAnimal <String, Integer> dog = new GenericAnimal("Male", 5);
        
        // cat.getAge();
        // dog.getGender();

        /* Serialization
        Process of converting an object into a byte stream
        Persists (i.e. saves the state) of the object after the program exits
        Byte stream can be saved as a platform-independent file (.ser) or sent over a network (to other machines)
        Deserialization is the process of converting a byte stream into an object

        Serialization Steps
        1. Implement Serializable interface in object class
        2. Import java.io.Serializable;
        3. FileOutputStream fileOut = new FileOutputStream(filePath);
        4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        5. out.writeObject(user);
        6. out.close(); fileOut.close();

        Deserialization Steps
        1. Declare object (don't instantiate)
        2. Implement Serializable interface
        3. Import java.io.Serializable;
        4. FileInputStream fileIn = new FileInputSream(filePath);

        Note:
        - Child classes of a parent class that implements Serializable will do so as well
        - Static fields are not Serialized as they belong to the class, not an individual object
        - The class' definition ("class file") itself is not recorded, thus there is a need to cast it as the object type
        - Fields declared as "transient" aren't serialized, they're ignored
        - serialVersionUID is a unique ID that functions like a version number, ensuring that the sender and receiver of a serialized object have matching classes (thus compatible between machines) --> can be declared within the serializable object */
  //       User user = new User("Bob", "builder");
  //       // System.out.println(user.username + user.password);
  //       // user.login();

		// try {
		//   serialize(user);
		// }
		// catch(IOException e) {
		//   e.printStackTrace();
		// }

		// User userDeserialize = null;
		// try {
		//   deserialize(userDeserialize);
		// } catch(IOException e) {
		//   e.printStackTrace();
		// } catch(ClassNotFoundException e) {
		//   e.printStackTrace();
		// }


		/* TimerTask
		Timer: a facility for threads to schedule tasks for future execution in a background thread
		TimerTask: a task that can be scheduled for one-time or repeated execution by a Timer */
		// Timer timer = new Timer();
		// TimerTask task = new TimerTask() {
			
		// 	int counter = 10;

		// 	@Override
		// 	public void run () {
		// 		if (counter > 0) {
		// 			System.out.println(counter);
		// 			counter --;
		// 		} else {
		// 			System.out.println("Lift off!");
		// 			timer.cancel();
		// 		}
		// 	}
		// };

		// // Calendar now = Calendar.getInstance();
		// // now.set(Calendar.SECOND, now.SECOND + 5);
		// // timer.schedule(task, now.getTime()); // arguments: <task, time>
		// // timer.cancel();

		// timer.scheduleAtFixedRate(task, 0, 1000); // arguments <task, firstdelay, period>


		/* Method chaining
		Syntax for invoking multiple method calls in OOP */
		// String name = "   hello";

		// name = name.concat(" world   ").toUpperCase().trim();
		// System.out.println(name);


		/* Enumeration
		Ordered listing of items in a collection */
		// EnumeratorDemo planets = EnumeratorDemo.EARTH;

		// switch (planets) {
		// 	case EARTH:
		// 		System.out.println("You can live here on planet #" + planets.number);
		// 		break;
		// 	default:
		// 		System.out.println("You can't live here");
		// 		break;
		// }


		/* HashMap
		Dictionary*/
		// HashMap<String, String> countries = new HashMap<String, String>();
		
		// countries.put("USA", "Washington DC");
		// countries.put("India", "Delhi");
		// countries.put("Russia", "Moscow");
		// countries.put("China", "Beijing");
		
		// // countries.remove("USA");
		// // countries.clear();
		// // countries.replace("USA", "New York");

		// System.out.println(countries.get("USA"));
		// System.out.println(countries.size());
		// System.out.println(countries.containsKey("Russia"));
		// System.out.println(countries.containsValue("Washington"));

		// for (String i : countries.keySet()) {
		// 	System.out.println(i + "\t" + countries.get(i));
		// }


		/* Recursion */
		// int n = 5;
		// System.out.println(fib(n));


		/* Exception handling
		Exception: an event after execution that disrupts the normal flow of a program */
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter your age: ");
		// int age = scanner.nextInt();

		// try {
		// 	checkAge(age);
		// } catch (Exception e) {
		// 	System.out.println("A problem occurred: " + e);
		// }


		/* Anonymous objects */
		// JFrame frame = new JFrame();
		// ArrayList<JLabel> deck = new ArrayList<JLabel>();

		// for (int i = 1; i <=52; i++) {
		// 	deck.add(new JLabel(new ImageIcon("Playing Cards\\" + i + ".png")));
		// 	frame.add(deck.get(i - 1));
		// }

		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(420, 420);
		// frame.setLayout(new FlowLayout());
		// frame.setVisible(true);


		/* Inner classes
		Classes inside other classes
		Useful if a class should be limited in scope, and classes should be grouped together (e.g. listeners for specific events)
		Usually but not necessarily private */
		// OuterClass outerClass = new OuterClass();
		// OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		// System.out.println(outerClass.x + innerClass.y);
		// innerClass.greeting();


		/* Anonymous inner classes
		Inner class without a name
		Allows changes to one object without having to create an inner class
		Similar syntax to constructor, except there is also a class definition within a block of code
		Good for listeners */
		// Food vegetable = new Food("vegetable") {
		// 	@Override
		// 	public void eat() {
		// 		System.out.println("yuck!");
		// 	}
		// };
		// Food meat = new Food("meat");
		// vegetable.eat();
		// meat.eat();

		// // ActionListener
		// InnerClassFrame frame = new InnerClassFrame();


		/* Threads
		JVM allows an application to have multiple threads (smallest part of a process that can be executed by a scheduler) running concurrently
		Each thread has a priority (threads run alongside the main thread)
		Java Virtual Machine (JVM) continues to execute threads until: a) exit method of class Runtime has been called or b) all user (non-daemon) threads have died
		Daemon thread is a low priority thread that runs in the background*/

		// System.out.println(Thread.activeCount());
		// Thread.currentThread().setName("MAIN");
		// System.out.println(Thread.currentThread().getName());

		// System.out.println(Thread.currentThread().getPriority());
		// Thread.currentThread().setPriority(5); // 1 lowest, to highest

		// System.out.println(Thread.currentThread().isAlive());

		// try {
		// 	for (int i = 3; i > 0; i--) {
		// 	System.out.println(i);
		// 	Thread.sleep(1000);
		// 	}

		// 	System.out.println("Done!");
		// } catch (InterruptedException e) { 
  //  			Thread.currentThread().interrupt(); 
		// }

		// ThreadDemo thread = new ThreadDemo();
		
		// thread.setDaemon(true);
		// System.out.println(thread.isDaemon());

		// thread.start();
		// System.out.println(thread.isAlive());

		// thread.setName("Thread Demo");
		// System.out.println(thread.getName());

		// thread.setPriority(5);
		// System.out.println(thread.getPriority());

		// thread.run();


		/* Multithreading
		Simultaneous execution of threads
		Threads are independent (i.e. exception in one thread will not affect the execution of others */
		// MultithreadDemo thread1 = new MultithreadDemo();

		// ThreadRunnableInterface runnableInterface1 = new ThreadRunnableInterface();
		// Thread thread2 = new Thread(runnableInterface1); // use Runnable to implement threads if you want a parent class other than Thread (i.e. extends otherClass)

		// thread1.start();
		// // thread1.join(1000); // calling thread (i.e. main) waits until thread 1 dies before starting thread 2
		// thread2.start();
	}

	public static void serialize (User user) throws IOException {

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println(user.username + "'s info has been serialized");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println("Serial Version UID: " + serialVersionUID);
	}

	public static void deserialize (User user) throws IOException, ClassNotFoundException {

		FileInputStream fileIn = new FileInputStream("C:\\Coding Notes\\Java\\Java Full Course\\src\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();

		System.out.println(user.username + "'s info has been deserialized");
		System.out.println("User password (made transient): " + user.password);
		user.login();

		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println("Serial Version UID: " + serialVersionUID);
	}

	static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}

	static void checkAge (int age) throws AgeException {

		if (age <= 18) {
			throw new AgeException("You must be 18 or older to sign up");
		} else {
			System.out.println("You are now signed up");
		}
	}
}
