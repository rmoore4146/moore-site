<!DOCTYPE html>
<html lang="en">

<%--Include page <head> element & additional page-specific javascript--%>
<%@include file="decorator/commonHeadElement.jsp"%>
<%--<script type="text/javascript" src="${contextPath}/site/javascript/wedding.js"></script>--%>

<body>

<div id="wrap">

    <%--Include header--%>
    <%@include file="decorator/header.jsp"%>

    <%--Body goes here--%>
    <div class="container bodyContainer">
        <div class="jumbotron">
            <h2>Contact me...</h2>
            </br>
            <p><a href="mailto:rmoore4146@gmail.com">email</a></p>
            <p><a href="<fmt:message key="twitter.link"/>">twitter</a></p>
            <p><a href="<fmt:message key="github.link"/>">github</a></p>
            <p><a href="<fmt:message key="linkedin.link"/>">linkedin</a></p>
        </div>
    </div>
</div>

<%--Include Footer--%>
<%@include file="decorator/footer.jsp"%>
</body>
</html>
