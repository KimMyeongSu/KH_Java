import java.util.Scanner;

class Student
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int arrData[][];
		int count;

		//	국어, 수학, 영어 -> 3과목

		//	학생수 -> 입력
		while(true){
			System.out.print("학생수 = ");
			count = sc.nextInt();
			if(count > 0){
				break;
			}else{
				System.out.println("학생수가 너무 적습니다. 다시 입력해 주세요");
			}
		}

		arrData = new int[count][3];

		//	학생들의 성적을 입력	-> -1가 입력이 되지 않도록 막아주시고
		int w = 0;
		String title[] = { "국어점수:", "영어점수:", "수학점수:" };

		for(int i = 0;i < arrData.length; i++)
		{
			w = 0;
			while(w < arrData[0].length){
				System.out.print((i + 1) + " 번째 사람의 " + title[w]);
				arrData[i][w] = sc.nextInt();

				if(arrData[i][w] < 0){
					System.out.println("잘못 입력하셨습니다 다시 입력해 주십시오");
					continue;
				}

				w++;
			}
			System.out.println();
		}

		// 데이터 출력
		for(int i = 0;i < arrData.length; i++)
		{
			for(int j = 0;j < arrData[0].length; j++){
				System.out.print(arrData[i][j] + " ");
			}
			System.out.println();
		}

		int allSum = 0;

		//	모든 점수의 총점
		for(int i = 0;i < arrData.length; i++)
		{
			for(int j = 0;j < arrData[0].length; j++){
				allSum = allSum + arrData[i][j];
			}
		}
		System.out.println("총점:" + allSum);

		//	모든 점수의 최고 점수
		int topMax = arrData[0][0];

		for(int i = 0;i < arrData.length; i++)
		{
			for(int j = 0;j < arrData[0].length; j++){
				if(topMax < arrData[i][j]){
					topMax = arrData[i][j];
				}
			}
		}
		System.out.println("최고 점수:" + topMax);

		//	국어 점수의 총점
		int langSum = 0;
		for(int i = 0;i < arrData.length; i++)
		{
			langSum = langSum + arrData[i][0];
		}
		System.out.println("국어 점수의 총점:" + langSum);

		//	수학 점수의 총점
		//	영어 점수의 총점

		//	국어의 최고 점수
		int langMax = arrData[0][0];
		for(int i = 0;i < arrData.length; i++)
		{
			if(langMax < arrData[i][0]){
				langMax = arrData[i][0];
			}
		}
		System.out.println("국어의 최고 점수:" + langMax);

		//	수학의 최저 점수
		int mathMin = arrData[0][2];
		for(int i = 0;i < arrData.length; i++)
		{
			if(mathMin > arrData[i][2]){
				mathMin = arrData[i][2];
			}
		}
		System.out.println("수학의 최저 점수:" + mathMin);

		// 영어의 평균
		double engAvg;
		int engSum = 0;

		for(int i = 0;i < arrData.length; i++)
		{
			engSum = engSum + arrData[i][1];
		}
		engAvg = (double)engSum / arrData.length;
		System.out.println("영어의 평균:" + engAvg);


		/*
			int Datas[][] = {
				{95, 80, 100},
				{75, 85, 90},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
			}	국어 영어 수학

		*/
	}
}
