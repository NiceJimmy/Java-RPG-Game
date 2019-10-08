package wannabekiss01;

import java.util.Timer;
import java.util.TimerTask;

public class Example{
		
		
		int count =0;
		
		Timer 타이머 = new timer();
		TimerTask 타이머테스크 = new TimerTask();
		{
		
		@Override
		public void run() {
			
			if(count<10) {
				System.out.println("빙신");
				count++;
			}
			
			else {
				타이머.cancel();
			}
		}
};
		타이머.schedule(타이머테스크,5000,2000);
		
	}
}
	
	

