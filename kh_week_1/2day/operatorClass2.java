class operatorClass2
{
	public static void main(String[] args)
	{
		// 논리 연산자(true/false)
		/*
			제어문(if, for, while)과 같이 사용

			&&	AND	그리고
			||	OR	또는
			!	NOT	..아닌

			a > b
			a < b
			a >= b
			a <= b
			a == b	같다
		*/

		int num = 0;

		System.out.println("num > 0 && num < 10 = " + (num > 0 && num < 10) );// true
		System.out.println("num > 0 && num > 10 = " + (num > 0 && num > 10) );// false

		System.out.println("num > 0 || num < 10 = " + (num > 0 || num < 10) );
		System.out.println("num > 0 || num > 10 = " + (num > 0 || num > 10) );
		System.out.println("num < 10 || num > 70 = " + (num < 10 || num > 70) );

		System.out.println(" !(num < 0)" + !(num < 0));	// num >= 0

		System.out.println(" !(num > 0 || num < 10) = " + !(num > 0 || num < 10));	// num <= 0 && num >= 10
		System.out.println(" !(num < 0 && num > 10) = " + !(num < 0 && num > 10));	// num >= 0 || num <= 10


		// 삼항 연산자

		// ( 조건 ) ? "참":"거짓";
		int number = 0;

		char c;
		c = (number > 0)?'Y':'N';
		System.out.println("c = " + c);

		int i;
		i = (number < 5)?1:2;

		String str;
		str = (number >= 0)?"0보다 크거나 같다":"0보다 작다";
		System.out.println("str = " + str);



	}
}
