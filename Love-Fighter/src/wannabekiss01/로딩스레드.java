package wannabekiss01;

public class 로딩스레드 extends Thread {

public 로딩스레드() {

		
		
		
	}
	public void run() {
		System.out.println("");
		for(int h=0; h<10; h++ ) {
			System.out.print("▶");
			 
			
		     
		     
		     
		     
			try {
				 		
				Thread.sleep(400);
		   
			}
				
				
			
		catch (InterruptedException e) {e.printStackTrace();}
		}System.out.println("");
		
	}
		
		
			
	
	
	
}
