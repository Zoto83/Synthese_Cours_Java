<!--
    pageContext         : Accès à l'objet PageContext de la page JSP.
    pageScope           : Map permettant d'accéder aux différents attributs du scope 'page'.
    requestScope        : Map permettant d'accéder aux différents attributs du scope 'request'.
    sessionScope        : Map permettant d'accéder aux différents attributs du scope 'session'.
    applicationScope    : Map permettant d'accéder aux différents attributs du scope 'application'.
    param               : Map permettant d'accéder aux paramètres de la requête HTTP sous forme de String.
    paramValues         : Map permettant d'accéder aux paramètres de la requête HTTP sous forme de tableau de String.
    header              : Map permettant d'accéder aux valeurs du Header HTTP sous forme de String.
    headerValues        : Map permettant d'accéder aux valeurs du Header HTTP sous forme de tableau de String.
    cookie              : Map permettant d'accéder aux différents Cookies.
    initParam           : Map permettant d'accéder aux init-params du web.xml.
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>
    <title>$Titlte$</title>
</header>
<html>
    <body>
        <p>Path : ${pageContext.request.contextPath}</p>            <!--Chemin d'accès à la page-->
        <p>AppContext : ${applicationScope.get("appContext")}</p>   <!--Servlet-->
        <p>SessionContext : ${sessionScope.get("sessContext")}</p>  <!--Session-->
        <p>Cookie : ${cookie.get("cookieContext").value}</p>        <!--Cookie-->
        <p>URL : ${param.urlParam}</p>                              <!--Url-->
        <form method="post" action="${pageContext.request.contextPath}/servlet?urlParam=true">
            <input type="hidden" name="postParam" value="true"/>
            <input type="submit">
        </form>
        <form method="get" action="${pageContext.request.contextPath}/jsp">
            <input type="submit">
        </form>
    </body>
</html>
