package wannabekiss01;
public class �ú񽺷��� extends Thread {
���ġ ���ġ��ü = new ���ġ();
	public �ú񽺷���() {

	}
	
	
	public void run() {
		while(���ġ��ü.�Ǵ�P>10) {
				
			 if(���ΰ�.������>20) {
			  
		    System.out.println("......................................");
			System.out.println("���ġ�� �ú� �̴ϴ�");
			���ΰ�.������=���ΰ�.������-30;
		     System.out.println("���ΰ��� ��������"+���ΰ�.������+"�� �Ǿ����ϴ�.");
				System.out.println("......................................");
			 }
			
		     
		     
		     
		     
			try {
				 		
				Thread.sleep(6000);
		   
			}
				
				
			
		catch (InterruptedException e) {e.printStackTrace();}
		}
		
		
		
		
			
			
			
	}
	
	
	
	
}
