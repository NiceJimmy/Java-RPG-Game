package wannabekiss01;

import java.util.Scanner;

public class ���ν����� implements Runnable {

	
	public ���ν�����() {}
	
	
	public void run() {
		
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
		System.out.println("                     "+"<< Love Hunter >>");
		System.out.println();
		System.out.println();
		System.out.println("���� 30��° �ַ��̴�.. �׻��Ⱑ ���� �õ��� ���غ�����");
		System.out.println("���� ���� ����� �ϰ� ������ ��� ������ ��Ȥ�ϱ�� �ͼ��Ѵ�.");

		
		
		System.out.println("���ù� Ŭ������ ������ �������� 1�� �Է��Ͻÿ�");
		
		
	         int  ���� = ��ĳ��.nextInt();
         		
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
					  if(�ο�==1) {
						  
						  System.out.println("�ο��� �����մϴ�.");
						 
						  
						  ���� ���尴ü = new ����();
						  for(int h =���尴ü.�Ǵ�P; h>=0; h--) {
							 
							  
							  if(���ΰ���ü.P>100) {
								  if(���尴ü.�Ǵ�P>0) {
								  
								  System.out.println("");
								  System.out.println("==================");
							 
								  ���尴ü.�����������ǰ���(���ΰ���ü);
								  System.out.println("=======================");
								  
								  System.out.println("������ ����! ���ݹ���� �����Ͻÿ�");
								  System.out.println("1. µ 2. �ܰ� 3. ��ġ");
								      int �ݰ� = ��ĳ��.nextInt();
								          if(�ݰ�==1) {
								        	  System.out.println("==================");
											���ΰ���ü.µ����(���尴ü);
								            System.out.println("=======================");
								            
								            System.out.println("������ ü���� 20 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
								          
								          }
								          
								          if(�ݰ�==2) {
								        	  if(���ΰ���ü.�ܰ˿���>10) {
								        		  ���ΰ���ü.�ܰ˰���(���尴ü);
								        		  System.out.println("=======================");
										            System.out.println("������ ü���� 60 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
								        	  }
								        	  else {
								        		  System.out.println("�ܰ˸� �����ϰ� ���� �ʽ��ϴ٤� �׳� µ�� �����ϴ�!");
												���ΰ���ü.µ����(���尴ü);								        	 
								        		  System.out.println("=======================");
										            System.out.println("������ ü���� 20 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");  
								        	    }
      								          }
								          if(�ݰ�==3) {
								        	  if(���ΰ���ü.��ġ����>10) {
								        		  ���ΰ���ü.��ġ����(���尴ü);
								        		  System.out.println("=======================");
										            System.out.println("������ ü���� 70 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
								        	  }
								        	  else {
								        		  System.out.println("��ġ�� �����ϰ� ���� �ʽ��ϴ٤� �׳� µ�� �����ϴ�!");
												���ΰ���ü.µ����(���尴ü);
								        		  System.out.println("=======================");
										            System.out.println("������ ü���� 20 ��ŭ �����Ͽ�"+���尴ü.�Ǵ�P+" �� �Ǿ����ϴ�.");
								        		  }
							                  }
						               
							  
								          if(���ΰ���ü.P<200) {
											  System.out.println(" ����.. �ʹ� ���ؼ� �̱� ���� �����ϴ�..");
												System.out.println();
												System.out.println(" ��������!!!!");
												System.out.println();
												System.out.println("---------------G A M E    O V E R-----------------");
										        }
							  
								  }
							  
								  
							  
						/////////////////////////////////////////////////////////////////////////////////////////////////////////////	  
							          
							  }
							  
							  
							  
							  
							  }
						  
						  
						  
						  
						  if(���尴ü.�Ǵ�P<0) {
						  
						  System.out.println();
						  System.out.println("=======================================");
						  System.out.println("���带 �̰���ϴ�! ������ 500�� ������� 1000�� ����Ͽ����ϴ�!");
					      ���ΰ���ü.������ = ���ΰ���ü.������ + 500;
					      ���ΰ���ü.������� = ���ΰ���ü.������� + 1000;
					      System.out.println();
						  System.out.println("���� �κ��丮 ����");
						  System.out.println();
						  System.out.println("P :"+ ���ΰ���ü.P);
						  System.out.println("������ : "+���ΰ���ü.������);
						  System.out.println("�ŷµ� : "+���ΰ���ü.�ŷµ�);
						  System.out.println("������� : "+���ΰ���ü.�������);
						  }
		     ////////////////////////////////////////////////////////////////////////////////////////
						  System.out.println();
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
						  
						  �������.close();
						  Music1 Ŭ������ = new Music1("Ŭ���Լ�.mp3",true);
							Ŭ������.start();


							
						  
						  
						  
							System.out.println("===============================================");
						  System.out.println("Ŭ���� �Լ��Ͽ����ϴ�!");
						  System.out.println("��! ���ʿ� ������ ���ڰ� �Ѹ� ���Դϴ�!");
						  System.out.println();
						  System.out.println("��Ȥ�� �����Ϸ��� 1��, �����Ϸ��� 2���� �Է��Ͻÿ�");
						  int ��� = ��ĳ��.nextInt();
						  if(���==1) {
						  System.out.println("��⸦ ����  ������ ��ƺ��ϴ�.");
						  System.out.println("ȭ��ǥ ������ �Ѱ��� �Է��� �����Ͽ� ������ ������ �ŷµ��� ����մϴ�!");
						  System.out.println("��:a , ��:w , ��:s , ��:d");
						  System.out.println("���� ���� �غ� ������ 1�� �Է��Ͻÿ�");
						  int ���� = ��ĳ��.nextInt();
						  if(����==1) {
						      ThreadTest ��Ȥ�̼� = new ThreadTest();
							    
						     
						      
						      try
						      {
						          ��Ȥ�̼�.getInput();
						      }
						      catch( Exception e )
						      {
						          System.out.println( e );
						      }
						      
						      
						      
						      System.out.println( "main exit..." );
						      						      
						      
	///////////////////////////////////////////////////////////////////////////////					      
						      
						      
						      
						      
						      
						      
						      
						      
							    
							    System.out.println("���� : ��� ! �� �ǰ� ���߽ó׿�~^^");
								 System.out.println("���� : ȥ�ڿ��̾? ");
								 System.out.println("���� : �� ��, ��Ʈ������ Ǯ������~");
								 System.out.println("���� : ȥ�ڿ������� ���� �����ϰ� ���� �ϽǷ���?^^");
								 System.out.println("���� : ��.... �׷����? ^^");
								 System.out.println();
								 System.out.println("���� ���̺�ΰ� ���� ���ñ� �����Ѵ�.");
						  }
						  }
						  
						 int �ο�2 = ��ĳ��.nextInt();
						 if(�ο�2==1) {
							 
							 
							 
							 
							 
						  System.out.println("����!");
						  
						  
						  
						 }
						  }
		
		
	}
	
	}
	
	

			
		
	
	
	
	
}
