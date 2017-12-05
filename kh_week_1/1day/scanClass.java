import java.util.Scanner;

class scanClass
{
	public static void main(String[] args)
	{
		// 입력받기 위해서 준비
		Scanner scan = new Scanner(System.in);

		// 입력
		// boolean	= true/false
		boolean b;
		System.out.print("true/false = ");
		b = scan.nextBoolean();	// true/false 입력 함수
		System.out.println("b = " + b);	// 출력 확인

		// int = 정수
		int num;
		System.out.print("정수 숫자 = ");
		num = scan.nextInt();
		System.out.println("num = " + num);

		// double = 실수
		double d;
		System.out.print("소수 숫자 = ");
		d = scan.nextDouble();
		System.out.println("d = " + d);

		// String = 문자열
		String str;

		System.out.print("문자열 = ");
		str = scan.next();
		System.out.println("str = " + str);

		System.out.print("문자열 = ");
		str = scan.nextLine();
		System.out.println("str = " + str);


	}
}
