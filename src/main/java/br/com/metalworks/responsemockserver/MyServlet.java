package br.com.metalworks.responsemockserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author Bob McWhirter
 */
@WebServlet("/*")
public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = -5201757584762480416L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.getWriter().write("Howdy at " + new Date() + " - novo");
		
	       // Getting servlet request URL
        String url = req.getRequestURL().toString();

        // Getting servlet request query string.
        String queryString = req.getQueryString();

        // Getting request information without the hostname.
        String uri = req.getRequestURI();

        // Below we extract information about the request object path
        // information.
        String scheme = req.getScheme();
        String serverName = req.getServerName();
        int portNumber = req.getServerPort();
        String contextPath = req.getContextPath();
        String servletPath = req.getServletPath();
        String pathInfo = req.getPathInfo();
        String query = req.getQueryString();

        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.print("Url: " + url + "<br/>");
        pw.print("Uri: " + uri + "<br/>");
        pw.print("Scheme: " + scheme + "<br/>");
        pw.print("Server Name: " + serverName + "<br/>");
        pw.print("Port: " + portNumber + "<br/>");
        pw.print("Context Path: " + contextPath + "<br/>");
        pw.print("Servlet Path: " + servletPath + "<br/>");
        pw.print("Path Info: " + pathInfo + "<br/>");
        pw.print("Query: " + query);
    }
}
