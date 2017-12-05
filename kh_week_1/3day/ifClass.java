ifclass ifClass
{
	public static void main(String[] args)
	{


		int number;
		number = 10;

		if(number < 0){
			// 처리
			System.out.println("number는 0보다 크다");
		}

		/*
		if(1.조건){	2.true 3.false
			2-1.처리
		}
		else{
			3-1.처리
		}
		*/

		number = -100;
		if(number >= 5){
			System.out.println("number는 5보다 크다");
		}
		else{
			System.out.println("number는 5보다 작거나 같다");
		}



		number = 145;

		if(number > 0 && number <= 10){
			System.out.println("number > 0 && number <= 10");
		}
		else if(number > 10 && number <= 20){
			System.out.println("number > 10 && number <= 20");
		}
		else if(number > 20 && number <= 30){
			System.out.println("number > 20 && number <= 30");
		}
		else if(number > 30 && number <= 40){
			System.out.println("number > 30 && number <= 40");
		}
		else if(number > 40 && number <= 50){
			System.out.println("number > 40 && number <= 50");
		}
		else{
			System.out.println("number <= 0 || number > 50");
		}


		if(number == 145){
			System.out.println("number는 145입니다");
		}

		if(number != 145){
			System.out.println("number는 100이 아닙니다");
		}

		int count = 85;


		if(count > 70){
			System.out.println("count는 70이상입니다");
		}
		else if(count > 80){
			System.out.println("count는 80이상입니다");
		}
		else if(count > 90){
			System.out.println("count는 90이상입니다");
		}
		else if(count == 100){
			System.out.println("count는 100입니다");
		}


		boolean b = false;

		if(!b){	// b == false
			System.out.println("b == false입니다");
		}

		b = true;

		if( b ){ // b == true
			System.out.println("b == true입니다");
		}


		// 조건문 안의 조건문
		number = 96;

		if(number == 100){
			System.out.println("A++ 입니다");
		}
		else if(number >= 90 && number < 100){

			if(number < 96){
				System.out.println("A 입니다");
			}
			else{
				System.out.println("A+ 입니다");
			}
		}
		else if(number >= 80 && number < 90){
			System.out.println("B 입니다");
		}


		int age = 9; // = 76

		if(age < 10 || age > 75){
			System.out.println("회원가입이 불가능합니다");
		}

		String str;
		str = "abc";

		str = str + "d";	// abcd

		if(str == "abcd"){
			System.out.println("str == abc");
		}

		if(str.equals("abcd") == true){
			System.out.println("str.equals('abcd')");
		}

		char c;

		c = 'A';
		c = 'B';

		if(c == 'B'){
			System.out.println("c == 'B'");
		}


	}
}
