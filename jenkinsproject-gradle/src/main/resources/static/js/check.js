function pwCheck(){
	pw = document.getElementById('pw').value;
	pw2 = document.getElementById('pw2').value;
	if(pw == pw2){
		 document.getElementById('label').innerHTML = "일치";
	}else{
		 document.getElementById('label').innerHTML = "불일치";
		 document.getElementById('pw').value = "";
		 document.getElementById('pw2').value = ""; 
	}
}

function allCheck(){
	if(document.getElementById('id').value == ""){
		alert('필수 입력 정보 입니다.');
		return;
	}
	if(document.getElementById('pw').value == ""){
		alert('필수 입력 정보 입니다.');
		return; 
	}
	document.getElementById('f').submit();
}

