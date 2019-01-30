/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import javax.servlet.RequestDispatcher;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.apache.commons.fileupload.FileItem;
//import java.util.Date;


/**
 *
 * @author FRANK
 */

@WebServlet(name = "uploadCsv", urlPatterns = {"/uploadCsv"})
public class uploadCsv extends HttpServlet {

    LinkedList parsedLists = null;

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
        PrintWriter out = response.getWriter();

        
        
//        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
 
        try {
        
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List items = upload.parseRequest(request);
            InputStream is = null;
            Iterator itr = items.iterator();

            while (itr.hasNext()) {
                FileItem item = (FileItem) itr.next();

                    is = item.getInputStream();
//this.validateFile(is);
//extracting excel sheet
                Workbook w = Workbook.getWorkbook(is);
                Sheet sheet = w.getSheet(0);
                
        this.parsedLists = processCsv(sheet);

//         String phone = parsedLists.get("amount");
                System.out.println(this.parsedLists);
               
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        
        String info = "Your xls (excel) file has being successfully uploaded";
   request.setAttribute("msg", info);
    RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
    disp.forward(request, response);
    }
    
    public boolean validateFile(File file){
        
        String fileNameUpper = file.getName().toUpperCase();
        String fileName = file.getName();
        boolean extension = fileNameUpper.endsWith(".XLS") || fileName.endsWith(".xls");
        
        if(!extension)
            return false;
        
        return true;
    }

    private LinkedList processCsv(Sheet sheet) {

        LinkedList validList = new LinkedList();

        processCsv processData = new processCsv();
        String phoneNo = null;
        String amount = null;
        String name = null;
        String address = null;

        int column = sheet.getColumns();

        Cell[] customerAmount = null;
        Cell[] customerName = null;
        Cell[] customerAddress = null;
        Cell[] customerPhone = sheet.getColumn(0);

         
        if (column > 1) {
            customerAmount = sheet.getColumn(1);
        }

        if (column > 2) {
            customerName = sheet.getColumn(2);
        }

        if (column > 3) {
            customerAddress = sheet.getColumn(3);
        }

        for (int i = 0; i < customerPhone.length; i++) {
            phoneNo = customerPhone[i].getContents();
            address = customerAddress[i].getContents();
            name = customerName[i].getContents();
            amount = customerAmount[i].getContents();
            validList.add(phoneNo);
            validList.add(address);
            validList.add(name);
            validList.add(amount);

            processData.setPhone(phoneNo);
            processData.setAddress(address);
            processData.setName(name);
            processData.setAmount(amount);
           
                  accessDB DB = new accessDB();
        DB.storeData(processData.getPhone(), processData.getName(), processData.getAddress(), processData.getAmount());
            
        }

        return validList;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Uploads the Csv file and reads through it";
    }// </editor-fold>

}
