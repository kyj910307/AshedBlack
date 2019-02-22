<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AshedBlack_Member_Join</title>
</head>
<body>
	<form action="" method="post">
		<h1>기본정보</h1>
		<table>
			<tr>
				<th>아이디<span>*</span></th>
				<td><input type="text" name="userid"></td>
			</tr>
			<tr>
				<th>비밀번호<span>*</span></th>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<th>비밀번호 확인<span>*</span></th>
				<td><input type="password" name="repassword"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>주소<span>*</span></th>
				<td><input type="text" name="zipcode"></td>
				<td><button>우편번호 ></button></td>
				<td><input type="text" name="address1">기본주소</td>
				<td><input type="text" name="address1">나머지 주소</td>
			</tr>
			<tr>
				<th>휴대전화<span>*</span></th>
				<td>
					<select name="tel1">
						<option value="">선택</option>
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="018">018</option>
					</select>
					-
					<input type="text" name="tel2">
					-
					<input type="text" name="tel3">
				</td>
			</tr>
			<tr>
				<th>이메일<span>*</span></th>
				<td><input type="text" name="email"></td>
			</tr>
		</table>
		<h2>추가정보</h2>
		<table>
			<tr>
				<th>성별<span>*</span></th>
				<td>
					<select name="year">
						<option value="">선택</option>
						<option value="1989">1989</option>
						<option value="1990">1990</option>
						<option value="1991">1991</option>
					</select>
					년
					<input type="text" name="month">월
					<input type="text" name="day">일
				</td>
			</tr>
			<tr>
				<th>관심분야</th>
				<td><input type="checkbox" name="hobby" value="">예시</td>
			</tr>
		</table>
		<h2>전체 동의</h2>
		<p>[필수]이용약관 동의</p>
		<p>약관내용</p>
		<label>개인정보 수집 및 이용에 동의하십니까?</label><input type="checkbox" name="terms1" value="">동의함
		<p>[필수]이용약관 동의</p>
		<p>약관내용</p>
		<label>개인정보 수집 및 이용에 동의하십니까?</label><input type="checkbox" name="terms2" value="">동의함
		<p>[필수]이용약관 동의</p>
		<p>약관내용</p>
		<label>개인정보 수집 및 이용에 동의하십니까?</label><input type="checkbox" name="terms3" value="">동의함
	</form>
</body>
</html>