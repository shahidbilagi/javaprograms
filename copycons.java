public class copycons {
    int i;
    int j;
    copycons(int i,int j)
    {
        this.i=i;
        this.j=j;
        System.out.println("parameterized constructor called");
    }
    copycons(copycons a)
    {
        i=a.i;
        j=a.j;
        System.out.println("copy constructor called");
    }
public void display()
    {
        System.out.println(i);
        System.out.println(j);
    }
public static void main(String[] args) {
    copycons c1 = new copycons(4,6);
    copycons c2 = new copycons(c1);
    c1.display();
    c2.display();
}

}