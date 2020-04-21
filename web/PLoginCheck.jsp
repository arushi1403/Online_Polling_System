<%@page import="java.sql.*"%>
<%
try{
String user=request.getParameter("userid");
String pass=request.getParameter("pswrd");
 int count=0;
          Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/peopledb","root",""); 
Statement stmt=con.createStatement(); 
ResultSet rs=stmt.executeQuery("select * from login where Username='"+user+"' and Password='"+pass+"'");
           while(rs.next()){
           count++;
          }
          if(count>0)
{
session.setAttribute( "username", user);
response.sendRedirect("PLoginSuccess.jsp");        
           }
          else
{ System.out.println("wrong"); }
        }
    catch(Exception e){
    System.out.println(e);
}
%>