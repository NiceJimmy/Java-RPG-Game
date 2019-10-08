package wannabekiss01;

public class 캐릭터  {

	int 악당P;
	
		
	
	
		public void 쨉공격(주인공 주인공객체) {
			
			System.out.println("쨉을 날립니다!.");
			주인공객체.P = 주인공객체.P-20;
			System.out.println("나의 체력이 20 만큼 감소하여 "+주인공객체.P+"가 되었습니다.");
         	}
	

         public void 로우킥공격(주인공 주인공객체) {
			
			System.out.println("로우킥을 날립니다!.");
			주인공객체.P = 주인공객체.P-30;
			System.out.println("나의 체력이 30 만큼 감소하여 "+주인공객체.P+"가 되었습니다.");
         	}
	
	
         public void 훅공격(주인공 주인공객체) {
 			
			System.out.println("훅을 날립니다!.");
			주인공객체.P = 주인공객체.P-40;
			System.out.println("나의 체력이 30 만큼 감소하여 "+주인공객체.P+"가 되었습니다.");
         	}
	
	
	
	
}
