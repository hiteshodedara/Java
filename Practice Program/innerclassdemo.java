class innerclassdemo {
    class subinnerclass{
        public int m1(){
            System.out.println("hello world");
            return 10;
        }
    }    
    public static void main(String[] args) {
        innerclassdemo o=new innerclassdemo();
        innerclassdemo.subinnerclass so=o.new subinnerclass();
        int i=so.m1();
        System.out.println(i);
    }
}
