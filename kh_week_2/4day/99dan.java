Class 99dan {
  public static void main(String args[]) {


		// 구구단을 1단부터 9단까지 출력하는 프로그램을 작성하라.
		int x, y;
		x = 1;
		y = 1;

		for(int i = 0;i < 10; i++){
			y = 1;
			for(int j = 0;j < 10; j++){
				System.out.print(x + " * " + y + " = " + (x * y) + "  ");
				y++;
			}
			System.out.println();
			x++;
		}

		System.out.println("\n\n");

		Scanner sc = new Scanner(System.in);

		int num99;
		System.out.print("출력하고 싶은 구구단의 단위? = ");
		num99 = sc.nextInt();

		for(int j = 1; j < 10; j++){
			System.out.println(num99 + " * " + j + " = " + (num99 * j) + " ");
		}

  }
}
