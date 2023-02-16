package 생성자;

public class 수강신청 {
	String 수강과목;
	String 수강시간;
	String 수강생이름;
	
	@Override
	public String toString() {
		return "수강신청 [수강과목=" + 수강과목 + ", 수강시간=" + 수강시간 + ", 수강생이름=" + 수강생이름 + "]";
	}
	public 수강신청(String 수강과목, String 수강시간, String 수강생이름) {
		this.수강과목 = 수강과목;
		this.수강시간 = 수강시간;
		this.수강생이름 = 수강생이름;
	}
	
}
