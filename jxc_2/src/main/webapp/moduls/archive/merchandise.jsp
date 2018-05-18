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

			form1.action = "merchandiseAction_delMerchandise";
			form1.submit();

		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品档案</title>
</head>
<body>
<s:debug></s:debug>
	档案管理->商品档案
	<p>
	<form id="f1" action="merchandiseAction_findMerchandise" method="get">
		商品编号：<input type="text" name="merchandise.code" /> 商品名称：<input
			type="text" name="merchandise.name" />
		<p></p>
		<input type="submit" value="查找"> <input type="button"
			value="新增" onclick="redirect('/jxc_2/moduls/archive/addMerchandise.jsp')"> <input
			type="button" value="删除" onclick="del()" />

		<hr />
		<table border="1">
			<tr>
				<th>选择</th>
				<th>修改</th>
				<th>商品编号</th>
				<th>商品名称</th>
				<th>商品价格（元）</th>
			</tr>
			<s:iterator value="merchandises">
				<tr>
					<td><input type="checkbox" name="sel"
						value='<s:property value="id" />'></td>
					<td><a
						href='merchandiseAction_updateMerchandise?merchandise.id=<s:property value="id"/>'>修改</a></td>
					<td><s:property value="code" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="price"/></td>
				</tr>
			</s:iterator>
		</table>
	</form>
</body>
</html>