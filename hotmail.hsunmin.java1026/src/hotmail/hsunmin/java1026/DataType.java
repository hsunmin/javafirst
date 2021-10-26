package hotmail.hsunmin.java1026;

public class DataType {

	public static void main(String[] args) 
	{
		// 정수를 저장하는 변수를 만들고 데이터를 대입
		int age = 51;
		double num = 10.01;
		System.out.println(age);
		System.out.println(num);
		
		//age 라는 이름으로 다시 변수 생성 - 에러
		//int age = 47;
		
		//변수를 만들떄 자료형을 결정하면 그종류의 데이터만 대입이 가능
		//age = 51.9;
		
		//문자열을 저장하는 변수를 만들고 데이터를 대입
		String str = "아담";
		System.out.println(str);
		
		// 문자 - 실제로는 정수로 저장
		char ch = 'A';
		System.out.println(ch);
		// 코드를 저장
		// 숫자 0은 48, A는 65, a는 97에서 시작하여 하나씩 올라간다
		ch = 65;
		System.out.println(ch);
		
		System.out.println('a'- 'A');
		System.out.println('A'-'a');
		
		// 제어문자를 사용
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		System.out.println("Hello\0Java");
		System.out.println("Hello Java");
	}

}
