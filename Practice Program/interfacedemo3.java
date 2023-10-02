interface Car{
    static int baseprice=1000;
}



public class interfacedemo3 implements Car {
    void changevalues(){
        int baseprice=2000;
        System.out.println(baseprice);
    }
    
    public static void main(String[] args) {
        new interfacedemo3().changevalues();
    }
}
