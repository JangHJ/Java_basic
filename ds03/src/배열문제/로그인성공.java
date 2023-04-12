package 배열문제;

public class 로그인성공 {

	public static void main(String[] args) {
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"rardss", "123"},
						{"yyoom", "1234"},
						{"meosseugi", "1234"}};
		Solution7 sol = new Solution7();
		String answer = sol.solution(id_pw, db);
		System.out.println(answer);
	}
}
class Solution7 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        boolean id=false;
        boolean pw=false;
        for(int i=0; i<db.length; i++){
            if(db[i][0].equals(id_pw[0]) == true){ //아이디가 맞을 때
                if(db[i][1].equals(id_pw[1]) == true){
                    id = true;
                    pw = true;
                }else
                    id = true;
            }
        }
        if(id == true && pw == true){
            answer = "login"; 
        }else if(id == true && pw == false){
            answer = "wrong pw";
        }
        
        return answer;
    }
}