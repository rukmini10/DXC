 <%@page import="com.dxc.banking.register.RegisterDao"%>  
<jsp:useBean id="member" class="com.dxc.banking.register.Member"></jsp:useBean>  
<jsp:setProperty property="*" name="member"/>   
    
<%  
RegisterDao.update(member);  
response.sendRedirect("displayMember.jsp");  
%> 