package wannabekiss01;
import java.util.Scanner;
import java.util.Random;

public class �����ܽ����� extends Thread {
	Scanner ��ĳ�� = new Scanner(System.in);
	public �����ܽ�����() {}
	
	public static boolean ���������� = false; 
	public static boolean �Է����� = false;
	public void run() {
		
		
		while(true) {
			if(mainstory.������������==false) {
			
				if(���ΰ�.�ŷµ�>10000) {System.out.println("�ŷ��� ����� �����Ͽ����ϴ�");
				System.out.println("��������� �׳�� �����ð� ��������~^^");
				System.out.println();
				System.out.println("============   Game Over   ============");
				System.exit(0);
				}
				
				
				
				
				Random ���� = new Random();	
			 int ����1 =  ����.nextInt(9)+1;
			 int ����2 =  ����.nextInt(9)+1;
			 String �����϶� = "�����Դϴ�!^^";
		     String �����϶� = "Ʋ�Ƚ��ϴ� ^^~";
				System.out.println(����1);
				System.out.println(����2);
				int ���� = ����1*����2; 

			 		
				int �Է� = ��ĳ��.nextInt();
				if(�Է� == ����) {
					
					System.out.println(�����϶�);
					���ΰ�.�ŷµ� = ���ΰ�.�ŷµ�+1000;
					System.out.println("------------------------");
					System.out.println("�� ~~~ ������~^^");
					System.out.println("�ŷµ��� 1000 �����Ͽ����ϴ�^^");
					System.out.println("------------------------");
					
				}
				
				else {
					System.out.println(�����϶�);
				    ���ΰ�.�ŷµ� = ���ΰ�.�ŷµ�-1000;
					System.out.println("------------------------");
					System.out.println("�Ӹ��� �� �����ô±���~?");
				    System.out.println("�ŷµ��� 1000 �����Ͽ����ϴ�^^");
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
