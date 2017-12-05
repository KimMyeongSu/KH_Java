class test
{	// 영역

	// java 특징 : class 로 구성되어 있다
	// c언어 특징 : 함수로 구성된다.

	// 대중적인 정적<-->동적 아무 형태도 없음(void) 중심(인수, 인자, parameter)
	public static void main(String[] args)
	{
		// 1
		System.out.println("Hello World!");	// ln = line 출력용 함수

		// 2
		/*
		System.out.print("Hello");	// 개행 처리가 되지 않는 함수
		System.out.print("World");
		/**/

		// 3

		System.out.println("Hello");	// 개행 처리가 되지 않는 함수
		System.out.println("World");

		System.out.println("Hello" + "World!");
		/**/


		// 주석문 : 프로그램 compile이 되지 않도록 하는 문장
		//			한줄 주석문 //
		//			범위 주석문 /*	*/
		//			설명, 해석, 분석
		/*
			oracle	--
			html	<!--		-->
			jsp		<%--        --%>
		*/


		/*
			문자열, 숫자, 문자, true/false
		*/

		// class 명 : System  out : 변수  println : 함수
		System.out.println("문자열");
		System.out.println('문');
		System.out.println('A');	// A
		System.out.println("A");	// A/0
		System.out.println( 123 );
		System.out.println( 123.4567 );




	}

}
