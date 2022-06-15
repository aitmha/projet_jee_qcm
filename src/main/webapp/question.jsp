<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="services.*,beans.*,java.util.*"%>
    <jsp:useBean  id="form" class="beans.form"  scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! List<question> listq = new ArrayList<question>(); 
   List<reponse> listr = new ArrayList<reponse>();
    String question; String reponse;%>
   <%
     listq = dao_question.getQuestions(form.getId_form());
     for( question q : listq){
   %>
	 <%= q.getId_question()%><b><%= q.getLib_question()%></b><br/>
	  <form action="" method="get">
	   <% 
	     listr =dao_reponse.getReponseFor(q.getId_question()); 
	     for(reponse r : listr){ 
	   %>
		   <input type="radio" name="repQ<%=q.getId_question() %>" value="<%=r.getId_reponse()%>"><label><%= r.getLib_reponse() %> </label><br/>
	  <% } %> 
	   </form>
   <% } %>


</body>
</html>