package hotmail.hsunmin.java1026;

public class Mod {

	public static void main(String[] args) 
	{
		int i = 0;
		
		// 3가지 동작을 1초마다 번갈아 가면서 수행
		while(true) 
		{
			try 
			{
					Thread.sleep(1000); // 1초마다 작동
			}catch(Exception e) {}
			
			//3으로 나눈 나머지 - 0,1,2
			int mod = i % 3;
			if(mod == 0) {System.out.println("빨강");}
			if(mod == 1) {System.out.println("파랑");}
			if(mod == 2) {System.out.println("녹색");}
			i++;
		}

	}

}
