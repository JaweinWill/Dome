<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
</head>
<body>
	<s:debug></s:debug>
	商品管理->商品档案->修改
	<p>
	<form action="merchandiseAction_saveOrUpdateMerchandise" method="post">
		<s:hidden name="merchandise.id"></s:hidden>
		<table>
			<tr>
				<td>商品编号</td>
				<td><input type="text" name="merchandise.code"
					value="<s:property value="merchandise.code"/>"
					onblur="validate(this,'info_code')" readonly="readonly" /></td>
				<td id="info_code" style="color: red"></td>
			</tr>
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="merchandise.name"
					value='<s:property value="merchandise.name"/>'
					onblur="validate(this,'info_name')" /></td>
				<td id="info_name" style="color: red"></td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><input type="text" name="merchandise.price"
					value='<s:property value="merchandise.price"/>'
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