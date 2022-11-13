<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글입력</title>
<style>
	#container { width: 700px; margin: auto; }
	h1, h3, p { text-align: center; }
	table { border-collapse: collapse; }
	table, th, td {
		border: 1px solid black;
		margin: 0 auto;
	}
	th { background-color: orange; }
	.center { text-align: center; }
	.border-none, .border-none td { border: none; }
</style>
</head>
<body>
<div id="container">
	<h1>게시글 입력 [insertBoard.jsp]</h1>
	<p><a href="logout.do">로그아웃</a></p>
	
	<form action="insertBoard.do" method="post">
	<table>
		<tr>
			<th width="70">제목</th>
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<th width="70">작성자</th>
			<td><input type="text" name="writer"></td>
		</tr>
		<tr>
			<th width="70">내용</th>
			<td>
				<textarea name="content" rows="10" cols="40"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2" class="center">
				<input type="submit" value="새 글 등록">
			</td>
		</tr>
	</table>
	</form>
	<p>
		<a href="getBoardList.do">글 목록 가기</a>
		<!-- getBoardList.jsp로 이동하면 이전으로 효과 (새 데이터 넘어오지 않음) -->
	</p>
</div>
</body>
</html>