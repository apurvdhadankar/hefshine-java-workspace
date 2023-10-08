package first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishApp extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
    	res.setContentType("text/html");
    	PrintWriter pw = res.getWriter();
    	Calendar cal = Calendar.getInstance();
    	int hour = cal.get(Calendar.HOUR_OF_DAY);
    			if(hour< 12)
    				pw.println("Good Morning");
    			else if(hour < 16)
    				pw.println("Good Afternoon");
    			else if(hour < 20)
    				pw.println("Good Evening");
    			else
    				pw.println("Good Night");
    }

}
