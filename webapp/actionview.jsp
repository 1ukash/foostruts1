<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <h1><bean:write name="ExampleForm" property="message"></bean:write></h1>
        
        <html:form action="/UserAction" method="POST">
        	<html:text property="userName"/> <br>
        	<html:textarea property="userDesc"/><br>
        	<html:password property="userPass"/>
        	<html:submit/>
        </html:form>
    </body>
</html>
