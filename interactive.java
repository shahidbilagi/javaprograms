import java.util.Scanner;

public class interactive {
    public static void main(String[] args) {
        int x,y,z=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter operand1: ");
        x=scan.nextInt();
        System.out.println("enter operand2: ");
        y=scan.nextInt();
        System.out.println("enter operator which you want to prefer(+,-,*,/,%)");
        String op=scan.next();
        scan.close();
        if (op.equals("+")) {
            z=x+y;
        }
        else if (op.equals("-")) {
            z=x-y;
        }
        else if (op.equals("/")) {
            z=x*y;
        }
        else if (op.equals("/")) {
            z=x/y;
        }
        else if (op.equals("%")) {
            z=x%y;
        }
        else{
            System.out.println("Invalid operator");
        }
        System.out.println(z);
    }
}