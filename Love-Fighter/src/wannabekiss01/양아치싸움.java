package wannabekiss01;
public class 양아치싸움 extends Thread {
mainstory 메인 = new mainstory();

양아치 양아치객체 = new 양아치();
public 양아치싸움() {

		
		
		
	}
	
	
	
	
	public void run() {
			
		while(양아치객체.악당P>0) {
			 if(주인공.참을성<20) {
				 mainstory.게임중지여부=true;
				  
				 싸움 싸우기 = new 싸움();
				 System.out.println(""); 
				 싸우기.파이팅();
				  if(양아치객체.악당P<0) {
					  System.out.println("");
					  System.out.println("=========================");
					  System.out.println("훌륭합니다~");
					  System.out.println("양아치를 물리쳤습니다!");
					  System.out.println("그녀와 다시 달달한 게임을 시작합니다^^");
					  System.out.println("");
					  mainstory.게임중지여부=false;
				  }
			 
			 }
			
		     
		     
			try {
				 		Thread.sleep(100);
			}
				
				
			
		catch (InterruptedException e) {e.printStackTrace();}
		
		
			}
		
			
			
			
	}
	
	
	
	
	
}
