

package wannabekiss01;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Ÿ�̸� 
{
     String str = "";
     Scanner ��ĳ�� = new Scanner(System.in);        
     String[]���� = new String[4];
     
    TimerTask task = new TimerTask()
    {
  //////////////////////////////////////////////////////////////////////////  	
    	
    	
    	
    	public void run()
        {
            if( str.equals("") )
            {
                System.out.println( "���ڸ� ���ƽ��ϴ�!" );
            }
            System.exit(0);}
    
    
    
    };

    public void getInput() 
    {
        
    	
    	Timer timer = new Timer();
        timer.schedule( task, 15000 );
        Random �����Լ� = new Random();
        
        
        
        String []����Ű = {"a","w","s","d"};
        String[]���� = new String[4];
        
        for(int h=0; h<5; h++) {
        for(int i=0; i<4; i++) { 
        ����[i]=����Ű[�����Լ�.nextInt(4)];       
        }
        
        System.out.print(Arrays.toString(����));
        
        
        System.out.println();
        System.out.println();
        
          
           
           
          
           
           
           int size = ����.length;
            
            for(int i=0; i<size; i++) {
            	����[i] = ��ĳ��.next();
                  switch(����[i]) {
                
                case "a" : System.out.println("��");
                break;
                case "w" : System.out.println("��");
                break;
                case "d" : System.out.println("��");
                break;
                case "s" : System.out.println("��");
                break;
                  }
            }
           
            System.out.println(Arrays.toString(����));
          	
          	
          	if(����.equals(����)) {
          		System.out.println("����!");
          	} 
                
        }
            
      	timer.cancel();
      	
        
      	
      	
        
}}

///////////////////////////////////////////////////////////////////////////////////