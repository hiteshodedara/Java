class paranttest{
    public void marry(){
        System.out.println("i am parent you will marry with that girl");
    }
}
class childtest extends paranttest{
    public void marry(){
        System.out.println("i am child i marry with my loved one girl");
    }
}
public class methodoverridingdemo2 {
    public static void main(String[] args) {
        paranttest c=new childtest();
        c.marry();
    }
}
