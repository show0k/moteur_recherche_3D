package simil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Tri {
	 
	 private static List<Float> l;
	 private static List<Integer> ordre;
	 
	 public static void inittri(List<Float> l)
	 
	 {
		 
		 ordre=new ArrayList<Integer>();
		 Tri.l=l;
		 for (int i=0;i<l.size();i++)
			 ordre.add(i);
		 
		 
	 }
	 
	 public static List<Integer> TriSelection()        //(O(n^2)
	 {
		
       
		int k=0;
		 for (int i=0;i<l.size();i++)
		 {
			 Float m= l.get(i);
			 k=ordre.get(i);
			 for (int j=i;j<l.size();j++)
			 {
				 if (m>l.get(j))
				 {
					 
					 l.set(i,l.get(j));
					 l.set(j, m);
					 m=l.get(i);
					 ordre.set(i, ordre.get(j));
					 ordre.set(j, k);
					 k=ordre.get(i);
				 }
			 }
		 }
		 return ordre;
		 
		
	 }
	 public static void TriInsertion(List<Float> l)          //(O(n^2)
	 {
		 int j;
		 for (int i=2;i<l.size();i++)
		 {
			 Float m= l.get(i);
			 j=i;
			 while(j>1 && l.get(j-1)>m)
			 {
				 l.set(j, l.get(j-1));
				 j=j-1;
			 }
			 l.set(j,m);
		 }
		 
	 }
	 public static void TriFusion(List<Float> l)
	 {
		 
	
		 
		
	 }
	 public static void main(String [] args) throws IOException, ClassNotFoundException
	 {
		 List<Float> l= new ArrayList<Float>();
		 l.add(6.365f);
		 l.add(82.3215f);
		 l.add(635.122f);
		 l.add(2.01269632f);
		 l.add(1.99966665966f);
		 l.add(89f);
		 inittri(l);
		 List<Integer> m = TriSelection();
		 for (int i=0;i<l.size();i++)
			 System.out.println(l.get(i));
		 for(int i=0;i<m.size();i++)
			 System.out.println(m.get(i));
		 File f = new File ("er.txt");
		 FileOutputStream fis = new FileOutputStream(f);
		 ObjectOutputStream oos = new ObjectOutputStream(fis);
		 oos.writeObject(l);
		 
		 List<Float> l1= (List<Float>) (new ObjectInputStream(new FileInputStream(new File("er.txt")))).readObject();
		 for (Float f1 : l1)
		 {
			 System.out.println(f1);
		 }
		 }
	 

}
