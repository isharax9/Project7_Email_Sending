/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Mail;

/**
 *
 * @author isharaLakshitha
 */
@WebServlet(name = "X", urlPatterns = {"/X"})
public class X extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Mail.sendMail("lakshithahitibandara@gmail.com", "Mail Subject Here", "<h1 style=\"color:red;\">Thank You</h1>");
        
    }

}
