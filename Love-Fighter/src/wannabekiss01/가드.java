package wannabekiss01;

public class 가드 extends 캐릭터 {

	
	int 악당P = 600;
	
	public 가드() {
	}
	
	
	
	public void 가드테이저건공격(주인공 주인공객체) {
		
			System.out.println("가드가 테이저건을 쏩니다!.");
			주인공객체.P = 주인공객체.P-100;
			System.out.println("나의 체력이 100 만큼 감소하여 "+주인공객체.P+"가 되었습니다.");
         	}
		
		
	
	
}
