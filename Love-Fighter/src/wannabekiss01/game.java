package wannabekiss01;
import java.util.Random;
import java.util.Scanner;
public class game {

	
	Scanner ��ĳ�� = new Scanner(System.in);
	
	
	
    public void ���ӽ�ŸƮ() {
		System.out.println("���߷� ������ �����մϴ�.");
		
	
		
		for(int i=0; i<5; i++) {
		
		
		���ΰ� ���ΰ���ü = new ���ΰ�();
		
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
				���ΰ�.������� = ���ΰ�.�������+1000;
				System.out.println("��������� 1000 �����Ͽ����ϴ�^^");
				
				
			}
			
			else {
				System.out.println(�����϶�);
			    ���ΰ�.������� = ���ΰ�.�������-1000;
				System.out.println("��������� 1000 �����Ͽ����ϴ�^^");
			}
		
		}
		
	
		
		
		

		
    }
}
