package test.servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import simil.CalculSimilarite;
import simil.Distance_Partition;
import simil.FileReadOFF;



public class Test extends HttpServlet {
	
	private Distance_Partition dp;
	private CalculSimilarite cs;
	private List<String> filestring;
	private File f;
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		Path sr = Paths.get("");
		String s = sr.toAbsolutePath().toString();
		System.out.println("Current relative path is: " + s);
		String message =" Transmission des donnees : OK";
		request.setAttribute("test",message);
		 cs = new CalculSimilarite();
		 filestring = new ArrayList<String>();
		 File index = new File(CalculSimilarite.urlstatic+"/index.txt");
		 BufferedReader br = new BufferedReader(new FileReader(index));
		 String str=null;
		 while((str=br.readLine())!=null)
		 {
			 filestring.add(str);
		 }
		 br.close();
		/*String str= request.getHeader("calcul");
		 if(str!=null){
		if (str.equals("calcul"))
		{
		dp = new Distance_Partition((new FileReadOFF(f)).getListPoint());
	    cs = new CalculSimilarite();
	    cs.calcul(dp);
	    List<Integer> l = cs.gettri();
	    System.out.println ("hi");
	    request.setAttribute("list", l);
		}
		
		}*/
		// response.setIntHeader("Refresh", 1);
		this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );
		    }
	public void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		//System.out.println("hi");
		 String str= request.getHeader("calcul");
		 if(str!=null){
		if (str.equals("envoi")){
		ServletInputStream httpIn = request.getInputStream();        
	    byte[] httpInData = new byte[request.getContentLength()];
	    StringBuffer readBuffer = new StringBuffer();
	    int retVal = -1;
	    while ((retVal = httpIn.read(httpInData)) != -1)
	    {
	    	//System.out.println(retVal);
	        for (int i=0; i<retVal; i++)
	        {
	            readBuffer.append(Character.toString((char)httpInData[i]));
	        }                   
	    }
	  
	  
        f = new File(CalculSimilarite.urlstatic+"/ex1.obj");
        PrintWriter writer = new PrintWriter(f);
        writer.print("");
        writer.close();
        FileWriter fw = new FileWriter(f);
     
        BufferedWriter bw = new BufferedWriter(fw);
       bw.write(readBuffer.toString());
       bw.close();
       
      
	    //System.out.println("XML Received" + readBuffer);
		}
	  
   
		 
	
		if (str.equals("calcul"))
		{
		dp = new Distance_Partition((new FileReadOFF(f)).getListPoint());
	   
	    cs.calcul(dp);
	    List<Integer> l = cs.gettri();
	    System.out.println ("hi");
	    File f = new File(CalculSimilarite.urlstatic+"/ordre.txt");
	   PrintWriter p = new PrintWriter(f);
	   p.write("");
	   p.close();
	    BufferedWriter bw = new BufferedWriter(new FileWriter(f));
	    
	    for (int i=0;i<l.size();i++)
	    {
	    	bw.write(filestring.get(l.get(i)));
	    	bw.newLine();
	    }
	    bw.close();
		}
		
		}
		// response.setIntHeader("Refresh", 1);
}
	public static void main(String []args) throws IOException
	{
		
		
		File f = new File("WebContent/ec.txt");
		f.createNewFile();
		Path sr = Paths.get("");
		String s = sr.toAbsolutePath().toString();
		System.out.println("Current relative path is: " + s);
		
	}
}
