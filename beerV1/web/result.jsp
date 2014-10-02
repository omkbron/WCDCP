<%@ page import="java.util.*" %>

<html>
<body>
    <h1 align="center">Beer Recomendations JSP</h1>
	<p>
	    <%
		    List<String> styles = (List<String>) request.getAttribute("styles");
			for (String style : styles) {
			    out.println("<br> try: " + style);
			}
		%>
	</p>
</body>
</html>
