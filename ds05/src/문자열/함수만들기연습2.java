package 문자열;

public class 함수만들기연습2 {

	public static void 세수하기() {
		System.out.println("세수1)물 ");
		System.out.println("세수2)수건 닦는다. ");
	}
	public static void 밥먹기(String when) {
		for (int i = 0; i < 20; i++) {
			System.out.println(when + "밥먹기1)밥을 먹는다. ");
			System.out.println(when + "밥먹기2)반찬을 먹는다. ");
		}
	}
	public static void 운동하기(String location) {
		System.out.println("운동하기1)운동화를 신는다. ");
		System.out.println("운동하기2) " + location + "에서 빨리 걷는다. ");
	}
	public static void 잠자기(String when) {
		System.out.println(when + "자기1)불을 끈다. ");
		System.out.println(when + "자기2)이불을 덮는다. ");
	}
	public static void main(String[] args) {
		//내가 일어나서 하는 일.
		//1. 세수하기
		System.out.println("1. 세수하기");
		//2. 밥먹기(아침)
		밥먹기("아침");
		//3. 운동하기(운동장)
		운동하기("운동장");
		//4. 잠자기(낮잠)
		잠자기("낮잠");
		//5. 밥먹기(점심)
		밥먹기("점심");
		//6. 세수하기(외출준비)
		System.out.println("6. 세수하기");
		//7. 화장하기
		System.out.println("7. 화장하기");
		//8. 밥먹기(저녁)
		밥먹기("저녁");
		//9. 운동하기(공원)
		운동하기("공원");
		//10. 잠자기(저녁)
		잠자기("저녁");
	}
}
