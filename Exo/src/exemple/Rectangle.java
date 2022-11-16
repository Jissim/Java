package exemple;
import java.util.Scanner;

public class Rectangle
{
	private int a;
	private int b;
	public int membre() 
	{
		int surface = this.a*this.b;
		return surface;
	}
	public void setA(int a) {
		this.a=a;
	}
	public void setB(int b) {
		this.b=b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle R = new Rectangle();
		Scanner s=new Scanner(System.in);
		//int c = s.nextInt();
		//R.setA(c);
		R.setA(s.nextInt());
		R.setB(s.nextInt());		
		System.out.print(R.membre());
	}

}
