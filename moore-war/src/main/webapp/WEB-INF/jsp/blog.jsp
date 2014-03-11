<!DOCTYPE html>
<html lang="en">

<%--Include page <head> element & additional page-specific javascript--%>
<%@include file="decorator/commonHeadElement.jsp"%>
<%--<script type="text/javascript" src="${contextPath}/site/javascript/wedding.js"></script>--%>

<body>

<div id="wrap">

    <%--Include header--%>
    <%@include file="decorator/header.jsp"%>
        <div class="container bodyContainer">

        <c:forEach items="${blogPosts}" var="blogPost" varStatus="index">
            <div class="jumbotron">
                <h2>${blogPost.title}</h2>
                <h6>By: ${blogPost.author}; ${blogPost.date}</h6>
                <p>${blogPost.text}</p>
            </div>
        </c:forEach>
    </div>
</div>

<%--Include Footer--%>
<%@include file="decorator/footer.jsp"%>
</body>
</html>
