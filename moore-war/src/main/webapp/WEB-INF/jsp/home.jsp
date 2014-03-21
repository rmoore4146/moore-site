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
                    <h2>Welcome...</h2>
                    <p class="left">My name is Ryan Moore. I'm a software developer and this is my development "sandbox" website. You'll find information about me, my resume, links, contact information, and an unmaintained blog. Enjoy.</p>
                    <img src="${contextPath}/site/img/at_hom.jpg" class="img-responsive center-block"/>
                </div>
            </div>
        </div>

        <%--Include Footer--%>
        <%@include file="decorator/footer.jsp"%>
    </body>
</html>
