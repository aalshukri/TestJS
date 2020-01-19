<!doctype html>
<%
response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader ("Expires", 0);
//prevents caching at the proxy server
%>

<%-- Comment --%>
<html>
<head><title>JSP Page</title></head>
<body>
<h1>It works!</h1>
<%
  for (int i = 0; i < 5; ++i) {
      out.println("<p>Hello, world!</p>");
  }
%>

<div>
<p>Lucky...?</p>
<% double num = Math.random(); %>

<% if (num > 0.95) { %>
      <h2>You'll have a luck day!</h2><p>(<%= num %>)</p>
<% } else { %>
      <h2>Well, life goes on ... </h2><p>(<%= num %>)</p>
<% } %>
<a href="<%= request.getRequestURI() %>"><h3>Try Again</h3></a>
</div>

<div>
 <h2>Calcs</h2>

<p>\${1 + 2}</p>
<p>${1 + 2}</p>

</div>

</body>
</html>
