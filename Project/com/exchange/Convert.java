/*
* If you want to change this template, choose Tools | Templates
* and open the template in the editor.
*/
package com.exchange;
import java.net.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Recv{
    private String lhs;
    private String rhs;
    private String error;
    private String icc;

    public Recv(){

    }
    public String getLhs(){
        return lhs;
    }
    public String getRhs(){
        return rhs;
    }
}


public class Convert extends HttpServlet {
    /** 
     * This processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        String query = "";
        String amount = "";
        String curTo = "";
        String curFrom = "";
        String submit = "";
        String res = "";
        HttpSession session;
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        /*Read request parameters*/
        amount = req.getParameter("amount");
        curTo = req.getParameter("to");
        curFrom = req.getParameter("from");
        /*Open a connection to google and read the result*/
 
        try {
            query = "http://www.google.com/ig/calculator?hl=en&q=" + amount + curFrom + "=?" + curTo;
            URL url = new URL(query);
            InputStreamReader stream = new InputStreamReader(url.openStream());
            BufferedReader in = new BufferedReader(stream);
            String str = "";
            String temp = "";
            while ((temp = in.readLine()) != null) {
                str = str + temp;
            }
 
            /*Parse the result which is in json format*/
            Gson gson = new Gson();
            Recv st = gson.fromJson(str, Recv.class);
            String rhs = st.getLhs();
            rhs = rhs.replaceAll("�", "");
            /*we do the check in order to print the additional word(millions,billions etc)*/
            StringTokenizer strto = new StringTokenizer(rhs);
            String nextToken;
 
            out.write(strto.nextToken());
            nextToken = strto.nextToken();
 
            if( nextToken.equals("million") || nextToken.equals("billion") || nextToken.equals("trillion"))
            {
                out.println(" "+nextToken);
            } 
        } catch (NumberFormatException e) {
            out.println("The given amount is not a valid number");
        }
    }
}
    