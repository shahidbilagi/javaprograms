public class constructor {
    String name;
    int id;
    int age;
    constructor(String n, int i, int a) {// parameterized constructor
        name = n;
        id = i;
        age = a;
    }
    public static void main(String[] args) {
        constructor s1 = new constructor("ravi", 109, 29);
        System.out.println("Name: " + s1.name + " \nID: " + s1.id + "\nAge: " + s1.age);
    }
}