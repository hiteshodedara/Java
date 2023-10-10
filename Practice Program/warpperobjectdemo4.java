public class warpperobjectdemo4 {
    public static void m1(Integer i){
        System.out.println("autoboxing...");
    }
    public static void m1(long i){
        System.out.println("widening...");
    }
    public static void main(String[] args) {
        int x=10;
        m1(x);
        
    }
}
