<%@page import="java.sql.*"%>
<%
try{
String p="INC"; 
int v=0;
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/peopledb","root",""); 
Statement stmt=con.createStatement(); 
Statement stmt1=con.createStatement(); 
ResultSet rs=stmt.executeQuery("select * from polling where Partities='"+p+"'");
           while(rs.next())
{
v=rs.getInt("nofvotes");
v=v+1;
          }
String SQL = "Update polling set nofvotes = '"+v+"' where Partities = "+p+"";
      stmt1.executeUpdate(SQL);

}
    catch(Exception e)
{
    System.out.println(e);
}
%>
<html>
<body>
 <%@ include file="PLoginSuccess.jsp" %> 
</body>
</html>