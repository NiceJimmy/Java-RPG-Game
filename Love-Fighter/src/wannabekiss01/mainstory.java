package wannabekiss01;
import java.util.Random;
import java.util.Scanner;

public class mainstory extends Thread  {


	public static boolean ������������ = false;
	
	public static void main(String[] args) throws Exception{
		

		Music1 ������� = new Music1("jucy.mp3",true);
		�������.start();
		
		Scanner ��ĳ�� = new Scanner(System.in);
		���ΰ� ���ΰ���ü = new ���ΰ�();
		weaponshop ������� = new weaponshop();
		drugstore �Ѿ�� = new drugstore();
		HOF ȣ���� = new HOF();
		cosmeticshop ȭ��ǰ�� = new cosmeticshop();
		Shop ���� = new Shop();
		
		
		
		
	  
		
		System.out.println();
		System.out.println("                     "+"<< Love Fighter >>");
		System.out.println();
		System.out.println();
		System.out.println("���� 30��° �ַ��̴�.. �׻��Ⱑ ���� �õ��� ���غ�����");
		System.out.println("���� ���� ����� �ϰ� ������ ��� ������ ��Ȥ�ϱ�� �ͼ��Ѵ�.");

		
		
		System.out.println("���ù� Ŭ������ ������ �������� 1�� �Է��Ͻÿ�");
		
		
	         int  ���� = ��ĳ��.nextInt();
	         System.out.println();
	       �ε������� �ε� = new �ε�������();

	       System.out.println("���� ä�� �մϴ�. ���ݸ� ��ٷ��ּ���!");	   
	       System.out.println();
	       �ε�.start();
	       �ε�.join();
	  	         
		     if(����==1) {
			  System.out.println();
			  System.out.println();
			  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
			  System.out.println("===========================================");
			  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
			  System.out.println();
			  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
			  System.out.println();
			  System.out.println("7.�����ϱ�");
			  System.out.println("===========================================");
			  
			  

		     }
			  
			  
			      int i;
				  while((i=��ĳ��.nextInt())!=7 ) {//1�Է��ϸ� �κ� �ݺ�, 2�� �Է��ϸ� while ��������
				  
					  
					  if( i==1 ) {

						  ���ΰ���ü.���ǻ���();
					      
		               
						  System.out.println();
						  System.out.println();
						  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
						  System.out.println("===========================================");
						  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
						  System.out.println();
						  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
						  System.out.println();
						  System.out.println("7.�����ϱ�");
						  System.out.println("===========================================");					      }
				  
					  if( i==2 ) {

						  ���ΰ���ü.������(���ΰ���ü);
						  
					      
		               
						  System.out.println();
						  System.out.println();
						  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
						  System.out.println("===========================================");
						  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
						  System.out.println();
						  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
						  System.out.println();
						  System.out.println("7.�����ϱ�");
						  System.out.println("===========================================");					      }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				  
					  if( i==3 ) {

						  ���ΰ���ü.�Ѿ౸���ϱ�(�Ѿ��);
						  
						  System.out.println();
						  System.out.println();
						  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
						  System.out.println("===========================================");
						  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
						  System.out.println();
						  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
						  System.out.println();
						  System.out.println("7.�����ϱ�");
						  System.out.println("===========================================");					      }
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////			  
					  if( i==4  ) {

						  ���ΰ���ü.������������(ȣ����);
						  
					      
		               
						  System.out.println();
						  System.out.println();
						  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
						  System.out.println("===========================================");
						  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
						  System.out.println();
						  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
						  System.out.println();
						  System.out.println("7.�����ϱ�");
						  System.out.println("===========================================");					      }
					  
					  if( i==5  ) {

						  ���ΰ���ü.ȭ��ǰ������(ȭ��ǰ��);
						  
					      
		               
						  System.out.println();
						  System.out.println();
						  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
						  System.out.println("===========================================");
						  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
						  System.out.println();
						  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
						  System.out.println();
						  System.out.println("7.�����ϱ�");
						  System.out.println("===========================================");					      }
					  
					  if( i==6  ) {

						  ���ΰ���ü.����������(�������);
						  
					      
		               
						  System.out.println();
						  System.out.println();
						  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
						  System.out.println("===========================================");
						  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
						  System.out.println();
						  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
						  System.out.println();
						  System.out.println("7.�����ϱ�");
						  System.out.println("===========================================");					      }
					  
				  }
				  
				  
				  
				  
				  
				  
				  
				  
					  System.out.println();
					  System.out.println("===================================");
					  System.out.println("�� �غ� �� ��������, ��������!");
					  System.out.println();
					  �ε������� �ε�1 = new �ε�������();
					  �ε�1.start();
			    		 �ε�1.join();
			    		 System.out.println();
					  System.out.println("���� ������ ���� ���� '���� ������ �㿡'�� ������!");
					  System.out.println("Ŭ���տ� �����ؼ� �����Ϸ��� �մϴ�.");
					  System.out.println("��! �׷��� ���尡 ���θ��±���!");
					  System.out.println("���� �� : ���, ��.. ���� �����ֵ� ���µ��� ���簡 ���ø� ��ؿ�");
					  System.out.println("���� ��ǳ� ��������Ʈ�� ������");
					  System.out.println();
					  System.out.println("�� : �ƴ� �������� ���� ���ٴµ� ��!");
					  System.out.println("�� : ���� ������� �����ε�? ��?");
					  System.out.println();
					  System.out.println("���� : �� �̾������� ¥�������ϳ�, ������? ���ư���?");
					  System.out.println();
					  System.out.println("�ſ� ���޴´�.. �ο�� ���ư��� ����� �����Ѵ�.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////					  
					  
					  
					  System.out.println("�ο��� �����Ϸ��� 1��, �����Ϸ��� 2���� �Է��Ͻÿ�.");
					  System.out.println();
					  int �ο� = ��ĳ��.nextInt();
					  
					  System.out.println("���� Ǯ���ݴϴ�. ��ø� ��ٷ��ּ���!");
					 �ε������� �ε�2 = new �ε�������();
					  System.out.println();
					  
					  �ε�2.start();
			    		 �ε�2.join();
			    		 System.out.println();
			    		 �������.close();
						  Music3 �ο����� = new Music3("�ο��.mp3",true);
							�ο�����.start();
					  
					  
					  if(�ο�==1) {
						  
						  

						  
						  System.out.println("�ο��� �����մϴ�.");
						 
						  
						  ���� ���尴ü = new ����();
						  for(int h =���尴ü.�Ǵ�P; h>=0; h--) {
							 
							  
							  if(���ΰ�.P>100) {
								  if(���尴ü.�Ǵ�P>0) {
								  
								  System.out.println("");
								  System.out.println("==================");
���ݷε� ���� = new ���ݷε�();
System.out.println();
����.start();
����.join();
System.out.println("");
								  ���尴ü.�����������ǰ���(���ΰ���ü);
								  System.out.println("=======================");
								  
								  System.out.println("������ ����! ���ݹ���� �����Ͻÿ�");
								  System.out.println("1. µ  2. �ܰ�  3. ��ġ  4. ����  5. ��������");
								      int �ݰ� = ��ĳ��.nextInt();
								          if(�ݰ�==1) {
								        	  System.out.println("==================");
								        	  System.out.println();
								        	  ���ݷε� ����2 = new ���ݷε�();
								        	  ����2.start();
								        	  ����2.join();
								        	  System.out.println("");
											���ΰ���ü.µ����(���尴ü);
								            System.out.println("=======================");
								            
								            System.out.println("������ ü���� 20 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
								          
								          }
								          
								          if(�ݰ�==2) {
								        	  if(���ΰ�.�ܰ˿���>10) {
								        		  System.out.println();
								        		  ���ݷε� ����3 = new ���ݷε�();
								        		  ����3.start();
									        	  ����3.join();
									        	  System.out.println("");
								        		  ���ΰ���ü.�ܰ˰���(���尴ü);
								        		  System.out.println("=======================");
										            System.out.println("������ ü���� 100 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
								        	  }
								        	  else {
								        		  System.out.println("�ܰ˸� �����ϰ� ���� �ʽ��ϴ٤� �׳� µ�� �����ϴ�!");
												���ΰ���ü.µ����(���尴ü);								        	 
								        		  System.out.println("=======================");
										            System.out.println("������ ü���� 20 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");  
								        	    }
      								          }
								          if(�ݰ�==3) {
								        	  if(���ΰ�.��ġ����>10) {
								        		  System.out.println();
								        		  ���ݷε� ����4 = new ���ݷε�();
								        		  ����4.start();
									        	  ����4.join();
									        	  System.out.println("");
								        		  ���ΰ���ü.��ġ����(���尴ü);
								        		  System.out.println("=======================");
										            System.out.println("������ ü���� 150 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
								        	  }
								        	  else {
								        		  System.out.println("��ġ�� �����ϰ� ���� �ʽ��ϴ٤� �׳� µ�� �����ϴ�!");
												���ΰ���ü.µ����(���尴ü);
								        		  System.out.println("=======================");
										            System.out.println("������ ü���� 20 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
								        		  }
							                  }
								          
						               
								          if(�ݰ�==4) {
								        	  if(���ΰ�.���񿩺�>10) {
								        		  System.out.println();
								        		  ���ݷε� ����5 = new ���ݷε�();
								        		  ����5.start();
									        	  ����5.join();
									        	  System.out.println("");
								        		  ���ΰ���ü.�������(���尴ü);
								        		  System.out.println("=======================");
										            System.out.println("������ ü���� 170 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
								        	  }
								        	  else {
								        		  System.out.println("������ �����ϰ� ���� �ʽ��ϴ٤� �׳� µ�� �����ϴ�!");
												���ΰ���ü.µ����(���尴ü);
								        		  System.out.println("=======================");
										            System.out.println("������ ü���� 20 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
								        		  }
							                  }
								          if(�ݰ�==5) {
								        	  if(���ΰ�.������������>10) {
								        		  System.out.println();
								        		  ���ݷε� ����6 = new ���ݷε�();
								        		  ����6.start();
									        	  ����6.join();
									        	  System.out.println("");
								        		  ���ΰ���ü.������������(���尴ü);
								        		  System.out.println("=======================");
										            System.out.println("������ ü���� 200 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
								        	  }
								        	  else {
								        		  System.out.println("���������� �����ϰ� ���� �ʽ��ϴ٤� �׳� µ�� �����ϴ�!");
												���ΰ���ü.µ����(���尴ü);
								        		  System.out.println("=======================");
										            System.out.println("������ ü���� 20 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
								        		  }
							                  }
								          if(���ΰ�.P<200) {
											  System.out.println(" ����.. �ʹ� ���ؼ� �̱� ���� �����ϴ�..");
												System.out.println();
												System.out.println(" ��������!!!!");
												System.out.println();
												System.out.println("---------------G A M E    O V E R-----------------");
										        System.exit(0);
								          }
							  
								  }
							  
								  
							  
						/////////////////////////////////////////////////////////////////////////////////////////////////////////////	  
							          
							  }
							  
							  
							  
							  
							  }
						  
					  
						  
						  
						  if(���尴ü.�Ǵ�P<0) {
						  ���ݷε� ����7 = new ���ݷε�();
						  
						  
						  
						  
						  System.out.println();
						  System.out.println("=======================================");
						  System.out.println("���带 �̰���ϴ�! �ŷµ� 500�� ������� 1000�� ����Ͽ����ϴ�!");
					      ���ΰ�.�ŷµ� = ���ΰ�.�ŷµ� + 500;
					      ���ΰ�.������� = ���ΰ�.������� + 1000;
					      System.out.println();
					      System.out.println();
			        	  ����7.start();
			        	  ����7.join();
			        	  System.out.println("");
						  System.out.println("���� �κ��丮 ����");
						  System.out.println();
						  System.out.println("P :"+ ���ΰ�.P);
						  System.out.println("������ : "+���ΰ�.������);
						  System.out.println("�ŷµ� : "+���ΰ�.�ŷµ�);
						  System.out.println("������� : "+���ΰ�.�������);
						  
						  }
		     ////////////////////////////////////////////////////////////////////////////////////////
						  �ο�����.close();
						  System.out.println();
						  System.out.println();
						  Music1 �������2 = new Music1("jucy.mp3",true);
						  �������2.start();
						  System.out.println("����ϳ׿�! ���带 ��������ٴ�.. �Ǹ��մϴ�.");
						  System.out.println("���� ���������� ������ ��� �̼��� ã���� �����ô�!");
						  System.out.println();
						  System.out.println("�ϰ���� ���� �����Ͻÿ�");
						  
						  System.out.println("===========================================");
						  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
						  System.out.println();
						  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
						  System.out.println();
						  System.out.println("7.�����ϱ�");
						  System.out.println("===========================================");
						  System.out.println();
						  
						  int s;
						  while((s=��ĳ��.nextInt())!=7 ) {//1�Է��ϸ� �κ� �ݺ�, 2�� �Է��ϸ� while ��������
						  
							  
							  if( s==1 ) {

								  ���ΰ���ü.���ǻ���();
							      
				               
								  System.out.println();
								  System.out.println();
								  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
								  System.out.println("===========================================");
								  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
								  System.out.println();
								  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
								  System.out.println();
								  System.out.println("7.�����ϱ�");
								  System.out.println("===========================================");					      }
						  
							  if( s==2 ) {

								  ���ΰ���ü.������(���ΰ���ü);
								  
							      
				               
								  System.out.println();
								  System.out.println();
								  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
								  System.out.println("===========================================");
								  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
								  System.out.println();
								  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
								  System.out.println();
								  System.out.println("7.�����ϱ�");
								  System.out.println("===========================================");					      }
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				  
							  if( s==3 ) {

								  ���ΰ���ü.�Ѿ౸���ϱ�(�Ѿ��);
								  
								  System.out.println();
								  System.out.println();
								  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
								  System.out.println("===========================================");
								  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
								  System.out.println();
								  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
								  System.out.println();
								  System.out.println("7.�����ϱ�");
								  System.out.println("===========================================");					      }
				/////////////////////////////////////////////////////////////////////////////////////////////////////////////			  
							  if( s==4  ) {

								  ���ΰ���ü.������������(ȣ����);
								  
							      
				               
								  System.out.println();
								  System.out.println();
								  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
								  System.out.println("===========================================");
								  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
								  System.out.println();
								  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
								  System.out.println();
								  System.out.println("7.�����ϱ�");
								  System.out.println("===========================================");					      }
							  
							  if( s==5  ) {

								  ���ΰ���ü.ȭ��ǰ������(ȭ��ǰ��);
								  
							      
				               
								  System.out.println();
								  System.out.println();
								  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
								  System.out.println("===========================================");
								  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
								  System.out.println();
								  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
								  System.out.println();
								  System.out.println("7.�����ϱ�");
								  System.out.println("===========================================");					      }
							  
							  if( s==6  ) {

								  ���ΰ���ü.����������(�������);
								  
							      
				               
								  System.out.println();
								  System.out.println();
								  System.out.println("�ϰ���� ���� ��ȣ�� �Է��Ͻÿ�");
								  System.out.println("===========================================");
								  System.out.println("1.���ΰ� ����    2.������        3.�ھ簭��");
								  System.out.println();
								  System.out.println("4.�����ϱ�       5.�̴Ͻ��Ǹ�      6.������");
								  System.out.println();
								  System.out.println("7.�����ϱ�");
								  System.out.println("===========================================");					      }
							  
						  }
						  System.out.println();
						  System.out.println("Ŭ���� ������ ȭ��ǿ���  ��Ÿ���� �����մϴ�.");
						  System.out.println();
						  
					      
						  
						 �ε������� �ε�b = new �ε�������();
						  �ε�b.start();
					    		 �ε�b.join();
					    		 System.out.println();
					    		 �������2.close();
						    Music1 Ŭ������ = new Music1("Ŭ���Լ�.mp3",true);
							Ŭ������.start();

							
							System.out.println("===============================================");
						  System.out.println("Ŭ���� �Լ��Ͽ����ϴ�!");
						  System.out.println("��! ���ʿ� ������ ���ڰ� �Ѹ� ���Դϴ�!");
						  System.out.println();
						  System.out.println("��Ȥ�� �����մϴ�.");
						  System.out.println("��⸦ ����  ������ ��ƺ��ϴ�.");
						  
									System.out.println();
									System.out.println();
									���ݷε� ����a = new ���ݷε�();
									����a.start();
									����a.join();
									System.out.println();
									System.out.println("�׿��ڿ� �ռ��� �����Ͽ����ϴ�!");
									System.out.println();
									System.out.println("������ ������ �ϸ鼭 �ŷµ��� 10,000 �̻� �÷� �̼��� ������ �����ÿ�.");
									
								
									
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////									
									
									
							
									
									if(���ΰ�.�ŷµ�>=10000) {
								          
										
										
										System.exit(0);
							                              }else {
									
							                            	 		  
					�ú񽺷��� �ú� = new �ú񽺷���();
					�ú�.start();
					�����ܽ����� ������ = new �����ܽ�����();
					������.start();
					 ���ġ�ο� ��� = new ���ġ�ο�();	 
						
					 ���.setPriority(10);
   					���.start();		    	
   					���.join();	
   					
							    	
							
							}
								  
						}		  
								  
						
						}    
						      						      
						      
						      
							    
						  
						 
		    }
	     
