package hotmail.hsunmin.java1026;

public class FourCalculationOperator {

	public static void main(String[] args) 
	{
		 int result = 10 + 20;
		 System.out.println("result: " + result);
		 
		 //문자열 + 숫자는 문자열의 결합으로 리턴
		 String str = "10" + 20;
		 System.out.println("str: " + str);
		 
		 //10/3 는 정수사이의 연산이므로 결과는 3
		 // 1/2 는 0
		 result = 10 / 3;
		 System.out.println("result: " +result);
		 
		 // 정수 / 정수 한 결과를 소수까지 구하고자 하면
		 // 둘중 의 하나의 데이터를 실수로 변경해주어야합니다
		 // 정수와 실수가 연산을 하면 정수를 실수로 변환해서 
		 // 연산을 하기 떄문입니다.
		 System.out.println("result: " +((double)10 /3));
		 
		 byte b = 30;
		 byte c = 20;
		 // 산술 연산을 하면 연산의 결과는 최소한 int
		 // int는 byte 보다 크므로 대입이 안됩니다
		 // int 변수에 결과를 대입하거나 결과를 byte로 형 변환해야합니다
		 int d = b + c;
		 byte e = (byte)(b+c);
		 
		 System.out.println("d: " + d);
		 System.out.println("e: " + e);
	}

}
