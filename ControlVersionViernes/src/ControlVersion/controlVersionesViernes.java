package ControlVersion;

import java.util.Scanner;

//programa Manuel

public class controlVersionesViernes {

	public static void main(String[] args) {
		   Scanner en = new Scanner(System.in);
	        int numero;
	            
	        System.out.println("Introducir un número entero");
	        numero = en.nextInt();
	        
	        System.out.println("El cuadrado de " + numero + " es " + calcularCuadrado(numero));

	}
	
	//Calcula el cuadrado del número
	private static int calcularCuadrado(int numero) {
		return numero*numero;
	}

}
