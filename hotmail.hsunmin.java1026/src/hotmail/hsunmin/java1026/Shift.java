package hotmail.hsunmin.java1026;

public class Shift {

	public static void main(String[] args) 
	{
		int data= 127;
		//<< 2 는 곱하기 4한것과 동일한 효과
		System.out.println(data <<2);
		//>> 2 는 나누기 4한것과 동일한 효과
		System.out.println(data >>2);
		//>> 34는 32보다 크거나 같으므로 32로 나눈 나머지인 2와 동일
		System.out.println(data >>32);

	}

}
