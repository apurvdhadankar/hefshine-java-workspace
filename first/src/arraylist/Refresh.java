package arraylist;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

// Extend HttpServlet class
public class Refresh extends HttpServlet
{
     // Method to handle GET method request.
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
     {
          // Set refresh, autoload time as 1 seconds
          response.setIntHeader("Refresh", 1);

          // Set response content type
          response.setContentType("text/html");

          // Get current time
          Calendar calendar = new GregorianCalendar();
          String am_pm;
          int hour = calendar.get(Calendar.HOUR);
          int minute = calendar.get(Calendar.MINUTE);
          int second = calendar.get(Calendar.SECOND);
          if(calendar.get(Calendar.AM_PM) == 0)
               am_pm = "AM";
          else
               am_pm = "PM";

          String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
    
          PrintWriter out = response.getWriter();
      
          out.println("<h1 align='center'>Auto Refresh Page</h1><hr>");
          out.println("<h3 align='center'>Current time: "+CT+"</h3>");
     }
     // Method to handle POST method request.
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
     {
          doGet(request, response);
     }
}

