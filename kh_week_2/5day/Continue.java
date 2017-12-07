class Continue
{
	public static void main(String[] args)
	{

		/*
			continue : 생략 == skip

			for, while loop문과 같이 사용

			코드1
			코드2
			continue
			코드3
		*/

		for(int i = 0;i < 10; i++){
			System.out.println("i = " + i);
			System.out.println("loop start");

			if(i > 5) continue; //반복은 진행하되 해당조건에서만 스킵 

			System.out.println("loop end\n");
		}

		// for, while

		int w = 0;
		while(w < 10){

			System.out.println("w = " + w);
			System.out.println("while start");

			if(w > 5) continue;

			System.out.println("while end");
			w++;
		}



	}
}
