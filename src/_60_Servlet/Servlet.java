package _60_Servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(
    name = "/servlet",
    urlPatterns = {
        "/servlet",
        "/index"
    },
    initParams = {
        @WebInitParam(name = "param1", value="valParam1"),
        @WebInitParam(name = "param2", value="valParam2")
    }
)
public class Servlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println(getInitParameter("param1"));
        System.out.println(getInitParameter("param2"));

        getServletContext().setAttribute("appContext", "testAppContext");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Variable d'application (servlet)
        /* Les données ajoutée au ServletContext ont une durée de vie du démarrage du serveur à l'extinction du serveur
         * Elles sont stockée au sein même du servlet.
         * La récupération peut se faire directement dans la JSP sans passer par un req.setAttribute("name", value)
         */
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("appContext", "testAppContext"); //Affectation
        System.out.println( servletContext.getAttribute("appContext") );//Récupération

        //Variable de session
        /* Une variable de session est créée sur le serveur pour le stockage de données temporaires.
         * La session se ferme dès que l'utilisateur ferme son navigateur. Plusieurs onglets partagent la même session
         * Comme pour le context d'application, la récupération de valeur se fait directement dans la JSP
         */
        HttpSession sessionContext = req.getSession();
        sessionContext.setAttribute("sessContext", "testSessContext"); //Affectation
        System.out.println( sessionContext.getAttribute("sessContext") ); //Récupération

        //Cookie
        /* Un cookie est créé en local sur le PC de l'utiilsateur. Il a une durée de vie déterminé au delà de laquelle il est détruit
         * Les cookies sont récupérable par la requêtes sous format de tableau mais doivent ensuite être ajouté à la réponse au moins une fois.
         * Comme pour l'application et la session, il sont récupérables directement dans la JSP
         */
        //Récupération
        Cookie[] cookieContext = req.getCookies();
        System.out.println((cookieContext[0].getValue()));
        //Affectation
        Cookie nouveauCookie = new Cookie("cookieContext", "testCookieContext");
        nouveauCookie.setMaxAge(30);
        resp.addCookie(nouveauCookie);


        req.getRequestDispatcher("WEB-INF/index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getContextPath());                          //Récupération de l'URL de la requête
        System.out.println(req.getParameter("urlParam"));               //Récupération des paramètres dans l'url
        System.out.println(req.getParameter("postParam"));              //Récupération des paramètres d'un formulaire
        req.setAttribute("urlParam",req.getAttribute("urlParam"));   //Transfert des paramètres vers la jsp
        req.setAttribute("postParam",req.getAttribute("postParam")); //Transfert des paramètres vers la jsp
        req.getRequestDispatcher("WEB-INF/index.jsp").forward(req,resp);//Redirection vers la JSP à afficher
    }
}
