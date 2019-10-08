package wannabekiss01;
import java.util.Random;
import java.util.Scanner;
public class game {

	
	Scanner 스캐너 = new Scanner(System.in);
	
	
	
    public void 게임스타트() {
		System.out.println("순발력 게임을 시작합니다.");
		
	
		
		for(int i=0; i<5; i++) {
		
		
		주인공 주인공객체 = new 주인공();
		
		Random 랜덤 = new Random();	
		 int 숫자1 =  랜덤.nextInt(9)+1;
		 int 숫자2 =  랜덤.nextInt(9)+1;
		 String 정답일때 = "정답입니다!^^";
	     String 오답일때 = "틀렸습니다 ^^~";
			System.out.println(숫자1);
			System.out.println(숫자2);
			int 정답 = 숫자1*숫자2; 

					
			int 입력 = 스캐너.nextInt();

			if(입력 == 정답) {
				
				System.out.println(정답일때);
				주인공.보유재산 = 주인공.보유재산+1000;
				System.out.println("보유재산이 1000 증가하였습니다^^");
				
				
			}
			
			else {
				System.out.println(오답일때);
			    주인공.보유재산 = 주인공.보유재산-1000;
				System.out.println("보유재산이 1000 감소하였습니다^^");
			}
		
		}
		
	
		
		
		

		
    }
}
