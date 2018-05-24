<%@page import="java.util.Map"%>
<%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="org.apache.struts2.dispatcher.mapper.ActionMapping" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>操作成功</title>
</head>
<body>
<s:debug></s:debug>
<%-- <s:property value="#request['struts.actionMapping']['name']"/> --%>
<%
  ActionContext context=ActionContext.getContext();
  ValueStack valueStack=context.getValueStack();
  ActionMapping map=(ActionMapping)context.getContextMap().get("struts.actionMapping");
  String data=map.getName();
  String url=data.replaceAll("saveOrUpdate|save", "find");
%>
<h2>操作完成！10秒中后自动返回查询页面或点击<a href='<%=url%>'>此处</a>立即返回</h2>
</body>
</html>