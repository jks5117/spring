package mvc.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class FrontController extends HttpServlet {	
	Logger logger = Logger.getLogger(FrontController.class);
	public void doService(HttpServletRequest req, HttpServletResponse res)
	throws ServletException,IOException
	{
		
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException,IOException
	{
		doService(req,res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException,IOException
	{
		doService(req,res);		
	}
}