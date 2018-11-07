package es.indra.Practica1;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		int[] numeros = new int[10];
		
		int pos=0,neg=0,cero=0;
		
		for (int i =0;i<numeros.length;i++)
		{
			System.out.println("Introduzca 10 enteros: ");
			numeros[i] =  a.nextInt();
		}
		
		for(int i= 0;i<numeros.length;i++)
		{
			if(numeros[i]==0)
			{
				cero=cero+1;
			}else if(numeros[i]>=1)
			{
				pos=pos+1;
			}else if(numeros[i]<0)
			{
				neg=neg+1;
			}
			
		}
		System.out.println("Positivos: " + pos +" Negativos: "+ neg +" Ceros: "+ cero);

	}

}
