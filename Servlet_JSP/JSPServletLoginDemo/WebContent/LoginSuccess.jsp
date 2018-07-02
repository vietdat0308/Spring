<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
username:  ${username}

<br />
<%String password = (String)request.getAttribute("passwordVu"); %>
<%= password%>

<jsp:useBean id="stu" class="com.dxc.bean.StudentBean">
	<jsp:setProperty property="fullName" name="stu" value="lyquyduong"/>
</jsp:useBean>

${stu.fullName }
<c:if test="${username != ''}">
      <p>Welcome to ${username} </p>
 </c:if>
</body>
</html>