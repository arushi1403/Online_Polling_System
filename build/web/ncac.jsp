<%@page import="java.sql.*"%>
<%
try
{
String name=request.getParameter("name");
String address=request.getParameter("address");
String date=request.getParameter("date");
String mobileno=request.getParameter("mobileno");
String pass=request.getParameter("password");
String test="0";
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/bankdb","root",""); 
Statement st=con.createStatement();
st.executeUpdate("insert CustomerTable values('"+name+"','"+address+"','"+date+"','"+mobileno+"','"+pass+"')");
Class.forName("com.mysql.jdbc.Driver");
Connection con1=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/bankdb","root",""); 
Statement st1=con1.createStatement(); 
st1.executeUpdate("insert TransactionTable values('"date+"','"+test+"')");
out.println("ok");       
}
catch(Exception e)
{
    System.out.println(e);
}
%>
           <%@ include file="MasterPage.jsp" %>
<center><h3>New Customer Registration Completed Successfully Thank You...</h3></center>
