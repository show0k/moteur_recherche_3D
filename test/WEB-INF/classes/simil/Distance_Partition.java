package simil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Distance_Partition implements Serializable{
	
	private List<Point> liste_points;
	private Point gravity;
	private List<Float> distances;
	private List<Float> hist;
	private int nbclasses;
	
	public Distance_Partition(List<Point> liste)
	{
		liste_points=liste;
		
		float xg = 0,yg = 0,zg = 0;
		for (int i=0;i<liste.size();i++)
		{
			xg=xg+liste.get(i).getX();
			yg=yg+liste.get(i).getY();
			zg=zg+liste.get(i).getZ();
		}
		
		xg=xg/liste.size();
		yg=yg/liste.size();
		zg=zg/liste.size();
		
		gravity=new Point(xg,yg,zg);
		
        calculDistances();
        Partionner();
	}
	public Distance_Partition(List<Float> dp,int nb)
	{
		this.hist=dp;
		this.nbclasses=nb;
	}
	
	public void calculDistances()
	{
		distances = new ArrayList<Float>();
		float xg=gravity.getX();
		float yg=gravity.getY();
		float zg=gravity.getZ();
		Point p;
		for (int i=0;i<liste_points.size();i++)
		{
			 p=liste_points.get(i);
			distances.add((float)Math.sqrt(Math.pow(xg-p.getX(),2)+Math.pow(yg-p.getY(), 2)+Math.pow(zg-p.getZ(), 2)));
		}
		
	}
	
	public void Partionner()
	{
		
		hist = new ArrayList<Float>();
		float pas = 0;
		int nb=0;
		int i=0;
		System.out.println("Max "+getmax());
		while(pas<getmax())
		{
			nb=0;
			for (int j=0;j<distances.size();j++)
			{
				
				if (distances.get(j)>=pas && distances.get(j)<=(pas+1f))
					nb=nb+1;
			    
			}
			hist.add(((float)(nb))/((float)(liste_points.size())));
			//System.out.println(1/n);
			pas+=1f;
			i++;
		}
              nbclasses=i;
              System.out.println("nbclasses "+ nbclasses);
	}
	private Float getmax()
	{
		Float f;
		f=distances.get(0);
		for (int i=1;i<distances.size();i++)
		{
			if(f<distances.get(i))
				f=distances.get(i);
		}
		return f;
	}
	
	
	public int getNbclasses()
	{
		return nbclasses;
	}
	
	public List<Float> getHist()
	{
		return hist;
	}
	
	

}
