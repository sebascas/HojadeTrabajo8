package hojat8;

/*-----------------------------------------------------------------------
Carlos Javier Lima Cordon			14373
Fernando Sebastian Castillo Echeverria		14102

Algoritmos y estructura de datos
Seccion 30
Hoja de trabajo 8
-------------------------------------------------------------------------*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
public class VectorHeap<E extends Comparable<E>> extends PriorityQueue<E>{
	
	PriorityQueue cola;
	
	public VectorHeap(){
		cola = new PriorityQueue();
	}
	
	/*
	 * @return the cola
	 */
	public PriorityQueue getCola() {
		return cola;
	}

	public void agregar(Paciente paciente){
		cola.add(paciente);
	}
	
	public void quitar(){
		cola.poll();
		}
	/**
	 * @return
	 * @throws IOException
	 */
	public int Contador() throws IOException{
		FileReader f = new FileReader("pacientes.txt");
	    BufferedReader b = new BufferedReader(f);
	    String cadena;
	    int contador = 0;
	    while((cadena = b.readLine())!=null) {
			contador ++;
	    }
	    return contador;
	}
		
	
	
	
	
	
}