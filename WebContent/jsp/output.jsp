<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html:html>
<head>
<title>Output</title>
</head>
<body>
Ans=<bean:write name="numberForm" property="ans"/><br/>
<bean:message key="message.result"/>
</body>
</html:html>
