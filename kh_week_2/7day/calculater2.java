import java.util.Scanner;

class calculater2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String num1, num2, oper;	// 1a a 1.2
		int number1, number2;
		int result;
		int w;
		boolean suc;

		// 1. init
		num1 = num2 = oper = "";
		result = 0;
		w = 0;
		suc = true;

		// 2. input

		// 첫번째 수 입력
		boolean b = false;
		boolean out = false;

		while(out == false){
			b = false;
			System.out.print("첫번째 수:");
			num1 = sc.next();

			// 검사
			for(int i = 0;i < num1.length(); i++){
				char c = num1.charAt( i );
				if((int)c < 48 || (int)c > 57)
				{	// 문자가 있을 때
					b = true;
					break;
				}
			}
			if(b == true){
				System.out.println("숫자가 아닙니다 다시 입력하세요");
				continue;
			}
			// 탈출한다
			out = true;
		}
		System.out.println("첫번째 수 = " + num1);

		// 연산자 입력( + - * / )
		while(true){
			System.out.print("(+, -, *, /) = ");
			oper = sc.next();

			if(oper.equals("+") || oper.equals("-")
				|| oper.equals("*") || oper.equals("/") )
			{
				break;
			}
			else{
				System.out.println("연산자가 아닙니다 다시 입력하세요");
			}
			/*
			if(oper.charAt(0) == '+' ||
				oper.charAt(0) == '-' ||
				oper.charAt(0) == '*' ||
				oper.charAt(0) == '/'){
				break;
			}
			else{
				System.out.println("연산자가 아닙니다 다시 입력하세요");
			}*/
		}
		System.out.println("연산자 = " + oper);

		// 두번째 수 입력
		b = false;
		out = false;
		while(out == false){
			b = false;
			System.out.print("두번째 수:");
			num2 = sc.next();

			// 검사
			for(int i = 0;i < num2.length(); i++){
				char c = num2.charAt( i );
				if((int)c < 48 || (int)c > 57)
				{	// 문자가 있을 때
					b = true;
					break;
				}
			}
			if(b == true){
				System.out.println("숫자가 아닙니다 다시 입력하세요");
				continue;
			}
			if(oper.equals("/") && num2.equals("0")){
				System.out.println("0으로 나눌수는 없습니다");
				continue;
			}

			// 탈출한다
			out = true;
		}
		System.out.println("두번째 수 = " + num2);
		number1 = Integer.parseInt( num1 );
		number2 = Integer.parseInt( num2 );
		// 3. process
		char chOper = oper.charAt(0);
		switch (chOper)
		{
			case '+':
				result = number1 + number2;
				break;
			case '-':
				result = number1 - number2;
				break;
			case '*':
				result = number1 * number2;
				break;
			case '/':
				result = number1 / number2;
				break;
		}

		// 4. result
		System.out.println(number1 + " " + oper +
				" " + number2 + " = " + result );


	}
}
