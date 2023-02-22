package 인터페이스;

public class AppleComputer implements Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void 유튜브를보다() {
		System.out.println("유튜브에서 예능영상을 보다");
	}

	@Override
	public void 인터넷을하다() {
		System.out.println("크롬으로 인터넷을 사용하다.");
	}

	@Override
	public void 코딩을하다() {
		System.out.println("이클립스IDE로 자바코딩을 하다.");
	}

}
