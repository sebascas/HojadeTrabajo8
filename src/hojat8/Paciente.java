package hojat8;

/*-----------------------------------------------------------------------
Carlos Javier Lima Cordon			14373
Fernando Sebastian Castillo Echeverria		14102

Algoritmos y estructura de datos
Seccion 30
Hoja de trabajo 8
-------------------------------------------------------------------------*/

public class Paciente implements Comparable<Paciente> { //generico
	
	String nombre;
    String sintoma;
    char codigo;
    
	
        public Paciente() {
        	nombre = "";
            sintoma = "";
            codigo = '\0';
            
        }
	
	
	public Paciente(String nombre, String sintoma, char codigo){
		this.nombre=nombre;
		this.sintoma=sintoma;
		this.codigo=codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the sintoma
	 */
	public String getSintoma() {
		return sintoma;
	}


	/**
	 * @param sintoma the sintoma to set
	 */
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}


	/**
	 * @return the codigo
	 */
	public char getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(char codigo) {
		this.codigo = codigo;
	}

@Override
public int compareTo(Paciente nodo2) {
	char letra2 = nodo2.getCodigo();
	if (codigo>letra2){	//el primero es mayor
		return 1;
	}
	else if (codigo<letra2){	//el segundo es mayor
		return -1;
	}
	return 0;
}
         
public String toString(){
	return nombre + ", " + sintoma + ", "+ codigo;
}

}

