<%@include file="includes/taglibs.jsp"%>

<c:set var="contextPath" value=""/>

<!DOCTYPE html>
<html lang="en">
<head>
	<%@include file="includes/metas.jsp"%>
	
    <title>Log in with your credentials</title>

    <%@include file="includes/styles.jsp"%>

</head>

<body>

<div class="container">

    <form method="POST" action="login" class="form-signin">
        <h2 class="form-heading">Log in</h2>

        <div class="form-group ${error != null ? 'has-error' : ''}">
            <span>${msg}</span>
            <input name="username" type="text" class="form-control" placeholder="Username"
                   autofocus="true"/>
            <input name="password" type="password" class="form-control" placeholder="Password"/>
            <span>${errorMsg}</span>
			<br><br>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
        </div>

    </form>
    
    
    <form method="POST" action="logout">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	    <button class="btn btn-lg btn-primary btn-block" type="submit">Log Out</button>
	</form>

</div>
<!-- /container -->
<%@include file="includes/scripts.jsp"%>
</html>