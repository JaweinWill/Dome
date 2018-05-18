<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function redirect(url) {
		document.location = url;
	}
	function del() {
		var form1 = document.getElementById("f1");
		var es=form1.elements;//列举所有form1表单中的子元素
		var i;
		for(i=0;i<es.length;i++){
			if(es[i].type=="checkbox"&&es[i].checked){
				break;
			}
		}
		if(i==es.length){
			alert("请选择要删除的记录！！");
		}else if (window.confirm("确定要删除所选的记录吗？")) {

			form1.action = "employeeAction_delEmployee";
			form1.submit();

		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工档案</title>
</head>
<body>
	档案管理->员工档案
	<p>
	<form id="f1" action="employeeAction_findEmployee" method="get">
		员工编号：<input type="text" name="employee.code" /> 员工名称：<input
			type="text" name="employee.name" />
		<p></p>
		<input type="submit" value="查找"> <input type="button"
			value="新增" onclick="redirect('/jxc_2/moduls/archive/addEmployee.jsp')"> <input
			type="button" value="删除" onclick="del()" />

		<hr />
		<table border="1">
			<tr>
				<th>选择</th>
				<th>修改</th>
				<th>员工编号</th>
				<th>员工名称</th>
				<th>出生年月日</th>
				<th>员工性别</th>
				<th>员工电话</th>
				<th>员工Email</th>
			</tr>
			<s:iterator value="employees">
				<tr>
					<td><input type="checkbox" name="sel"
						value='<s:property value="id" />'></td>
					<td><a
						href='employeeAction_updateEmployee?employee.code=<s:property value="code"/>'>修改</a></td>
					<td><s:property value="code" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="birthday" /></td>
					<td><s:property value="sex" /></td>
					<td><s:property value="telephone" /></td>
					<td><s:property value="email" /></td>
				</tr>
			</s:iterator>
		</table>
	</form>
</body>
</html>