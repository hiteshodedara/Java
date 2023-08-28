class piramid{

public static final int height = 5;

public static void main(String[] args) {
	String y = Character.toString( 128_512 );
	int width = 5;

	int space = width*5;

	int x = 1;

	for(int a = 1;a <= height ;a++){

	for(int i = x;i <= width;i++){

		for(int j = space;j >= i;j--){

		System.out.print(" ");
		}

		for(int k = 1;k <= i;k++){

		System.out.print(y+" ");
		}

		System.out.println();
	}

	x = x+2;
	width = width+2;
	}


	for(int i = 1;i <= 4;i++){

	for(int j = space+2;j >= 1;j--){
		
		System.out.print(" ");
	}

	for(int k= 1;k <= 2;k++){
		System.out.print(y+" ");
	}

	System.out.println();
	}
}
}
