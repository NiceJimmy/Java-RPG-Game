package wannabekiss01;

import java.util.Scanner;

public class �ο� {

	
	synchronized void ������() {
		System.out.println("���̻��� ���� �� ������...");
		System.out.println("");
	 System.out.println("�ο��� �����մϴ�.");
	 System.out.println("");
	 
	  ���ġ ���ġ��ü = new ���ġ();
	  Scanner ��ĳ�� = new Scanner(System.in);
	  
	  
	  for(int h =���ġ��ü.�Ǵ�P; h>=0; h--) {
		 
		  
		  if(���ΰ�.P>100) {
			  if(���ġ��ü.�Ǵ�P>0) {
			  �����ܽ�����.�Է�����=true;
			  System.out.println();
			  ���ݷε� ����9 = new ���ݷε�();
			  ����9.start();
			  try {
				����9.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  
			  ���ġ��ü.���ġħ���();
			  System.out.println("=======================");
			  
			  System.out.println("������ ����! ���ݹ���� �����Ͻÿ�");
			  System.out.println("1. µ 2. �ܰ� 3. ��ġ  4. ����  5. ��������");
			      int �ݰ� = ��ĳ��.nextInt();
			          if(�ݰ�==1) {
			        	  System.out.println();
						  ���ݷε� ����z = new ���ݷε�();
						  ����z.start();
						  try {
							����z.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			        	  System.out.println();
			        	  ���ΰ�.µ����(���ġ��ü);
			            System.out.println("=======================");
			            
			            System.out.println("���ġ�� ü���� 20 ��ŭ �����Ͽ�"+���ġ��ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
			          
			          }
			          
			          if(�ݰ�==2) {
			        	  if(���ΰ�.�ܰ˿���>10) {
			        		  System.out.println();
			    			  ���ݷε� ����j = new ���ݷε�();
			            	  
			    			  ����j.start();
			    			  try {
								����j.join();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            	  System.out.println();
			        		  ���ΰ�.�ܰ˰���(���ġ��ü);
			        		  System.out.println("=======================");
					            System.out.println("���ġ�� ü���� 100 ��ŭ �����Ͽ�"+���ġ��ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
			        	  }
			        	  else {
			        		  System.out.println("�ܰ˸� �����ϰ� ���� �ʽ��ϴ٤� �׳� µ�� �����ϴ�!");
							���ΰ�.µ����(���ġ��ü);								        	 
			        		  System.out.println("=======================");
					            System.out.println("���ġ�� ü���� 20 ��ŭ �����Ͽ�"+���ġ��ü.�Ǵ�P+" �� �Ǿ����ϴ�.");  
			        	    }
					          }
			          if(�ݰ�==3) {
			        	  if(���ΰ�.��ġ����>10) {
			        		  System.out.println();
			    			  ���ݷε� ����h = new ���ݷε�();
			            	  ����h.start();
			            	  try {
								����h.join();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            	  System.out.println();
			        		  ���ΰ�.��ġ����(���ġ��ü);
			        		  System.out.println("=======================");
					            System.out.println("���ġ�� ü���� 150 ��ŭ �����Ͽ�"+���ġ��ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
			        	  }
			        	  else {
			        		  System.out.println("��ġ�� �����ϰ� ���� �ʽ��ϴ٤� �׳� µ�� �����ϴ�!");
							���ΰ�.µ����(���ġ��ü);
			        		  System.out.println("=======================");
					            System.out.println("������ ü���� 20 ��ŭ �����Ͽ�"+���ġ��ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
			        		  }
		                  }
			          if(�ݰ�==4) {
			        	  if(���ΰ�.���񿩺�>10) {
			        		  System.out.println();
			    			  ���ݷε� ����p = new ���ݷε�();
			            	  ����p.start();
			            	  try {
								����p.join();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            	  System.out.println();
			        		  ���ΰ�.�������(���ġ��ü);
			        		  System.out.println("=======================");
					            System.out.println("���ġ�� ü���� 170 ��ŭ �����Ͽ�"+���ġ��ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
			        	  }
			        	  else {
			        		  System.out.println("��ġ�� �����ϰ� ���� �ʽ��ϴ٤� �׳� µ�� �����ϴ�!");
							���ΰ�.µ����(���ġ��ü);
			        		  System.out.println("=======================");
					            System.out.println("������ ü���� 20 ��ŭ �����Ͽ�"+���ġ��ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
			        		  }
		                  }           
			          if(�ݰ�==5) {
			        	  if(���ΰ�.������������>10) {
			        		  System.out.println();
			    			  ���ݷε� ����o = new ���ݷε�();
			            	  ����o.start();
			            	  try {
								����o.join();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            	  System.out.println();
			        		  ���ΰ�.������������(���ġ��ü);
			        		  System.out.println("=======================");
					            System.out.println("���ġ�� ü���� 200 ��ŭ �����Ͽ�"+���ġ��ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
			        	  }
			        	  else {
			        		  System.out.println("��ġ�� �����ϰ� ���� �ʽ��ϴ٤� �׳� µ�� �����ϴ�!");
							���ΰ�.µ����(���ġ��ü);
			        		  System.out.println("=======================");
					            System.out.println("������ ü���� 20 ��ŭ �����Ͽ�"+���ġ��ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
			        		  }
		                  }
			          if(���ΰ�.P<200) {
						  System.out.println(" ����.. �ʹ� ���ؼ� �̱� ���� �����ϴ�..");
							System.out.println();
							System.out.println(" ��������!!!!");
							System.out.println();
							System.out.println("---------------G A M E    O V E R-----------------");
					        System.exit(0);}
		  
			 
	
			  }
			  
			  
			  
			  
		  }
		  
	  }
	  
	
	
	
	
	
	
	
	}
	
}
