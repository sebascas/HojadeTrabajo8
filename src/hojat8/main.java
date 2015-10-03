/*-----------------------------------------------------------------------
Carlos Javier Lima Cordon			14373
Fernando Sebastian Castillo Echeverria		14102
Algoritmos y estructura de datos
Seccion 30
Hoja de trabajo 8
-------------------------------------------------------------------------*/


import java.io.*;



public class main {
	
	public static void main(String [] args) throws IOException{
	VectorHeap vectorPacientes = new VectorHeap();	   
	String cadena;
        System.out.print("\n BIENVENIDO A EMERGENCIAS \n");
        System.out.print("\n LISTA DE PACIENTES DESORDEN: \n");
    FileReader f = new FileReader("pacientes.txt");
    BufferedReader b = new BufferedReader(f);
    int i=0;
    int contador= vectorPacientes.Contador();
    String[] Nombre = new String[contador];
    String[] Enfermedad = new String[contador];
    String[] Prioridad = new String[contador];
    Paciente[] enfermos = new Paciente[contador];
    
    while((cadena = b.readLine())!=null) {
    	
    	enfermos[i] = new Paciente();
        String [] Datos = cadena.split(",");
        Nombre[i] = Datos[0];
        Enfermedad[i]= Datos[1];
        Prioridad[i]= Datos[2];
        char codigo = Prioridad[i].charAt(0);
    	enfermos[i].setCodigo(codigo);
    	enfermos[i].setNombre(Nombre[i]);
    	enfermos[i].setSintoma(Enfermedad[i]);
    	vectorPacientes.agregar(enfermos[i]);
    	System.out.println(enfermos[i]);
        //SETS
        i++;
    }	
        System.out.print("\n LISTA DE PACIENTES EN ORDEN: ");
    	System.out.println(" ");
    	for (int j=0;j<contador;j++)
    	System.out.println(vectorPacientes.getCola().poll());
    	b.close();  
        
    }
	
	}
