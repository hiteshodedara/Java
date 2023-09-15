public class staticblockdemo {
    static{
        System.out.println("i am static block 1");
    }
    public static void main(String[] args) {
        System.out.println("i am main method");
    }

    static{
        System.out.println("i am static block 2");
    }
}
