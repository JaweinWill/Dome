<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/jxc_2/js/laydate/laydate.js"></script>
<script type="text/javascript">
	//执行一个laydate实例
	laydate.render({
		elem : '#birthday' //指定元素
	});

	//obj要验证的控件（编号文本框）idStr是一个字符串内容是info_code
	var flag = true;
	function validate(obj, idStr) {
		if (idStr == 'info_code') {
			if (obj.value == "" || obj.value.length > 3) {
				document.getElementById(idStr).innerHTML = "长度不能为空且不超过3位";
				obj.value = "";
				flag = false;
			} else {
				document.getElementById(idStr).innerHTML = "";
				flag = true;
			}
		}
		if (idStr == 'info_name') {
			if (obj.value == "" || obj.value.length > 10) {
				document.getElementById(idStr).innerHTML = "长度不能为空且不超过10位";
				obj.value = "";
				flag = false;
			} else {
				document.getElementById(idStr).innerHTML = "";
				flag = true;
			}
		}
		if (idStr == 'info_birth') {
			if (obj.value == "") {
				document.getElementById(idStr).innerHTML = "日期不能为空";
				obj.value = "";
				flag = false;
			} else {
				document.getElementById(idStr).innerHTML = "";
				flag = true;
			}
		}
		if (idStr == 'info_tel') {
			if (obj.value == ""
					|| (obj.value.length != 11 && obj.value.length != 12)) {
				document.getElementById(idStr).innerHTML = "电话不能为空，且只能为11或12位";
				obj.value = "";
				flag = false;
			} else {
				document.getElementById(idStr).innerHTML = "";
				flag = true;
			}
		}
		if (idStr == 'info_email') {
			var regex = /^([0-9A-Za-z\-_\.]+)@([0-9a-z]+\.[a-z]{2,3}(\.[a-z]{2})?)$/g;
			if (!regex.test(obj.value)) {
				document.getElementById(idStr).innerHTML = "email输入有误";
				obj.value = "";
				flag = false;
			} else {
				document.getElementById(idStr).innerHTML = "";
				flag = true;
			}
		}
	}
	function v() {
		return flag;
	}
</script>

<title>增加员工</title>
</head>
<body>
	档案管理->员工档案->新增
	<p>
	<form action="employeeAction_saveEmployee" method="post"
		onSubmit="return v()">
		<table>
			<tr>
				<td>员工编号</td>
				<td><input type="text" name="employee.code"
					onblur="validate(this,'info_code')" /></td>
				<td id="info_code" style="color: red"></td>
			</tr>
			<tr>
				<td>员工名称</td>
				<td><input type="text" name="employee.name"
					onblur="validate(this,'info_name')" /></td>
				<td id="info_name" style="color: red"></td>
			</tr>
			<tr>
				<td>出生年月日</td>
				<td><input type="text" id="birthday" name="employee.birthday"
					onblur="validate(this,'info_birth')"></td>

				<td id="info_birth" style="color: red"></td>
			</tr>
			<tr>
				<td>员工性别</td>
				<td><select name="employee.sex">
						<option value="男">男</option>
						<option value="女">女</option>
				</select></td>
				<td id="info_sex"></td>
			</tr>
			<tr>
				<td>员工电话</td>
				<td><input type="text" name="employee.telephone"
					onblur="validate(this,'info_tel')" /></td>
				<td id="info_tel" style="color: red"></td>
			</tr>
			<tr>
				<td>员工Email</td>
				<td><input type="text" name="employee.email"
					onblur="validate(this,'info_email')" /></td>
				<td id="info_email" style="color: red"></td>
			</tr>
			<tr>
				<td><input type="submit" value="保存" /></td>
				<td><input type="button" value="返回" /></td>
			</tr>
		</table>
	</form>

</body>
</html>