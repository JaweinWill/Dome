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
</script>

<title>修改进货</title>
</head>
<body>
<s:debug></s:debug>
	进货管理->进货单->修改
	<p>
	<form action="stockinAction_saveOrUpdateStockin" method="post"
		onSubmit="return v()">
		<input type="hidden" name="stockin.id"
			value='<s:property value="stockin.id" />' />
		<table>
			<tr>
				<td width="30%">进货单编号<input type="text" name="stockin.code" value='<s:property value="stockin.code" />'     /></td>
				<td width="35%">货物名称<s:select list="merchandises"
						name="stockin.merchandise.id" listKey="id" listValue="name"
						emptyOption="true" theme="simple">
					</s:select></td>
				<td width="35%">进货数量<input type="text" name="stockin.amount" value='<s:property value="stockin.amount" />' /></td>
			</tr>
			<tr>
				<td>进货日期<input type="text" name="stockin.stockindate" value='<s:property value="stockin.stockindate" />' 
					id="birthday"/></td>

				<td>经手人<s:select list="employees" name="stockin.employee.id"
						listKey="id" listValue="name" emptyOption="true" theme="simple">
					</s:select></td>
				<td>供应商<s:select list="clients" name="stockin.client.id"
						listKey="id" listValue="name" emptyOption="true" theme="simple">
					</s:select></td>
			</tr>
			<tr>
				<td>货物单价（元）<input type="text" name="stockin.price" value='<s:property value="stockin.price" />'/></td>
				<td>货物金额（元）<input type="text" name="stockin.money" value='<s:property value="stockin.money" />'/></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="submit" value="保存" /></td>
				<td><input type="button" value="返回" /></td>
				<td></td>
			</tr>
		</table>
	</form>

</body>
</html>