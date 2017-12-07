import java.util.Scanner;

class minMaxAvg
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// 10개 숫자 입력(1 ~ 100) -> 최대값, 최소값, 합계, 평균
		// 숫자가 정상적인 숫자인지 검사

		String strNum[] = new String[10];
		int number[] = new int[10];
		int max, min;
    int total, avg;

	//	strNum.length		// 배열 길이
	//	strNum[0].length()	// String 길이

		max = min = 0;

		// input + 검사
		int w = 0, n;
		boolean b;

		while(w < strNum.length){
			b = false;
			System.out.print((w + 1) + "번째 수 = ");
			strNum[w] = sc.next();

			// 모든 문자가 숫자로 되어 있는지 검사
			for(int i = 0;i < strNum[w].length(); i++){
				char c = strNum[w].charAt( i );
				if((int)c < 48 || c > 57){
					b = true;
					break;
				}
			}

			// 1 ~ 100 사이의 숫자 검사
			if(b == false){
				int checkNum = Integer.parseInt(strNum[w]);
				if(checkNum < 1 || checkNum > 100){
					b = true;
				}
			}

			if(b == true){
				System.out.println("문자가 섞여있거나 범위를 벗어났습니다");
				continue;
			}

			w++;
		}


		// String -> Integer
		for(int i = 0;i < strNum.length; i++){
			number[i] = Integer.parseInt(strNum[i]);
		}

		// max
		max = number[0];
		for(int i = 0;i < number.length; i++){
			if(max < number[i]){
				max = number[i];
			}
		}

		// min
		min = number[0];
		for(int i = 0;i < number.length; i++){
			if(min > number[i]){
				min = number[i];
			}
		}
    // total
    total =0;
    for(int i = 0;i < number.length; i++){
      total += number[i];
    }

    //avg
    avg = total / number.length;

		for(int i = 0;i < number.length; i++){
			System.out.println("number[" + i + "] = " + number[i]);
		}

		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
    System.out.println("합계  = " + total);
    System.out.println("평균  = " + avg);




	}
}
