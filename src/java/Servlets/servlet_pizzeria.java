package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "servlet_pizzeria", urlPatterns = {"/servlet_pizzeria"})
public class servlet_pizzeria extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tamaño = request.getParameter("tam");
        String nom_tamaño;
        String pepi = request.getParameter("pep");
        String cham = request.getParameter("champ");
        String ceb = request.getParameter("cebolla");
        int costo = 0;
        int costo_base = 2000;
        int pequeña = 2000, mediana =3500, grande = 6000;
        int extra = 700;
        boolean p=false, ch = false, c = false;
        double total = 0;
        costo = costo_base;
        if(tamaño.equals("10")){
            nom_tamaño = "Pequeña";
            costo = costo + pequeña;
        }else if(tamaño.equals("12")){
            nom_tamaño = "Mediana";            
            costo = costo + mediana;
        }else{
            nom_tamaño = "Grande";
            costo = costo + grande;
        }
        if(pepi!= null){
            costo = costo + extra;
            p = true;
        }
        if(cham!=null){
            costo = costo + extra;
            ch = true;
        }
        if(ceb != null){
            costo = costo + extra;
            c = true;
        }
        total = costo * 1.5;
               
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Pizzeria</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos de la pizza</h1>");
            out.print("<p>Tamaño de la pizza "+nom_tamaño+"</p>");
            if(p || ch || c){
                out.print("<p>Ingredientes extras :</p>");
            }
            if(p){
                out.print("<p>-Pepinillos</p>");
            }
            if(ch){
                out.print("<p>-Champiñones</p>");
            }
            if(c){
                out.print("<p>-Cebolla</p>");
            }
            out.println("<h3>Precio $:"+total+"</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
