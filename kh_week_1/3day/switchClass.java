class switchClass
{
	public static void main(String[] args)
	{
		/*
			switch : 값은 명확해야 한다  ex) num == 2
				    	 범위 값은 사용할 수 없다 ex) < > <= >= !



			switch( 변수 ){
				case 값1:	if(변수 == 값1)
					처리
					break;
				case 값2:	else if(변수 == 값1)
					처리
					break;
				default:	else	생략가능
					처리
			}
		*/

		int number = 90;

		switch( number ){
			case 100:		// if(number == 100)
				System.out.println("A++입니다");
				break;
			case 90:
				System.out.println("A입니다");
				break;
			case 80:
				System.out.println("B입니다");
				break;
			case 70:
				System.out.println("C입니다");
				break;
			default:
				System.out.println("대상 점수가 없습니다");
		}

		char c = 'B';

		switch( c ){
			case 'A':
				System.out.println("문자는 A입니다");
				break;
			case 'B':
				System.out.println("문자는 B입니다");
				break;
			case 'C':
				System.out.println("문자는 C입니다");
				break;
		}

		/*
		double d = 123.456;	// 실수는 불가능
		switch( d ){
			case 123.456:
				System.out.println("d = " + d);
				break;
		}
		*/

		String str = "abc";

		str = str + "def";

		switch( str ){
			case "abcdef":	// if(str == "abc")
				System.out.println("str = " + str);
				break;
		}

		if(str == "abcdef"){
			System.out.println("str == " + str);
		}



	}
}
