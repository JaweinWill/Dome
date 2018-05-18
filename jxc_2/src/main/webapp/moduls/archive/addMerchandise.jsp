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
		if (idStr == 'info_price') {
			if (obj.value == "") {
				document.getElementById(idStr).innerHTML = "价格不能为空";
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

	商品管理->商品档案->新增
	<p>
	<form action="merchandiseAction_saveMerchandise" method="post"
		onSubmit="return v()">
		<table>
			<tr>
				<td>商品编号</td>
				<td><input type="text" name="merchandise.code"
					onblur="validate(this,'info_code')" /></td>
				<td id="info_code" style="color: red"></td>
			</tr>
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="merchandise.name"
					onblur="validate(this,'info_name')" /></td>
				<td id="info_name" style="color: red"></td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><input type="text" name="merchandise.price"
					onblur="validate(this,'info_price')" /></td>
				<td id="info_price" style="color: red"></td>
			</tr>
			<tr>
				<td><input type="submit" value="保存" /></td>
				<td><input type="button" value="返回" /></td>
			</tr>
		</table>
	</form>

</body>
</html>