package hotmail.hsunmin.java1026;

public class Test {

	public static void main(String[] args) 
	{
		double d = 10.7;
		// d의 값을 소수 첫쨰 자리에서 반올림해서 저장
		// 강제 형 변환과 사칙 연산을 적절히 이용하면 됩니다.
		int result = (int) (d+0.5);
		System.out.println("result: " + result);
		d= 10.77;
		//소수 두쨰자리 반올림해서 출력 - 10.8
		//반올림하고자 하는 자리를 소수 첫쨰자리로 만들기
		System.out.println("result: " + ((int)(d*10+0.5)/10.0));
		
		int money = 87650;
		// 10의 자리에서 반올림해서 출력하기
		System.out.println("result: " + (int)((money/100.0+0.5)*100));
	}

}
