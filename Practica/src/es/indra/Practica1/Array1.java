package es.indra.Practica1;

public class Array1 {

	public static void main(String[] args) 
	{
		int a[][] = new int[3][3];
		
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j] =(i*a.length)+(j+i);
				System.out.println(a[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
