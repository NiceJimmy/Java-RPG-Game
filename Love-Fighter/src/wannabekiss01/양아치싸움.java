package wannabekiss01;
public class ���ġ�ο� extends Thread {
mainstory ���� = new mainstory();

���ġ ���ġ��ü = new ���ġ();
public ���ġ�ο�() {

		
		
		
	}
	
	
	
	
	public void run() {
			
		while(���ġ��ü.�Ǵ�P>0) {
			 if(���ΰ�.������<20) {
				 mainstory.������������=true;
				  
				 �ο� �ο�� = new �ο�();
				 System.out.println(""); 
				 �ο��.������();
				  if(���ġ��ü.�Ǵ�P<0) {
					  System.out.println("");
					  System.out.println("=========================");
					  System.out.println("�Ǹ��մϴ�~");
					  System.out.println("���ġ�� �����ƽ��ϴ�!");
					  System.out.println("�׳�� �ٽ� �޴��� ������ �����մϴ�^^");
					  System.out.println("");
					  mainstory.������������=false;
				  }
			 
			 }
			
		     
		     
			try {
				 		Thread.sleep(100);
			}
				
				
			
		catch (InterruptedException e) {e.printStackTrace();}
		
		
			}
		
			
			
			
	}
	
	
	
	
	
}
