Class sum {
  public static void sum(String args[]){
    // 1 ~ 1000 사이에 수를 전부 합친 값을 출력하라.
		int sum = 0;

	//	for(int i = 1;i <= 1000; i++){
	//		sum = sum + i;
	//	}

		int n = 0;
		for(int i = 0;i < 1000; i++){
			n++;
			sum = sum + n;
		}


		System.out.println("sum = " + sum);
  }
}
