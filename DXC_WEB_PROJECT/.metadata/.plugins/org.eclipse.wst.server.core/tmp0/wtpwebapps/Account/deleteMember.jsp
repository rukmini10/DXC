<%@page import="com.dxc.banking.registration.RegisterDao"%>  
<jsp:useBean id="member" class="com.dxc.banking.registration.Member"></jsp:useBean>  
<jsp:setProperty property="*" name="member"/>  
<%  
RegisterDao.delete(member);  
response.sendRedirect("displayMember.jsp");  
%>