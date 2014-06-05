package simil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileReadOFF {

	private File fileOFF;
	private List<Point> listpoints;
	private int nbpoints;
	
	public  FileReadOFF(File f) throws IOException
	{
		fileOFF=f;
		listpoints=new ArrayList<Point>();
		String str = null;
	     FileReader fr;
	     BufferedReader br = null;
		try {
			 fr=new FileReader(fileOFF);
			 br=new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
			str=br.readLine();
			str=br.readLine();
	        str=br.readLine();
	        str=br.readLine();
	        str=br.readLine();
	        
         String []m=str.split(" ");
         nbpoints=Integer.parseInt(m[1]);
         str=br.readLine();
         for (int i=0;i<nbpoints;i++)
         {
        	 str=br.readLine();
        	 m=str.split("\\s+");
        	 listpoints.add(new Point(Float.parseFloat(m[1]),Float.parseFloat(m[2]),Float.parseFloat(m[3])));
         }
 	}
	
	public List<Point> getListPoint()
	{
		return listpoints;
	}
}
