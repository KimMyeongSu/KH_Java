class whileClass
{
	public static void main(String[] args)
	{
		/*
			while == loop

			초기화
			while( 조건식 == true/false ){		if( 조건식 ){
				처리					처리
				연산식
			}		}

			for(초기화 ; 조건식 ; 연산식){
				처리
			}
		*/

		int w;

		w = 0; // 초기화
		while(w < 10){	// 조건식
			System.out.println("while loop:" + w);
			w++;
		}

		// application

		// initialize == 초기화
		w = 0;

		// loop	-- 순환
		/*
		while(true){
			// 처리들
			System.out.println("while loop:");
		}
		*/

		// release -- 해방

		// 2중 while

		int w1, w2;

		w1 = w2 = 0;

		while(w1 < 10){
			System.out.println("while loop:" + w1);
			w2 = 0;
			while(w2 < 5){
				System.out.println("\t while loop:" + w2);
				w2++;
			}
			w1++;
		}

		for(int i = 0;i < 10; i++){
			System.out.println("for loop:" + i);
			for(int j = 0;j < 5; j++){
				System.out.println("\t for loop:" + j);
			}
		}

		// do while

		/*
			do{
				처리
				연산식
			}while(조건식);
		*/

		int w3 = 0;

		do{
			System.out.println("do while:" + w3);
			w3++;
		}while(w3 < 10);



		/*

		*
		**
		***
		****
		***
		**
		*

		*/

		int w4, w5;
		int temp;

		w4 = w5 = 0;
		temp = 0;

		while(w4 < 7){

			if(w4 < 4) temp++;
			else		temp--;

			w5 = 0;
			while(w5 < temp){
				System.out.print("*");
				w5++;
			}
			System.out.println();
			w4++;
		}


	}
}
