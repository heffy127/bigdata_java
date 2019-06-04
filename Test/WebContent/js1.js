/**
 * 
 */

function login() {
		data1 = document.getElementById("id") /* 'id'tag값 가져오기 */
		dataId = data1.value	/* 입력값 추출 */
		data2 = document.getElementById("pw") /* 'id'tag값 가져오기 */
		dataPw = data2.value	/* 입력값 추출 */
		if(dataId == "park" && dataPw == "1234" ){
			location.href="login.jsp?id="+dataId+"&pw="+dataPw /* get방식으로 값 넘기기 */
		}else{
			alert("id나 비밀번호를 확인해주세요")
		}
	}

function welcome() {
	alert("매너있는 거래 부탁합니다.")
}