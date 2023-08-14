package Paracticeprogs;

interface  hello1{
	public count() {
		int a=10;
		return a;
	}
	
	
}

class hello extends hello1{
	
}
 class chartypeprect1 {

	public static void main(String[] args) {
		
		hello hi=new hello();
		int a=hi.count();
		System.out.println(a);
		
		
	}



}
