package wannabekiss01;
import java.util.Random;
import java.util.Scanner;

public class ��Ȥ extends Thread {
	public ��Ȥ() {}
	Scanner ��ĳ�� = new Scanner(System.in);
	Random ���� = new Random();
	 �ú񽺷��� �ú� = new �ú񽺷���();
	 ���ġ�ο� �ο�� = new ���ġ�ο�();
	 
	 
	String a = "��";
	String w = "��";
	String d = "��";
	String s = "��";
	
	String a2 = "��";
	String w2 = "��";
	String d2 = "��";
	String s2 = "��";
	
	
		@Override
		public void run() {
		while(true) {
			
			
			
			int h = ����.nextInt(4);
			
			   if(h==0) {
				   System.out.println(a);
			   }
			   if(h==1) {
				   System.out.println(w);
			   }
			   if(h==2) {
				   System.out.println(d);
			   }if(h==3) {
				   System.out.println(s);
			   }         			
			
			   
			////////////////////////////////   
			   String g = ��ĳ��.nextLine();
			   
				
			   if(g.equals("a")) {
				   System.out.println(a2);
				   if(a.equals(a2)) {
					   System.out.println("Good~~~~~~~~~~~");
				   }
				   else if(!a.equals(a2)) {System.out.println("����~~~~~~~");}
				   
			   }
			   
			   
			   
			   
			   if(g.equals("w")) {
				   System.out.println(w2);
				   if(w.equals(w2)) {
					   System.out.println("Good~~~~~~~~~~~");}
				   else if (!w.equals("w2")) {System.out.println("����~~~~~~~");}
			   }
			   
			   
			   if(g.equals("d")) {
				   System.out.println(d2);
				   if(d.equals(d2)) {
					   System.out.println("Good~~~~~~~~~~~");
			   }else if (!d.equals(d2)){System.out.println("����~~~~~~~");}
				   }
			   
			   
			   
			   if(g.equals("s")) {
				   System.out.println(s2);
				   if(s.equals(s2)) {
				   System.out.println("Good~~~~~~~~~~~");
			   } else if (!g.equals(s2)) {System.out.println("����~~~~~~~");}  
				   }         			
			   
			   
			   
			
						
			
			   
		try {
			Thread.sleep(3000);
			}
	catch (InterruptedException e) {e.printStackTrace();}
		}
		
		
	
	
		}
}
