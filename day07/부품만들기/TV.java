package 부품만들기;

public class TV {
	public int ch;	//0으로 초기화
	public int vol;
	public boolean onOff; //false초기화
	
	public void 채널을바꾸다() {
		int change = 1;
		System.out.println(ch + "에서 " + change + "번호로 바꾸다.");
	}
	public void 유튜브보다() {
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
}
