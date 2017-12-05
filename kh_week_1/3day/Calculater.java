import java.util.Scanner;
// 계산기 예제
class Calculater
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int num1, num2;
		int result;
		String oper;


		System.out.print("number1 = ");
		num1 = sc.nextInt();


		System.out.print("+, -, *, / = ");
		oper = sc.next();


		System.out.print("number2 = ");
		num2 = sc.nextInt();
//equals() 메소드를 통해 문자열 비교 !   == 연산자로 문자열은 비교 불가
		if(oper.equals("+")){
			result = num1 + num2;
		}
		else if(oper.equals("-")){
			result = num1 - num2;
		}
		else if(oper.equals("*")){
			result = num1 * num2;
		}
		else{
			result = num1 / num2;
		}

		System.out.println(num1 + " " +oper+ " " +num2 + "  :" + result);

	}

	static int Process(int n1, int n2, String s) {
		if (s == '+') {
		n1 + n2 = s;
		System.out.println("더하기" + s)
	}
		if(s == '-') {
			n1 - n2 = s;
			System.out.println("빼기" + s)
		}
		if(s == '*') {
			n1 * n2 = s;
			System.out.println("곱하기" + s)
		}
		if(s == '/') {
			n1 / n2 = s;
			System.out.println("나누기" + s)
		}


		}

}
