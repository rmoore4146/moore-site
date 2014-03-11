<!DOCTYPE html>
<html lang="en">

<%--Include page <head> element & additional page-specific javascript--%>
<%@include file="decorator/commonHeadElement.jsp"%>
<script type="text/javascript" src="${contextPath}/site/javascript/blogPost.js"></script>

<body>

<div id="wrap">

    <%--Include header--%>
    <%@include file="decorator/header.jsp"%>

    <%--Body goes here--%>
    <div class="container bodyContainer">
        <div class="jumbotron">
            <form id="blogPostForm" class="form-group" role="form">
                <h2 class="form">New Post...</h2>
                <label for="titleInput">Title:</label>
                <input id="titleInput" type="text" name="title" class="form-control" placeholder="Title" required autofocus>
                <label for="bodyInput">Post body:</label>
                <input id="bodyInput" type="text" class="form-control" name="text" placeholder="Body" required style="height:100px;">
            </form>
            <button class="btn btn-lg btn-primary btn-block">Submit</button>
        </div>
    </div>
</div>

<%--Include Footer--%>
<%@include file="decorator/footer.jsp"%>
</body>
</html>
