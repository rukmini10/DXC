<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePlayWithNumberServiceProxyid" scope="session" class="com.dxc.training.ws.PlayWithNumberServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePlayWithNumberServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = samplePlayWithNumberServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        samplePlayWithNumberServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.dxc.training.ws.PlayWithNumberService getPlayWithNumberService10mtemp = samplePlayWithNumberServiceProxyid.getPlayWithNumberService();
if(getPlayWithNumberService10mtemp == null){
%>
<%=getPlayWithNumberService10mtemp %>
<%
}else{
        if(getPlayWithNumberService10mtemp!= null){
        String tempreturnp11 = getPlayWithNumberService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String in0_1id=  request.getParameter("in016");
        int in0_1idTemp  = Integer.parseInt(in0_1id);
        java.lang.String numberType13mtemp = samplePlayWithNumberServiceProxyid.numberType(in0_1idTemp);
if(numberType13mtemp == null){
%>
<%=numberType13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(numberType13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String in0_2id=  request.getParameter("in021");
        int in0_2idTemp  = Integer.parseInt(in0_2id);
        int numberSquare18mtemp = samplePlayWithNumberServiceProxyid.numberSquare(in0_2idTemp);
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(numberSquare18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
break;
case 23:
        gotMethod = true;
        String in0_3id=  request.getParameter("in026");
        int in0_3idTemp  = Integer.parseInt(in0_3id);
        int numberSum23mtemp = samplePlayWithNumberServiceProxyid.numberSum(in0_3idTemp);
        String tempResultreturnp24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(numberSum23mtemp));
        %>
        <%= tempResultreturnp24 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>