package 생성자;

public class TV {
	public int ch;	//0으로 초기화
	public int vol;
	public boolean onOff; //false초기화

	//객체 생성할 때마다 꼭 실행시키고 싶은 내용이 있다면 기본 생성자를 눈에 보이게
	//다시 만들어주세요 ( 명시적으로! )
	public TV() {
		 //자동으로 만들어지는 메소드(함수)
		System.out.println("TV객체가 하나 생성됨.");
	}
	//파라미터 있는 생성자가 있을 때는 기본생성자는 자동생성되지 않음!
	public TV(int ch, int vol, boolean onOff) {
		this.ch=ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	public void 채널을바꾸다() {
		int change = 1;
		System.out.println(ch + "에서 " + change + "번호로 바꾸다.");
	}
	public void 유튜브보다() {
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
}
