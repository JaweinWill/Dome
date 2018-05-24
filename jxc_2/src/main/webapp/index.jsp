<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>进销存管理系统</title>
</head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<body>
	<h2>欢迎来到XX的进销存后台管理系统</h2>
	<ul>
		<li>档案管理
			<ul>
				<li><a href="<%=basePath%>merchandiseAction_findMerchandise">商品档案</a></li>
				<li><a href="<%=basePath%>clientAction_findClient">客户档案</a></li>
				<li><a href="<%=basePath%>employeeAction_findEmployee">员工档案</a></li>
			</ul>
		</li>
		<li>进货管理

			<ul>
				<li><a href="<%=basePath%>stockinAction_findStockin">进货单</a></li>
			</ul>
		</li>
		<li>销售管理
			<ul>
				<li>订货单</li>
			</ul>
		</li>
	</ul>
</body>
</html>