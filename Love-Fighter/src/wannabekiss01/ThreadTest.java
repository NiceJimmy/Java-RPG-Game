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
            	System.out.println("뭐야 이색기");
            System.exit(0);}
        
        }
    	
    };

    
    
    
    public void getInput() throws Exception
    {
        Timer timer = new Timer();
        timer.schedule( task, 5000);

        System.out.println( "저기요 정말 아름다우십니다" );
        BufferedReader in = new BufferedReader(
        new InputStreamReader( System.in ) );
        
        str = ("저기요 정말 아름다우십니다");
        System.out.println();
        str = in.readLine();

        timer.cancel();
      
        if(str.equals("저기요 정말 아름다우십니다")) {
        System.out.println( str );
        System.out.println( "오~ 아주 훌륭합니다^^" );
        }
        else{System.out.println("말도 제대로 못하는세끼가");
        System.exit(0);}
        
        
    }

     
    
    
   
    
    
    
    
}