Class areaAndSumAvg {
public static void main(String args[]) {

  		/*
  		하나의 수를 입력 받고 10의 배수로 입력 받은 수는
  		어느 범위에 있는지 출력되는 프로그램을 작성하라.
  		*/

  		int inputNum = 75;
  		/*
  		if(inputNum > 0 && inputNum <= 10){
  			System.out.println("입력하신 번호는 0에서 10사이에 있습니다");
  		}
  		else if(inputNum > 10 && inputNum <= 20){
  			System.out.println("입력하신 번호는 10에서 20사이에 있습니다");
  		}
  		else if(inputNum > 20 && inputNum <= 30){
  			System.out.println("입력하신 번호는 20에서 30사이에 있습니다");
  		}
  		*/

  		int _num = 0;
  		for(int i = 0;i < 10; i++){
  			_num = 10 * i;
  			if(inputNum > _num && inputNum <= (_num + 10)){
  				System.out.println("입력하신 번호는 " + _num + "에서 " + (_num + 10) + "사이에 있습니다");
  			}
  		}

  		// 유저로부터 입력 받은 수들의 합계와 평균을 구하는 프로그램을 작성하라.
  		int count;
  		int arrNum[];
  		int _sum, avg;

  		_sum = 0;
  		// 입력
  		//	숫자 몇개를 합계, 평균
  		System.out.print("숫자 몇개를 합계와 평균을 구하겠습니까 = ");
  		//	몇개?
  		count = sc.nextInt();

  		//	갯수에 맞게 배열의 동적 할당
  		arrNum = new int[count];
  			// 배열을 원하는 갯수만큼 할당하는것 Heap영역에 저장

  		//	갯수에 맞게 입력
  		for(int i = 0;i < arrNum.length; i++){
  			System.out.print((i + 1) + "번째 수 = ");
  			arrNum[i] = sc.nextInt();
  		}

  		// 합계
  		for(int i = 0;i < arrNum.length; i++){
  			_sum = _sum + arrNum[i];
  		}

  		// 평균
  		avg = _sum / arrNum.length;


  		// 결과 출력
  		System.out.println("합계는 " + _sum + " 평균은 " + avg + "입니다");
    }
}
