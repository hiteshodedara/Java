public class warrperdemo3 {
    public static void main(String[] args) {
        Integer s1=new Integer(10);
        Integer s2=new Integer(10);
        System.out.println(s1==s2);

        Integer s3=10;
        Integer s4=10;
        System.out.println(s3==s4);

        Integer s5=Integer.valueOf(10);
        Integer s6=Integer.valueOf(10);
        System.out.println(s5==s6);

        Integer s1=127;
        Integer s2=127;
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        int var=42;
        int var2=~var;
        System.out.println(var2);
        byte x = 64;       
              int i;     
                      byte y; 

             i = x << 2;    
                      y = (byte) (x << 2);       
                            System.out.print(i + " " + y);
    }
}
