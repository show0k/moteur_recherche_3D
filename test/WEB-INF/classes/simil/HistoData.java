package simil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public  class HistoData implements Serializable {

	
	private static ArrayList<Distance_Partition> histdata;
	public  List<String> filestring;
	
	public  HistoData()
	{
		ArrayList<Distance_Partition> lhist = new ArrayList<Distance_Partition>();
		filestring=new ArrayList<String>();
		//File f1 = new File ("FichierOBJ");
		File fOBJtext = new File(CalculSimilarite.urlstatic+"/index.txt");
		
		FileReader fr=null;
		BufferedReader br=null;
		try {
			 fr = new FileReader(fOBJtext);
			 br=new BufferedReader(fr);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String line;
		try {
			while(( line =br.readLine())!=null)
			{
				filestring.add(line);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//File f2 = new File("FichierOFF");
		File fOFFtext =new File(CalculSimilarite.urlstatic+"/index_off.txt");
		FileReader foffr =null;
		BufferedReader broFF = null;
	   List<String> fOFFname = new ArrayList<String>();
		try {
			 foffr = new FileReader(fOFFtext);
			 broFF = new BufferedReader(foffr);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String str;
		try {
			while((str=broFF.readLine())!=null)
			{
				lhist.add(new Distance_Partition((new FileReadOFF(new File(CalculSimilarite.urlstatic+"/FichierOFF/"+str))).getListPoint()));
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch blockstr
			e1.printStackTrace();
		}
		
		/*for (File f : f2.listFiles())
		{
			try {
				System.out.println("Read OFF : "+f.getName());
				lhist.add(new Distance_Partition((new FileReadOFF(f)).getListPoint()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
		histdata=lhist;;	
	}
	
	public static ArrayList<Distance_Partition> getHistdata()
	{
		
		return histdata;
	}
	public  List<String> getFile()
	{
		return filestring;
	}


	
}
