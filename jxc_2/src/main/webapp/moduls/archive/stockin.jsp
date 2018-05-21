<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<script src="/jxc_2/js/laydate/laydate.js"></script>
<script type="text/javascript">
	//执行一个laydate实例
	laydate.render({
		elem : '#birthday' //指定元素
	});
	
	function redirect(url) {
		document.location = url;
	}
	function del() {
		var form1 = document.getElementById("f1");
		var es = form1.elements;//列举所有form1表单中的子元素
		var i;
		for (i = 0; i < es.length; i++) {
			if (es[i].type == "checkbox" && es[i].checked) {
				break;
			}
		}
		if (i == es.length) {
			alert("请选择要删除的记录！！");
		} else if (window.confirm("确定要删除所选的记录吗？")) {

			form1.action = "clientAction_delClient";
			form1.submit();

		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>进货单</title>
</head>
<body>
	<s:debug></s:debug>
	进货管理->进货单
	<p>
	<form id="f1" action="stockinAction_findStockin" method="get">
		进货单编号：<input type="text" name="stockin.code" />
		 货物名称：
		<s:select list="merchandises" name="stockin.merchandise.id"
			listKey="id" listValue="name" emptyOption="true">
		</s:select>

		供应商：
		<s:select list="clients" name="stockin.client.id"
			listKey="id" listValue="name" emptyOption="true">
		</s:select>
		<p></p>
		进货日期：<input type="text" name="stockin.stockindate" id="birthday">
		经手人：<select>
			<option value="测试">测试</option>
		</select>
		<p></p>
		<input type="submit" value="查找"> <input type="button"
			value="新增" onclick="redirect('<%=basePath%>stockinAction_preSaveStockin')">
		<input type="button" value="删除" onclick="del()" />

		<hr />
		<table border="1">
			<tr>
				<th>选择</th>
				<th>修改</th>
				<th>进货单编号</th>
				<th>供应商</th>
				<th>货物名称</th>
				<th>货物数量</th>
				<th>货物单价（元）</th>
				<th>货物金额（元）</th>
				<th>进货日期</th>
				<th>经手人</th>
			</tr>
			<s:iterator value="stockins">
				<tr>
					<td><input type="checkbox" name="sel"
						value='<s:property value="id" />'></td>
					<td><a
						href='stockinAction_updateClient?stockin.code=<s:property value="code"/>'>修改</a></td>
					<td><s:property value="code" /></td>
					<td><s:property value="client.name" /></td>
					<td><s:property value="merchandise.name" /></td>
					<td><s:property value="amount" /></td>
					<td><s:property value="price" /></td>
					<td><s:property value="money" /></td>
					<td><s:property value="stockindate" /></td>
				</tr>
			</s:iterator>
		</table>
	</form>
</body>
</html>