public class demo{
    int x=10;

    public static void main(String[] args){
        demo d1=new demo();
        demo g1=d1;
        demo n1=new demo();
        demo q1=n1;
        q1.x=50;
        System.out.println(d1.x);
        System.out.println(g1.x);
        System.out.println(n1.x);
        System.out.println(q1.x);

    }

}