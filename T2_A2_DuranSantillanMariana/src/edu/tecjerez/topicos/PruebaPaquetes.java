/*
 * 	PAQUETES EN JAVA
 *  		Son directoios (carpetas o folder) que pueden estar o no comprimidos (JAR) y que se encuentran
 *  		dentro de un proyecto.Contienen muchos tipos de archivos incluyendo:
 *  		BYTECODE, codigo fuente (opcional), asets (imagenes, sonido, iconos), y otros arhivos (documentos, etc.)
 *  
 *  Para crear una estructura de directorios dentro del paquete se sigue la siguiente convencion:
 *  	-Se utiliza el DOMINIO WEB de la empresa/institucion, pero a la inversa:
 *  
 *  	Po ejemplo: www.tecjerez.edu.mx
 *  	Paquete quedaria: edu.tecjerez.otraCarpeta....
 *  					  edu.tecjerez.topicos.vista
 *  
 *  	M (datos y tipo de datos que se van a manejar)V (se presnta la informacion, interfaces etc)C(de donde se sacaron los datos)
 *  
 *  Para indicar la creacion de un paquete, debe hacerce con la palabra reservada  PACKAGE
 *   y esta debe ser la primer linea de codigo de un archivo JAVA
 *  
 *  
 */
package edu.tecjerez.topicos;

import javax.swing.SwingUtilities;
import edu.tecjerez.topicos.*;
import edu.tecjerez.topicos.vista.VentanaInicio;
public class PruebaPaquetes {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() { // Siempre agregar ese codigo

			@Override
			public void run() {

				new VentanaInicio();

			}
		});
		
		}
		
	}


