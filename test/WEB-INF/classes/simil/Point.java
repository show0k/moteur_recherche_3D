package simil;
import java.io.Serializable;


public class Point implements Serializable{

	private float x;
	private float y;
	private float z;
	
	public Point(){
		
		x=0;
		y=0;
		z=0;
		
	}
	public Point(float a, float b, float c)
	{
		x=a;
		y=b;
		z=c;
	}
	
	public float getX()
	{
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getZ(){
		return z;
	}
	
	public void setX(float a)
	{
		x=a;
	}
	
	public void setY(float b){
		y=b;
	}
	
	public void setZ(float c){
		z=c;
	}	
	
}
