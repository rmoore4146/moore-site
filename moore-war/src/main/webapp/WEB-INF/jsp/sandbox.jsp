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

        <object width="100%" height="750px" data="${contextPath}/site/pdf/Moore_Resume.pdf#view=FitH"></object>
    </div>
</div>

<%--Include Footer--%>
<%@include file="decorator/footer.jsp"%>
</body>
</html>
