class operatorClass
{
	public static void main(String[] args)
	{
		/*
			operator :	연산자(기본)
						=
						int a, b;
						b = a;

						+ - * / %

						8 / 2 = 4
		*/

		int num1, num2;
		int result;

		num1 = 25;
		num2 = 7;

		// +
		// num1 + num2 = result;
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

		// -
		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);

		// *
		result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);

		// /
		result = num1 / num2;	// 몫
		System.out.println(num1 + " / " + num2 + " = " + result);

		// %	== 나눈 나머지
		result = num1 % num2;	// 나머지	-> 4
		System.out.println(num1 + " % " + num2 + " = " + result);

		// 주의점	/, %
		num1 = 2;
		num2 = 0;
	//	result = num1 / num2;
	//	System.out.println(num1 + " / " + num2 + " = " + result);

	//	result = num1 % num2;
	//	System.out.println(num1 + " % " + num2 + " = " + result);


		num1 = 0;
		num1 = num1 + 2;
		System.out.println(num1);
		num1 = num1 + 2;
		System.out.println(num1);
		num1 += 2;
		System.out.println(num1);

		// increment(증가연산) decrement(감소연산)
		//	++				--
		num1 = 0;
		num1++;		// num1 = num1 + 1;
		System.out.println("num1 = " + num1);

		++num1;
		System.out.println("num1 = " + num1);

		num1--;		// num1 = num1 - 1;
		System.out.println("num1 = " + num1);
		--num1;

		// 주의
		int a, b;
		a = 1;

		a++;
		b = a;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = 1;
		b = a++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = 1;
		b = ++a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);


	}
}
