package 확인문제;

import javax.swing.JOptionPane;

public class 문자열스레드 extends Thread {

	public void run() {
		String[] strs = {"로딩 중입니다.", "아직 로딩 중입니다.", "조금만 더 기다려주세요..", "조금 남았습니다....", "끝!"};
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
			try {
				Thread.sleep(5000); // 1000 -> 1초
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
