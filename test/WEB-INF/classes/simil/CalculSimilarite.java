package simil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class CalculSimilarite implements Serializable  {
	
	private List<Float> simil;
	private ArrayList<Distance_Partition> histdata;
	private ArrayList<Float> listsimil;
	private Distance_Partition hist;
	private  HistoData data;
	public static String urlstatic = "/var/lib/tomcat6/webapps/test";
	@SuppressWarnings("unchecked")
	public CalculSimilarite() throws IOException
    {
		
		
		
	    Path sr = Paths.get("");
	   String s = sr.toAbsolutePath().toString();
		System.out.println("Current relative path is: " + s);
    	String url =urlstatic+"/histdata.txt";
    	simil =new ArrayList<Float>();
    	File fbin = new File(url);
    	//File fg = new File("bin/histda.txt");
    	histdata= new ArrayList<Distance_Partition>();
    	if (fbin.exists() && fbin.isFile())
    	{
    		FileReader fr = new FileReader(url);
    		BufferedReader br = new BufferedReader(fr);
    		String line=null;
    		List<Float> f = null;
    		int nb = 0;
    		while((line=br.readLine())!=null)
    		{
    			if (line.equals("------------------------")){
    					nb=Integer.valueOf(br.readLine());
    					f= new ArrayList<Float>();
    			}
    			for (int i=0;i<nb;i++)
    			{
    			      f.add(Float.valueOf(br.readLine()));
    			}
    			histdata.add(new Distance_Partition(f,nb));
    		}
    	}
    	
    		else {
    			
    		histdata=data.getHistdata();
    		
    		
    		FileWriter fw=null; 
    		BufferedWriter bw=null;
    		try {
				 fw = new FileWriter(url);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		try {
				 bw = new BufferedWriter(fw);
				//	oos.weriteObject(histdata);
				 for (int i=0;i<histdata.size();i++)
				 {
					 listsimil=(ArrayList<Float>) histdata.get(i).getHist();
					 bw.write("------------------------");
						bw.newLine();
					 bw.write(String.valueOf(histdata.get(i).getNbclasses()));
					 for (int j=0;j<listsimil.size();j++)
					 {
						 bw.newLine();
						 bw.write(String.valueOf(listsimil.get(j)));
						
					 }
					bw.newLine();
					
				 }
					bw.close();
					fw.close();
			} 
    		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	
    		}
    
    	for (int i=0;i<histdata.size();i++)
    		simil.add(0f);
    	
    }
	
	public List<Float> calcul(Distance_Partition hist)
	{
		this.hist=hist;
		Float f;
		for (int i=0;i<histdata.size();i++)
		{
			f=0f;
			for (int j=0;j<hist.getNbclasses();j++)
			{
				if (j<histdata.get(i).getNbclasses())
				f=(float) ((float) (f+Math.abs(hist.getHist().get(j)-histdata.get(i).getHist().get(j))));
				else 
					f=(float) ((float) (f+Math.abs(hist.getHist().get(j))));
			}
			
			if (hist.getNbclasses()<histdata.get(i).getNbclasses())
			{
				for (int m=hist.getNbclasses();m<histdata.get(i).getNbclasses();m++)
					f=(float) ((float) (f+Math.abs(histdata.get(i).getHist().get(m))));
			}
			simil.set(i, f);
	//		System.out.println("Similarite avec " +i+" : "+f);
		}	
		return simil;
	}

	public List<Integer> gettri() {
		
		Tri.inittri(simil);
		List<Integer> ordre=Tri.TriSelection();
		return ordre;
	}
	public  List<String> getFileString()
	{
		return data.getFile();
	}

}
