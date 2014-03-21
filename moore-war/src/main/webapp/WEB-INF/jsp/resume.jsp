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

        <c:set var="resumeLink" value="${contextPath}/site/pdf/Resume_RyanMoore_Redacted.pdf"/>
        <c:choose>
            <c:when test="${isMobile || isTablet}">
                <div class="jumbotron">
                    <h2>Resume...</h2>
                    <p><a href="${resumeLink}">Click here to download...</a</p>
                </div>
            </c:when>
            <c:otherwise>
                <object width="100%" height="750px" data="${resumeLink}#view=FitH"></object>
            </c:otherwise>
        </c:choose>
    </div>
</div>

<%--Include Footer--%>
<%@include file="decorator/footer.jsp"%>
</body>
</html>
