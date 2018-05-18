<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
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
		if (idStr == 'info_addr') {
			if (obj.value == "") {
				document.getElementById(idStr).innerHTML = "地址不能为空";
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
</head>
<body>
	<s:debug></s:debug>
	档案管理->客户档案->修改
	<p>
	<form action="clientAction_saveOrUpdateClient" method="post">
		<s:hidden name="client.id"></s:hidden>
		<table>
			<tr>
				<td>客户编号</td>
				<td><input type="text" name="client.code"
					value="<s:property value="client.code"/>"
					onblur="validate(this,'info_code')" readonly="readonly" /></td>
				<td id="info_code" style="color: red"></td>
			</tr>
			<tr>
				<td>客户名称</td>
				<td><input type="text" name="client.name"
					value='<s:property value="client.name"/>'
					onblur="validate(this,'info_name')" /></td>
				<td id="info_name" style="color: red"></td>
			</tr>
			<tr>
				<td>地址</td>
				<td><input type="text" name="client.address" 
					value='<s:property value="client.address"/>'
					onblur="validate(this,'info_addr')" /></td>
				<td id="info_addr" style="color: red"></td>
			</tr>
			<tr>
				<td>客户电话</td>
				<td><input type="text" name="client.telephone"
					value='<s:property value="client.telephone"/>'
					onblur="validate(this,'info_tel')" /></td>
				<td id="info_tel" style="color: red"></td>
			</tr>
			<tr>
				<td>客户Email</td>
				<td><input type="text" name="client.email"
					value='<s:property value="client.email"/>'
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