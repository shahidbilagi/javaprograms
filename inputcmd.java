public class inputcmd{
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        String op=args[1];
        int y = Integer.parseInt(args[2]);
        int z = 0;
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
        }
        System.out.println(z);
    }
}