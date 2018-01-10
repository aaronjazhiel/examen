/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mystratis.ejercicio_1;


/**
 * Copyright (c)  10 Enero 2018
 * Mexico D.F.
 * Todos los derechos reservados.
 *
 * @author Aaron Jazhiel Delgado Gonzalez 
 * 
 * @Descripcion. Esta clase contiene los @Ejercicio 1
 * 
 *  - / Obtener dos cadenas y ver si la segunda cadena es permutacion de la primera
 */

public class EjercicioUno {

    
	public static void main(String[] args) {
              //Ejemplo 1   
               //En donde se introduce en la funcion de permutacion la cadena 1 y la cadena 2
               System.out.println("EJEMPLO 1");
               if(segundaPermutacion("zabkdzedzaaa","abakdaedzazz"))
                 System.out.println("El segundo arreglo es una permutacion del primero");
               else
                 System.out.println("El segundo arreglo no es una permutacion del primero");
               //Ejemplo 2   
               //En donde se introduce en la funcion de permutacion la cadena 1 y la cadena 2
                System.out.println("EJEMPLO 2"); 
               if(segundaPermutacion("fa","abacdaedfaff"))
                  System.out.println("El segundo arreglo es una permutacion del primero");
               else
                  System.out.println("El segundo arreglo no es una permutacion del primero");
	}
	
        /*
        * Verifique si las dos cadenas tienen el mismo número de caracteres
        * hacer siempre la conversion a char como posición, y aumentar*/
        
	public static boolean permutacion(String cadena_1, String cadena_2) {		
                // Se realiza la validacion del tamano de la cadenas si es diferente la cadena 2 no es una permutacion de la primera porque
                //difiere del numero de combinaciones por tal motivo no seria una permutacion.               
                if (cadena_1.length() != cadena_2.length()) {
			return false;
		}		
		int[] arr = new int[256];
		for (int i=0; i< cadena_1.length(); i++) {
			char value = cadena_1.charAt(i);
			arr[value] ++;
		}
		
		for (int i=0; i< cadena_2.length(); i++) {
			int value = cadena_2.charAt(i);
			if (--arr[value] < 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Otro forma de comparar si la segunda cadena es permutacion de la primera es realizar un ordenamiento de los dos cadenas y 
         * comaprar el ordenamiento api
	 */
	public static boolean segundaPermutacion(String cadena_1, String t) {
		if (cadena_1.length() != t.length()) {
			return false;
		}
		return sort(cadena_1).equals(sort(t));
	}
	
	public static String sort(String str) {
		char[] temp = str.toCharArray();
		java.util.Arrays.sort(temp);
		return new String(temp);
	}
	

}
