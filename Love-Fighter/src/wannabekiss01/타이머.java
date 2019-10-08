

package wannabekiss01;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class 타이머 
{
     String str = "";
     Scanner 스캐너 = new Scanner(System.in);        
     String[]정답 = new String[4];
     
    TimerTask task = new TimerTask()
    {
  //////////////////////////////////////////////////////////////////////////  	
    	
    	
    	
    	public void run()
        {
            if( str.equals("") )
            {
                System.out.println( "박자를 놓쳤습니다!" );
            }
            System.exit(0);}
    
    
    
    };

    public void getInput() 
    {
        
    	
    	Timer timer = new Timer();
        timer.schedule( task, 15000 );
        Random 랜덤함수 = new Random();
        
        
        
        String []방향키 = {"a","w","s","d"};
        String[]문제 = new String[4];
        
        for(int h=0; h<5; h++) {
        for(int i=0; i<4; i++) { 
        문제[i]=방향키[랜덤함수.nextInt(4)];       
        }
        
        System.out.print(Arrays.toString(문제));
        
        
        System.out.println();
        System.out.println();
        
          
           
           
          
           
           
           int size = 정답.length;
            
            for(int i=0; i<size; i++) {
            	정답[i] = 스캐너.next();
                  switch(정답[i]) {
                
                case "a" : System.out.println("←");
                break;
                case "w" : System.out.println("↑");
                break;
                case "d" : System.out.println("→");
                break;
                case "s" : System.out.println("↓");
                break;
                  }
            }
           
            System.out.println(Arrays.toString(정답));
          	
          	
          	if(문제.equals(정답)) {
          		System.out.println("씨발!");
          	} 
                
        }
            
      	timer.cancel();
      	
        
      	
      	
        
}}

///////////////////////////////////////////////////////////////////////////////////