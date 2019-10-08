package wannabekiss01;
import java.util.Scanner;
import java.util.Random;

public class 구구단스레드 extends Thread {
	Scanner 스캐너 = new Scanner(System.in);
	public 구구단스레드() {}
	
	public static boolean 구구단중지 = false; 
	public static boolean 입력중지 = false;
	public void run() {
		
		
		while(true) {
			if(mainstory.게임중지여부==false) {
			
				if(주인공.매력도>10000) {System.out.println("매력을 충분히 어필하였습니다");
				System.out.println("사랑스러운 그녀와 좋은시간 보내세요~^^");
				System.out.println();
				System.out.println("============   Game Over   ============");
				System.exit(0);
				}
				
				
				
				
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
					주인공.매력도 = 주인공.매력도+1000;
					System.out.println("------------------------");
					System.out.println("오 ~~~ 뇌섹남~^^");
					System.out.println("매력도가 1000 증가하였습니다^^");
					System.out.println("------------------------");
					
				}
				
				else {
					System.out.println(오답일때);
				    주인공.매력도 = 주인공.매력도-1000;
					System.out.println("------------------------");
					System.out.println("머리가 좀 딸리시는군요~?");
				    System.out.println("매력도가 1000 감소하였습니다^^");
					System.out.println("------------------------");
				}
				
			
			}
		
		
		
	
	try {
 		
		Thread.sleep(2000);
   
	}
		
		
	
catch (InterruptedException e) {e.printStackTrace();}
	}
	}
	}
