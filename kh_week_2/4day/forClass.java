class forClass
{
	public static void main(String[] args)
	{
		/*
			for : loop

			for(초기화(1); 조건(4)(7)(10) ; 연산식(3)(6)(9))
			{
				// 처리(2)(5)(8)
			}

			(11)
		*/

		int i;

		for(i = 0; i < 10; i++){
			System.out.println("loop:" + i);
		}

		System.out.println("end:" + i);

		int number = 0;
		/*
		number = number + 1;
		number = number + 1;
		number = number + 1;
		number = number + 1;
		number = number + 1;

		number = number + 1;
		number = number + 1;
		number = number + 1;
		number = number + 1;
		number = number + 1;
		*/

		for(i = 0;i < 10; i++){
			number = number + 1;
		}

		number = 0;
		for(i = 1; i <= 10; i++){
			number = number + i;
		}

		number = 0;
		int n = 0;

		for(i = 0;i < 10; i++){
			n++;
			number = number + n;
		}

		System.out.println("number = " + number);


		for(int j = 10;j > 0; j--){
			System.out.println("j = " + j);
		}

		for(int j = 0;j < 10; j = j + 2){
			System.out.println("j = " + j);
		}

		/*
		for(int j = 0;  ; j++){
			System.out.println("j = " + j);
		}
		*/

		/*
			init	- 초기화
			loop	- 무한루프
				callback - 자동호출

			release	- 해방(메모리)
		*/

		int count = 0;
		for(	;count < 10;   ){
			System.out.println("count = " + count);
			count++;
		}

		int n1, n2;

		for(int j = 0, k = 10; j < 10; j++, k--){
			System.out.println("j = " + j);
			System.out.println("k = " + k);
		}

		// if 이중 if
		int num = 20;
		if(num > 10 && num <= 20){
			if(num < 15){
			}
			else{
			}
		}
		else if(num > 20 && num <= 30){
		}

		// 이중 for
		/*
		for(int j = 0(1);j < 10; j++){
			// j = 0 1 2 3 ~ 9

			for(int k = 0(2);k < 5(5); k++(4)(7)){
				// k = 0 1 2 3 4
				(3)(6) 처리
			}

		}
		*/

		for(int j = 0;j < 10; j++){
			// j = 0 1 2 3 ~ 9
			System.out.println("j = " + j);

			for(int k = 0;k < 5; k++){
				// k = 0 1 2 3 4
				System.out.println("\t k = " + k);
			}

		}

	}
}
