public class addn {
   public void add(int a,int b){
    System.out.println(a+b);
   }
   public void add(int a,int b,int c){
    System.out.println(a+b+c);
   }
   public void add(double a,double b){
    System.out.println(a+b);
   }
   public static void main(String[] args) {
    addn obj = new addn();
    obj.add(2, 4);
    obj.add(2, 4, 10);
    obj.add(2.4, 7.6);
   }

}