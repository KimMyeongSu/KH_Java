class wrapperClass
{
	public static void main(String[] args)
	{
		/*
			Wrapper Class
			일반 자료형을 클래스화한 것이다.

			일반 자료형
			boolean		Boolean

			byte		Byte
			short		Short
			int			Integer	------------
			long		Long

			float		Float
			double		Double	------------

			char		Character
			char[]		String	------------

				valueOf
				숫자 -> 문자열
				valueOf( '1' ) -> "1"
				valueOf( 123 ) -> "123"
				valueOf(234.5676) -> "234.5676"

				toString()
		*/

		// Integer == int
		int i = 25;
		Integer iObj = new Integer( i );
	//	int num1 = iObj.intValue();
		int num1 = iObj;

		System.out.println("num1 = " + (num1 + 2));
		System.out.println("iObj.toString() = " + (iObj.toString() + 2));

		// 숫자 -> 문자열
	//	iObj.toString();
	//	Short sh = 23;
	//	sh.toString();

		// 문자열 -> 숫자
		String str1 = "234";
		int num2 = Integer.parseInt( str1 );

		System.out.println("num2 = " + (num2 + 2));


		// 실수
		Double d = 234.5678;
		Double d1 = new Double( 234.5678 );

		// valueOf
		// toString()		d1 + ""

		String str2 = "345.6789";
		double d2 = Double.parseDouble( str2 );

		System.out.println("d2 = " + (d2 + 2));

	//	String ss = "Hello";
	//	String ss1 = new String("Hello");


	}
}
