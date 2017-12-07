class Break
{
	public static void main(String[] args)
	{

		/*
			break == 탈출

			switch, for, while

			switch( 변수 ){
				case 값1:
					처리
					break;
			}

			for(int i = 0;i < 10; i++){ -> 10 loop
				5번째 break;
			}

			while( 조건식 ){

				break;
			}
		*/

		for(int i = 0;i < 10; i++){
			System.out.println("i = " + i);
			if(i == 4){
				break;
			}
		}

		char c[] = { 'a', 'b', 'c', 'd' };

		for(int i = 0;i < c.length; i++){
			System.out.println(i + ":");
			if(c[i] == 'c'){
				System.out.println("문자 'c'를 찾았습니다");
				break;
			}
		}

		for(int i = 0;i < 10; i++){
			System.out.println("i = " + i);
			for(int j = 0;j < 10; j++){
				System.out.println("\t j = " + j);
				if(i == 4 && j == 2){
					break;
				}
			}
		}


		// 1. 이중 for문 탈출 방법

		boolean b = false;

		for(int i = 0;i < 10; i++){
			System.out.println("i = " + i);
			for(int j = 0;j < 10; j++){
				System.out.println("\t j = " + j);
				if(i == 4 && j == 2){
					b = true;
				}
				if(b == true){
					break;
				}
			}
			if(b == true){
				break;
			}
		}

		// 2. 이중 for문 탈출 방법 = goto

		out:for(int i = 0;i < 10; i++){
			System.out.println("i = " + i);
			for(int j = 0;j < 10; j++){
				System.out.println("\t j = " + j);
				if(i == 4 && j == 2){
					break out;
				}
			}
		}
	}
}
