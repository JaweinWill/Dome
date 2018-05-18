<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="/jxc_2/js/laydate/laydate.js"></script>
<script type="text/javascript">
	//执行一个laydate实例
	laydate.render({
		elem : '#birthday' //指定元素
	});
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
</head>
<body>
	<s:debug></s:debug>
	档案管理->员工档案->修改
	<p>
	<form action="employeeAction_saveOrUpdateEmployee" method="post">
		<s:hidden name="employee.id"></s:hidden>
		<table>
			<tr>
				<td>员工编号</td>
				<td><input type="text" name="employee.code"
					value="<s:property value="employee.code"/>"
					onblur="validate(this,'info_code')" readonly="readonly" /></td>
				<td id="info_code" style="color: red"></td>
			</tr>
			<tr>
				<td>员工名称</td>
				<td><input type="text" name="employee.name"
					value='<s:property value="employee.name"/>'
					onblur="validate(this,'info_name')" /></td>
				<td id="info_name" style="color: red"></td>
			</tr>
			<tr>
				<td>出生年月日</td>
				<td><input type="text" name="employee.birthday" id="birthday"
					value='<s:property value="employee.birthday"/>'
					onblur="validate(this,'info_birth')" /></td>
				<td id="info_birth" style="color: red"></td>
			</tr>
			<tr>
				<td>员工性别</td>
				<td><s:if test="employee.sex=='男'">
						<select name="employee.sex">
							<option value="男" selected>男</option>
							<option value="女">女</option>
						</select>
					</s:if> <s:else>
						<select name="employee.sex">
							<option value="男">男</option>
							<option value="女" selected>女</option>
						</select>
					</s:else></td>
				<td id="info_sex"></td>
			</tr>
			<tr>
				<td>员工电话</td>
				<td><input type="text" name="employee.telephone"
					value='<s:property value="employee.telephone"/>'
					onblur="validate(this,'info_tel')" /></td>
				<td id="info_tel" style="color: red"></td>
			</tr>
			<tr>
				<td>员工Email</td>
				<td><input type="text" name="employee.email"
					value='<s:property value="employee.email"/>'
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