function 로그인() {
	id2 = 'root';
	id = prompt('아이디 입력')
	if (id == id2) { //==
		alert('로그인 성공')
	} else {
		alert('로그인 실패')
	}
}

function 비교() {
	n1 = 100
	n2 = 200
	
	if(n1 == n2)
		alert('두 숫자가 동일합니다.')
	else
		alert('두 숫자는 동일하지 않습니다')
	
	f1 = prompt('친구의 기분(굿, 별로, 나빠)중 입력')
	f2 = prompt('나의 기분(굿, 별로, 나빠)중 입력')
	
	if(f1 == f2)
		alert('우리는 기분도 똑같다')
	else
		alert('우리 오늘 따로 놀자')
}