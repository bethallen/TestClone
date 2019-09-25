package edu.uah.cs.cs321;

/**
 * This version of edu.uah.cs.cs321.Greeter implements the Cloneable interface
 */
public class Greeter implements Cloneable{
    private String name;

    public Greeter (String nm) {
        name = nm;
    }

    public Object clone() throws CloneNotSupportedException
    {
        // since I don't have any special fields that I have to work with I can use the default field by field copy
        // strings are immutable both other field types are not.
        return super.clone();
    }

    public void changeName(String newName) {
        name = newName;
    }

    public String sayHello() {
        return "Hello, " + name;
    }
}
