/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mystratis.ejercicio_2;

/**
 * Copyright (c)  10 Enero 2018
 * Mexico D.F.
 * Todos los derechos reservados.
 *
 * @author Aaron Jazhiel Delgado Gonzalez 
 * 
 * @Descripcion. Esta clase contiene los @Ejercicio 2
 * 
 *   Desarrollo del Juego Hoop
 */

public class Ejercicio_2 {

   
	public static void main(String[] args) {
		Ejercicio_2 play = new  Ejercicio_2();
	          //Ejemplo 1 
                //El primer parametro es numero de jugadores
                //El segundo paramtero es el numero de turnos
                play.imprimir(play.start(3, 8, new int[] {1,2,3,4,4,0,0,0}));
                //Ejemplo 2 
                play.imprimir(play.start(3, 9, new int[] {1, 2, 0, 4, 4, 6, 0, 7, 0}));
                //Ejemplo 3 
                play.imprimir(play.start(3, 6, new int[] {1, 2, 0, 4, 4, 0})); 
	}
        
        
        void imprimir(int[] resultado){
            System.out.println("Ejemplo");
              int i = 0;
		for (int campo:resultado) {
			if (i>0) System.out.print(", ");
			System.out.print(campo);
			i++;
		}
              System.out.println("");
        }
        
	int[] start(int n, int m, int[] turnos) {
	    int[] resultado = new int[m];
	    int contador = 0, jugadorInicial, respuestaCorrecta;
	    for (int i=0; i<m; i++) {
	        jugadorInicial = (i % n)+1;
	        respuestaCorrecta = i+1;
	        if (respuestaCorrecta % 3 == 0 || respuestaCorrecta % 7 == 0) {
	            respuestaCorrecta = 0;
	        }
	        if (turnos[i] != respuestaCorrecta) {
	            resultado[contador] = jugadorInicial;
	            contador++;
	        }
	    }
	    int[] resultadoFinal = new int[contador];
	    for (int i=0; i<resultadoFinal.length; i++) {
	        resultadoFinal[i] = resultado[i];
	    }
	    return resultadoFinal;
	}
}
