package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of HW1");

        // This is our Main Method. Any code we write here will be executed when we run the program.
        // Write some code here to print out "Hello World" to the console.
        System.out.println("Start of HW1");
        System.out.println("Hello World");
        System.out.println(2 + 3);
        Pyramid.Output();
        Adlibs lib = new Adlibs();
        System.out.println(lib.story("Joe", 18, "Blue"));
        Replace rep = new Replace(); 
        System.out.println(rep.charReplace("I MAKE BREAD", 2, 'T'));
        // Write some code here to print out the sum of 2 and 3 to the console.

        // You will see another file called Pyramid.java
        // Write some code here to call the Output method from the Pyramid class.
        // Note: Since Pyramid is a static method you will need to call it like this:
        // Class.Method()
        // Note2: Look at Pyramid.java for more information


        // Now look at the next file called Adlibs.java
        // Write some code here to call the story method from the Adlibs class.
        // Note: Since story is not a static method you will need to create an object of the Adlibs class
        //       and then call the method on that object.
        // Remember to create an object like this:
        // ClassName ObjectName = new ClassName();
        // Remember to call objects like this:
        // Object.Method()
        // Note2: the story method returns a String type so you will
        //       need to print out the result of the method call.
        // Note3: Look at Adlibs.java for more information


        // Finally look at File called Replace.java. This is a little more difficult.
        // Write some code here to call the charReplace method from the Replace class.
        // Note: Since charReplace is not a static method you will need to create an object of the Replace class
        //       and then call the method on that object.
        // Remember to create an object like this:
        // ClassName ObjectName = new ClassName();
        // Remember to call objects like this:
        // Object.Method()
        // Note2: the charReplace method returns a String type so you will
        //       need to print out the result of the method call.
        // Note3: Look at Replace.java for more information
        







    }
}
