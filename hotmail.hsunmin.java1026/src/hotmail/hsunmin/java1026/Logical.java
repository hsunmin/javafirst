package hotmail.hsunmin.java1026;

public class Logical {

	public static void main(String[] args) 
	{
		System.out.println(10>3);
		
		int year = 2020;
		// year가 윤년인지 판별
		// year가 4의 배수이고 100의 배수가 아니면 윤년
		
		boolean pan = year%4== 0 && year%100!= 0 || year%400==0;
		
		System.out.println(pan);
		
		if(pan == true)
		{ System.out.println("이번년은 윤년");}
		else { System.out.println("이번년은 윤년아님");}
		
		int x =10;
		boolean r= x>5 && x++ >10;
		System.out.println(x);	// 처음 연산이 맞으므로 두번쨰 연산으로 이동하여 x 증가
		
		x=10;
		r=x < 5 && x++ > 10;    // 처음 연산이 틀려서 바로 끝나서 x 증가 안 함
		System.out.println(x);
		
	}

}
