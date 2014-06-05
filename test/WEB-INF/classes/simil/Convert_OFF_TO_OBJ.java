package simil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Convert_OFF_TO_OBJ {

	public static File Convert(File f_off) throws IOException
	{
		File f_obj = new File(CalculSimilarite.urlstatic+"/ConvertedOFFToOBJ/ex.obj");
		FileReader fr;
		FileWriter fw;
		BufferedWriter bw = null;
		int nb_points;
		int nb_faces;
		String line;
		String []str;
		
		BufferedReader br = null;
		try {
			 fr = new FileReader(f_off);
			 br = new BufferedReader(fr);
			 fw=new FileWriter(f_obj);
			 bw=new BufferedWriter(fw);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		br.readLine();
		line = br.readLine();
		str=line.split("\\s+");
		nb_points=Integer.parseInt(str[0]);
		nb_faces=Integer.parseInt(str[1]);
		
		bw.write("#"+" "+nb_points);
		bw.newLine();
		bw.write("#"+" "+nb_faces);
		bw.newLine();
		
		for (int i=0;i<nb_points;i++)
		{
			str=br.readLine().split("\\s+");
			bw.write("v"+" "+str[0]+" "+str[1]+" "+str[2]);
			bw.newLine();
			bw.flush();
		}
		
		for (int j=0;j<nb_faces;j++)
		{
			str=br.readLine().split("\\s+");
			bw.write("f"+" "+(Integer.parseInt(str[1])+1)+" "+(Integer.parseInt(str[2])+1)+" "+(Integer.parseInt(str[3])+1));
			bw.newLine();
			bw.flush();
		}
		return f_obj;
		
	}
	
	public static void main(String []args)
	{
		try {
			File f=Convert(new File("G://projet/fichierOFF/b0.off"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
