import java.util.Scanner;

public class interactive_switch {

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
            switch(op){
                case "+": z=x+y;
                break;
                case "-": z=x-y;
                break;
                case "*": z=x*y;
                break;
                case "/": z=x/y;
                break;
                case "%": z=x%y;
                break;
                default: System.out.println("Invalid choice...!");
            }
            System.out.println(z);
        }
}
