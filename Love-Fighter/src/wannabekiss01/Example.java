package wannabekiss01;

import java.util.Timer;
import java.util.TimerTask;

public class Example{
		
		
		int count =0;
		
		Timer Ÿ�̸� = new timer();
		TimerTask Ÿ�̸��׽�ũ = new TimerTask();
		{
		
		@Override
		public void run() {
			
			if(count<10) {
				System.out.println("����");
				count++;
			}
			
			else {
				Ÿ�̸�.cancel();
			}
		}
};
		Ÿ�̸�.schedule(Ÿ�̸��׽�ũ,5000,2000);
		
	}
}
	
	

