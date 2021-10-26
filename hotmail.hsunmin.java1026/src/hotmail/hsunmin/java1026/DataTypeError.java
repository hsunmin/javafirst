package hotmail.hsunmin.java1026;

public class DataTypeError {

	public static void main(String[] args) 
	{
		char ch = 'F';
		System.out.println("ch는 " + ch + "입니다.");
		
		//아래 문장은 에러
		// ch 중복에러 그러므로 ch를 바꾸거나 변수 생성이 아닌 ch 값 대입만 함
		//int ch = 'a';
		
		// 위의 문제를 해결하는 방법 - 다른 변수를 생성해서 해결
		char cha = 'a';
		
		// 위의 문제를 해결하는 방법 - 데이터의 종류가 같다면 변수를 재사용
		ch ='a';
		
		System.out.println(ch);
		System.out.println(cha);
		
		// 변수를 만들떄는 char를 사용했는데 대입하는 데이터는 double이라서 에러
		//ch = 57.1;
		
		// 해결은 실수 변수를 만들어서 대입해서
		double d = 57.1;
		
		// 또 다른 해결은 char로 변경해서 대입 하지만 소수점은 없어짐 char은 45=> 0 실수만 있으니까
		ch = (char)57.1;
		System.out.println(ch);
		
		// 없는 변수인 cl을 사용해서 에러
		// cl이라는 변수를 만들거나 있는 변수 이름을 사용해야합니다.
		// system.out.println(cl);
		
		// 에러는 아닌데 화면에는 아무것도 출력되지 않음
		// 13이나 30은 Enter입니다.
		char temp = 13;
		System.out.println(temp);
		
		int sum = 0;
		for(int i=0; i<100; i++)
		{
			
			sum = sum +1;
		}
		System.out.println(sum);
		
		// 정수로 연산한후 실수로 변경하면 정확한 결과를 만들수 있습니다
		double hap =0.0;
		for(int i=0;i<100; i++)
		{
			hap = hap +0.1;
		}
		System.out.println(hap);
		
	}

}
