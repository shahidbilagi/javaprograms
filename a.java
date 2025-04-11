package accessModifires.package1;
public class a {
    public void msg_public(){
        System.out.println("public method");
    }
    void msg_default(){
        System.out.println("default method");
    }
    protected void msg_proctected(){
        System.out.println("proctected method");
    }
    private void msg_private(){
        System.out.println("private method");
    }
    public static void main(String[] args) {
        a obj = new a();
        obj.msg_public();
        obj.msg_default();
        obj.msg_proctected();
        obj.msg_private();
    }
}