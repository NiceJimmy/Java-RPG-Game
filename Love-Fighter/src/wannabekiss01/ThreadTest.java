package wannabekiss01;
import java.util.Timer;
import java.util.TimerTask;
import java.io.*;
public class ThreadTest extends Thread
{
    private String str = "";
  
    
    
    TimerTask task = new TimerTask()
    {
     
    	
    	
    	public void run()
        {
    
             
             
            if(str.equals("")){
            	System.out.println("���� �̻���");
            System.exit(0);}
        
        }
    	
    };

    
    
    
    public void getInput() throws Exception
    {
        Timer timer = new Timer();
        timer.schedule( task, 5000);

        System.out.println( "����� ���� �Ƹ��ٿ�ʴϴ�" );
        BufferedReader in = new BufferedReader(
        new InputStreamReader( System.in ) );
        
        str = ("����� ���� �Ƹ��ٿ�ʴϴ�");
        System.out.println();
        str = in.readLine();

        timer.cancel();
      
        if(str.equals("����� ���� �Ƹ��ٿ�ʴϴ�")) {
        System.out.println( str );
        System.out.println( "��~ ���� �Ǹ��մϴ�^^" );
        }
        else{System.out.println("���� ����� ���ϴ¼�����");
        System.exit(0);}
        
        
    }

     
    
    
   
    
    
    
    
}