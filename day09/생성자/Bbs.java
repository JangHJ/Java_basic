package 생성자;

public class Bbs {
	int no;
	String title;
	String content;
	String writer;
	
	public Bbs(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Bbs [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

	
}
