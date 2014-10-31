

package com.gabino.controller;

import com.gabino.model.HibernateUtilidades;
import com.gabino.model.Trabajador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Angie
 */
@WebServlet(name = "ServletGuardarTrabajador", urlPatterns = {"/guardar-trabajador"})
public class ServletGuardarTrabajador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter() ;
         SessionFactory factory = HibernateUtilidades.getSessionFactory();
        Session sesion = factory.openSession();
        Transaction tranza = sesion.beginTransaction();
        sesion.save(new Trabajador ("Angelica", "Gabino", "Meneses"));
        tranza.commit();
        sesion.close();
        out.println("Ya esta guardado este trabajador!");
    }

    

}
