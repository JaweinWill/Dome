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

<title>增加进货</title>
</head>
<body>

	进货管理->进货单->新增
	<p>
	<form action="stockinAction_saveStockin" method="post"
		onSubmit="return v()">
		<table>
			<tr>
				<td width="40%">进货单编号<input type="text" name="stockin.code" /></td>
				<td width="40%">货物名称<s:select list="merchandises" name="stockin.merchandise.id"
						listKey="id" listValue="name" emptyOption="true" theme="simple">
					</s:select></td>
				<td>进货数量<input type="text" name="stockin.amount" /></td>
			</tr>
			<tr>
				<td>进货日期<input type="text" name="stockin.stockindate" id="birthday"></td>
	
				<td>经手人<select>
						<option value="测试">测试</option>
				</select></td>
				<td>供应商<select>
						<option value="测试">测试</option>
				</select></td>
			</tr>
			<tr>
				<td>货物单价（元）<input type="text" name="stockin.price" /></td>
				<td>货物金额（元）<input type="text" name="stockin.money" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="保存" /></td>
				<td><input type="button" value="返回" /></td>
			</tr>
		</table>
	</form>

</body>
</html>