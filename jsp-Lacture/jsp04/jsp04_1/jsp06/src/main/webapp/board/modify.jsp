<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<%
String idx = request.getParameter("idx");

System.out.println(idx);

String driver = "oracle.jdbc.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String id = "KIMJIEUN99";
String pw = "1112";

Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

String userName = null;
String subject = null;
String contents = null;
String regDate = null;

String sql = "SELECT * FROM BOARD WHERE NO = ?";

try {
Class.forName(driver);
conn = DriverManager.getConnection(url, id, pw);
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, idx);
rs = pstmt.executeQuery();

if(rs.next()){
	userName = rs.getString("userName");
	subject = rs.getString("subject");
	contents = rs.getString("contents");
	regDate = rs.getString("regDate");
 }
} catch(Exception e){
	e.printStackTrace();
} finally {
	if(rs!=null) rs.close();
	if(pstmt!=null) pstmt.close();
	if(conn!=null) conn.close();
	
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="modifyProcess.jsp" method="POST">
<input type="hidden" name="idx" value="<%= idx %>">
<table>
    <colgroup>
        <col style="width: 20%">
        <col style="width: 80%">
    </colgroup>
    <tbody>
        <tr>
            <th>이름</th>
            <td>
                <input type="text" name="userName" id="" value="<%= userName %>" readonly>
            </td>
        </tr>
        <tr>
            <th>제목</th>
            <td>
                <input type="text" name="subject" id="" value="<%= subject %>" readonly >
            </td>
        </tr>
        <tr>
            <th>비밀번호</th>
            <td>
                <input type="text" name="userPW" id="">
            </td>
        </tr>
        <tr>
            <th>내용</th>
            <td>
                <textarea name="contents" id="" cols="30" rows="10">
                <%= contents %>
                </textarea>
            </td>
        </tr>
    </tbody>
</table>
<input type="hidden" name="idx" value="<%= idx %>">
<div>
    <button class="btn confirm">확인</button>
    <button type="reset" class="btn reset">취소</button>
</div>
</form>
</body>
</html>
<%@ include file="../include/footer.jsp" %>