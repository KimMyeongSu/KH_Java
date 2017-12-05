class arrayClass
{
	public static void main(String[] args)
	{
		/*

			Array(배열) : 같은 자료형 변수의 묶음.

			자료형 배열변수명[] = new 자료형[배열의 갯수 == n];
			배열변수명[0] ~ 배열변수명[n - 1]

			int arr[] = new int[5];
			//			동적할당	10

			int arr[];
			arr = new int[5];

			arr[0] = 1;
			arr[1] = 3;
			arr[2] = 3;
			arr[3] = 3;
			arr[4] = 3;
			array index number 0 ~ 4

		!	index number로 관리된다.


			int i;

			*arr == arr[]


		*/

		int num1, num2, num3, num4, num5;

		int arr[] = new int[5];
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;	// array -> list

		System.out.println("arr[2] = " + arr[2]);

		char carr[] = new char[5];
		carr[0] = 'H';
		carr[1] = 'e';
		carr[2] = 'l';
		carr[3] = 'l';
		carr[4] = 'o';

		int _arr[];

		_arr = new int[10];

		int length = _arr.length;
		System.out.println("배열의 길이 = " + length);



		// 배열 초기화
		int n = 0;

		int arr1[] = { 1, 2, 3 };
		//			  [0] [1] [2]

		System.out.println("arr1[1] = " + arr1[1]);
		System.out.println("arr1 길이 = " + arr1.length);
		/*
		int _arr[] = { 4, 8, 12 };

		int []_arr = { 4, 8, 12 };
		*/

		int[] _Arr = { 4, 8, 12 };
		System.out.println("_Arr[0] = " + _Arr[0]);
		System.out.println("_Arr[1] = " + _Arr[1]);
		System.out.println("_Arr[2] = " + _Arr[2]);

		// 배열 복제
		int myArr[];

		myArr = _Arr;

		myArr[1] = 33;

		System.out.println("_Arr[1] = " + _Arr[1]);

	//	int *p;
	//	p = &_Arr[0];




	}
}
