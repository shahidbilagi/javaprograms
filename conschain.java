public class conschain {
    String name;
    int rollno;
    String course;


    conschain() {
        name = "shahid";
        System.out.println(name);  
    }


    conschain(String name, int rollno, String course) {
        this();  
        this.name = name;
        this.rollno = rollno;
        this.course = course;
        System.out.println("name: " + name + " rollno: " + rollno + " course: " + course);
    }

    public static void main(String[] args) {
        conschain c1 = new conschain("shahid", 180, "bca");
    }
}