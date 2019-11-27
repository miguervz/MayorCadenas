package es.studium.MayorCadenas;

import java.util.Scanner;

public class MayorCadenas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String[]tabla=new String[5];
		String mayor;
		
		
		for(int i=0; i<(tabla.length); i++) 
		{
			System.out.println("Escriba la palabra número:"+(i+1));
			tabla[i]=teclado.nextLine();
		}

		mayor=tabla[0];
		for(int i= 1;i<tabla.length; i++)
		{
			System.out.println(i+" Comparar: *"+tabla[i]+"* con base: *");
		
			if(tabla[i].compareTo(mayor)>0) 
			{
				System.out.println("Encontrado nuevo mayor --> cambia a");
				mayor=tabla[i];
			}
		}
		System.out.println("La cadena alfabéticamente mayor es:" +mayor);
		teclado.close();
}}
		

		