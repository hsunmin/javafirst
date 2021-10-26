package hotmail.hsunmin.java1026;

public class DataTypeCasting {

	public static void main(String[] args) {
		// 정수 변수에 실수 데이터 삽입 -에러
		// int age = 31.7;
		
		// 실수 변수에 정수 데이터를 대입
		// 자동 형 변환이 발생해서 에러가 발생하지 않습니다.
		double height = 173.4;
		System.out.println("키는 " + height + "cm" + " 입니다.");
		
		//강제 형 변환
		//데이터의 자료형을 변경해서 대입
		//실수를 정소로 변경해서 대입
		//소수는 제거됩니다.
		int age = (int)31.8;
		System.out.println("나이는 " + age + "살 입니다.");
		
		// 표현범위 밖의 숫자를 강제로 변환해서 대입하면
		// overflow 나 underflow 발생
		// overflow: 가장 큰쪽으로 넘어가서 가장 작은것부터 다시 시작
		// underflow는 반대
		// byte 는 -128 ~ 127까지 표현 가능
		byte b = (byte)128;
		System.out.println(b);
		
		b = (byte)-130;
		// -128까지 이므로 127로 넘어가서 126으로 끝날것으로 예상
		System.out.println(b);
	}

}
