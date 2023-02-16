package 스태틱;

public class 회사창업 {
	public static void main(String[] args) {
		직원 emp1 = new 직원("홍길동", 25, "여");
		직원 emp2 = new 직원("김길동", 24, "남");
		직원 emp3 = new 직원("고길동", 26, "여");
		
		System.out.println("1)우리회사의 직원 수는? " + Day.count + "명");
		System.out.println("2)우리회사 각 직원들의 정보 ");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		System.out.print("3)우리회사 직원의 평균나이는? ");
		직원.getAvg();
		
	}
}
