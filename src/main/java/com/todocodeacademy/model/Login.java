/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.todocodeacademy.model;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sergio Rolon
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
private Gson gson = new Gson();

       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String employeeJsonString = new Gson().toJson(new Person("Sergio", "Rolon", "Casa", "Admin", "Prueba12"));
    
    PrintWriter out = response.getWriter();
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    out.print(employeeJsonString);
    out.flush();
    
    }
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
            Person registeredPerson = new Person("Sergio", "Rolon", "Casa", "Admin", "Prueba12");
        response.setContentType("text/plain;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        String contentType = request.getContentType();
       
        if(!("application/json".equals(contentType))){
            response.sendError(javax.servlet.http.HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, "Invalid"
                    + "content type");
            return;
        }
        try(BufferedReader reader = request.getReader()){
            Person loginUser = gson.fromJson(reader, Person.class);
            
            if(loginUser.getPassword().equals(registeredPerson.getPassword())){
                out.print("Usuario logeado correctamente");
            }else{
                    out.print("Usuario incorrecto");
            }
}
            
        } catch (IOException ex){
            request.setAttribute("message", "There was an error: "+ex.getMessage());
        }
    }
    
        @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
