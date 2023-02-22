package 인터페이스;

public class 컴퓨터사용2 {

	public static void main(String[] args) {
		//Computer com = new Computer();
		//인터페이스는 불완전하기 때문에 이것을 틀로해서 객체 생성불가능!!
		//따라서 아래처럼 익명클래스로 사용해야함.
		Computer com = new Computer() {
			
			@Override
			public void 코딩을하다() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void 인터넷을하다() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void 유튜브를보다() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
