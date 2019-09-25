package edu.uah.cs.cs321;

/**
 * This main program (Main.java) is a test driver to test cloning in our Greeter Class
 * Note that the Greeter class when it implements clone has to throw an exception. It is an
 * exception that must be checked in your code in order to compile. In other words,
 * Java makes us include a try/catch around the problem, even though I will let it crash.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Greeter g1 = new Greeter("Beth");
        Greeter g2;
        g2 = g1;

        System.out.println("Before change name: ");
        System.out.println(g1.sayHello() + " and " + g2.sayHello());

        g2.changeName("David");
        System.out.println("After change g2 name: ");
        System.out.println(g1.sayHello() + " and " + g2.sayHello());

        g1.changeName("Beth");  // change my name back to beth !
        try {
            g2 = (Greeter) g1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        g2.changeName("David");
        System.out.println("After cloning and change g2 name: ");
        System.out.println(g1.sayHello() + " and " + g2.sayHello());


        System.out.println("\nGoodbye!");
    }
}
