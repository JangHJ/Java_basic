package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame {
	//add(), setSize(),,,,
	JLabel count, image, time; //전역변수 선언!
	public static void main(String[] args) {
		스레드그래픽 f = new 스레드그래픽();
		//객체 생성시 클래스 이름과 동일한 메소드를 자동호출
		//==> 생성자 메서드!!를 자동호출
	}
	
	public 스레드그래픽() {
		setTitle("내 스레드 그래픽");
		setSize(500, 250);
		getContentPane().setBackground(Color.green);
		FlowLayout flow =  new FlowLayout();
		setLayout(flow);
		Font font = new Font("궁서", Font.BOLD, 30);
		count = new JLabel("카운터");
		ImageIcon icon = new ImageIcon("1.png");
		image = new JLabel(icon);
		time = new JLabel("시각");		
		count.setFont(font);
		time.setFont(font);
		
		add(count);
		add(image);
		add(time);
		
		//스레드 객체 3개만들어서 START해보자
		이미지스레드2 image2 = new 이미지스레드2();
		타이머스레드2 time2 = new 타이머스레드2();
		카운트스레드2 count2 = new 카운트스레드2();
		
		count2.start();
		image2.start();
		time2.start();
		
		
		
		setVisible(true);
	}
	//내부클래스(inner class) ==> 전역변수 공유할 목적으로 사용
	//자주 쓰진 않지만.
	public class 이미지스레드2 extends Thread {

		@Override
		public void run() {
			String[] images = {
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png"
			};
			for (int i = 0; i < images.length; i++) {
				//System.out.println("이미지>> " + images[i]);
				image.setIcon(new ImageIcon(images[i]));
				try {
					Thread.sleep(5000); //5초재워라! //ms(밀리세컨즈)
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
	public class 타이머스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				//System.out.println("타이머>> " + date);
				time.setText("타이머>> " + date);
				try {
					Thread.sleep(1000); //1초재워라!
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
	public class 카운트스레드2 extends Thread { //run()

		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트>> " + i);
				//cpu에게 스레드 쉬는 시간 텀을 알려줍시다.!!
				//thread를 잠깐 재울 수 있음.
				//cpu는 외부자원입니다. 
				//자바가 외부자원을 연결할 때는 엄청! 위험해!!!라는 상황으로 인식!!
				//만약에 문제가 생기면, 어떻게 할지를 코드를 반드시 해주어야 해ㅏㅁ.
				try {
					Thread.sleep(1000); //1초재워라!
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
}
