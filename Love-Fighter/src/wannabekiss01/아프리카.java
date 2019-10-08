package wannabekiss01;

public class 아프리카 implements Runnable {

	@Override
	public void run() {

		
			try {
				for(int i =0; i<10; i++) {
					System.out.println("사자" + i);		
					Thread.sleep(500);
				
				}
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
	}

}
