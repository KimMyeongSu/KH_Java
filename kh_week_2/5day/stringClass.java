class stringClass
{
	public static void main(String[] args)
	{
		/*
			String = 문자열 저장, 편집, 정보

			int char double boolean

			클래스 : 사용자 지정 클래스
		*/

		char arrC[] = {	'H', 'e', 'l', 'l', 'o'	};

		for(int i = 0;i < arrC.length; i++){
			System.out.print(arrC[i]);
		}
		System.out.println();

		String str;	// String 클래스 == Object(객체)
		// str == 변수, 클래스 변수(객체)(instance == 주체)
		str = "Hello";
		System.out.println("str = " + str);

		String str1 = new String("Hello");
		System.out.println("str1 = " + str1);

		String str2;
		char data[] = { 'H', 'e', 'l', 'l', 'o' };
		str2 = new String( data );
		System.out.println("str2 = " + str2);

		String str3 = str1 + str2;
		System.out.println("str3 = " + str3);


		// String 기능들
		/*
			기능 == process(처리) -> method(함수)
		*/

		// equals 문자열이 같은지 다른지
		String str4, str5;

		str4 = "world";
		str5 = "worl";

		str5 = str5 + "d";

		System.out.println("str5 = " + str5);
		/*
		if(str4 == str5){
			System.out.println("str4와 str5는 같은 문자열입니다");
		}
		*/

		if(str4.equals( str5 ) == true){
			System.out.println("str4와 str5는 같은 문자열입니다");
		}

		// indexOf 특정 문자가 몇번째 위치인지 그 위치의 index
		// char arr[] = "hello";

		String str6 = "abcabcabc";
		int r = str6.indexOf( "c" );
		System.out.println("r = " + r);

		// lastIndexOf 특정 문자가 몇번째 위치인지 그 위치의 index (뒤쪽부터)
		r = str6.lastIndexOf("b");
		System.out.println("r = " + r);

		// length
		int len = str6.length();
		System.out.println("len = " + len);

		/*
			함수 = 특정 처리를 위해서 제작
			return = 함수명( 인수, 인자, Parameter )
							들어가는 값
			함수명( 인수 )
			함수명( 인수, 인수 )
			함수명( 인수, 인수, 인수 )
		*/

		String str7 = null;
		int i;
		i = 0;

		len = "Hello World".length();	// nul == \0   null
		System.out.println("len = " + len);

		// ff af 34 f4 ff 1f 0f 1f
		// 00 00 00 00 00 00 00 00	-> null

		// replace 수정
		str7 = "A*B*C*D";
		String repStr = str7.replace("*","");
		System.out.println("repStr = " + repStr);

		str7 = "의료진의 인권을 좀 더 설명해달라.\n헬기 탈때마다  다리 긁혀서 수술 들어간다. 에이즈 환자를 아무런 사전 정보 없이 수술한 적도 있다. 사전검사가 나오는 키트를 쓰려면 그 키트는 의료보험 삭감 대상이다. 다리에 상처가 생긴 채로 피를 온몸에 뒤집어쓰면서 수술한다. ";
		repStr = str7.replace("  ", "");
		System.out.println("repStr = " + repStr);


		// split
		/*
			split -> token을 활용해서 문자열을 자르는 작업

			홍길동-24-2001/10/14-서울시	- token
			홍길동:24:2001/10/14:서울시	: token
			+ / \

			홍길동
			24
			2001/10/14
			서울시

			Tokener - class
		*/

		String str8 = "홍길동-24-2001/10/14-서울시";
		String splits[] = str8.split("-");
		/*
		System.out.println("splits[0] = " + splits[0]);
		System.out.println("splits[1] = " + splits[1]);
		System.out.println("splits[2] = " + splits[2]);
		System.out.println("splits[3] = " + splits[3]);
		*/

		for(int i1 = 0;i1 < splits.length; i1++){
			System.out.println("splits[" + i1 + "] = " + splits[i1]);
		}

		// 문자열 -> 대문자	Abc -> abc
		// toUpperCase
		String str9 = "abcDEF";
		String upStr = str9.toUpperCase();
		System.out.println("upStr = " + upStr);

		// 문자열 -> 소문자
		// toLowerCase
		String lowStr = str9.toLowerCase();
		System.out.println("lowStr = " + lowStr);

		int n = 65;		// ASCII = 아스키코드
		char c = (char)n;
		System.out.println("c = " + c);

		char ch = 'a';
		int asccode = ch;
		System.out.println("asccode = " + asccode);

		// A = 65 a = 97
		asccode = asccode - 32;
		ch = (char)asccode;
		System.out.println("ch = " + ch);



		// toString() 문자열 return
		String str10 = "반갑습니다";
		System.out.println("str10 = " + str10.toString());
		System.out.println("str10 = " + str10);


		// trim 앞뒤의 공백을 없애주는 메소드
		String str11 = "      java java  java  ";
		String trimStr = str11.trim();
		System.out.println("---" + trimStr + "---");


		// valueOf	숫자 -> 문자열
		/*
			213213123 -> "213213123"
			"213213123" -> 213213123
		*/

		int num = 123;
		long lo = 1234L;
		double d = 123.456789;

		String iStr = String.valueOf(num);
		System.out.println("iStr = " + iStr);

		String lStr = String.valueOf(lo);
		System.out.println("lStr = " + lStr);

		String dStr = String.valueOf(d);
		System.out.println("dStr = " + dStr);

		String _Str = num + "";
		System.out.println("_Str = " + _Str);

		// contains -> 문자열 찾기 true/false 탐색
		String str12 = "서울시 강남구";
		String findStr = "서울";
		boolean b1 = str12.contains( findStr );
		if(b1 == true){
			System.out.println("문자열을 찾았습니다");
		}
		else{
			System.out.println("문자열을 찾지못했습니다");
		}

		// charAt( index )
		// String str = "abcdef";	0
		String str13 = "가나다라마";
		char ch1 = str13.charAt( 1 );
		System.out.println("ch1 = " + ch1);

		// concat
		// "abc" "def" -> "abcdef"

		String str14 = "abc";
		String str15 = "def";

		String conStr = str14.concat( str15 );
		System.out.println("conStr:" + conStr);

		// conStr = str14 + str15;


	}
}
