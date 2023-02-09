package 배열;

public class 배열기초 {
	public static void main(String[] args) {
		//1.int크기 5인 배열 생성
		int[] arr = new int[5];
		
		//2.배열의 크기를 프린트
		System.out.println(arr.length);
		
		//3.배열의 첫번째 위치에 100을 넣어서 프린트
		arr[0] = 100;
		System.out.println(arr[0]);
		
		//4.배열의 마지막 위치에 500을 넣어서 프린트
		arr[4] = 500;
		System.out.println(arr[4]);
		
		//5.배열의 3번째 위치에 200을 넣어서 프린트
		arr[2] = 200;
		System.out.println(arr[2]);
		
		//6.배열의 전체 데이터를 프린트
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		
		//7.배열의 전체 데이터를 인덱스와 함께 프린트
		for (int i = 0; i < arr.length; i++) {
			System.out.println("인덱스 " + i + " : " + arr[i] + " ");
		}
		
		
		//8.그림으로 그려보기
		
	}
}
