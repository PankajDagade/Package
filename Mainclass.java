import java.util.*;
import java.lang.*;
import MarvellousMatrix.Matrix;

class Mainclass
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int X = sobj.nextInt();
		System.out.print("Enter the number of columns : ");
		int Y = sobj.nextInt();
        System.out.println();
		
		Matrix mobj = new Matrix(X,Y);
		mobj.Accept();
		mobj.Display();
		
        MyMatrix mmobj = new MyMatrix(X,Y);
		mmobj.Accept();
		mmobj.Display();
		int iRet = mmobj.Maximum();
		System.out.println("Maximum  element is : "+iRet);
		
		
	}
}