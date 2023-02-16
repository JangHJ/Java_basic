package 상속;

public class 수퍼맨 extends 맨{
	boolean fly;
	
	public void space() {
		sleep();
		System.out.println("이름은 " + name);
		System.out.println("우주를 날다.");
	}
	
	@Override
	public void eat() {
		System.out.println("많이 먹다");
	}

	@Override
	public String toString() {
		return "수퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
}