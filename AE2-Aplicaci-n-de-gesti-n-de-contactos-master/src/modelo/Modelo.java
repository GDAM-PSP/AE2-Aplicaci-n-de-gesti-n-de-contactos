package modelo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import vista.Vista;

public class Modelo {

	public Modelo() {
		super();
		
	}
	
	
	//Creamos un método para registrar personas en un archivo binario
	public void registrarPersona(Persona persona) {
		try {
			FileOutputStream archivo = new FileOutputStream("registroPersona.bin");
			AñadirBinario escribir = new AñadirBinario(archivo);
			
			escribir.writeObject(persona);
			escribir.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Error, "+e);
		} catch (IOException e) {
			System.err.println("Error, "+e);
		}
	}
	
	//Leemos el archivo que hemos creado con los datos de las personas añadidas a la agenda
	public void leerRegistro() {
		Persona persona;
		String nombre, telefono;
		Vista vista = null;
		
		try {
			FileInputStream archivo = new FileInputStream("registroPersona.bin");
			ObjectInputStream lectura = new ObjectInputStream(archivo);
			
			//Creamos un bucle que se repetirá hasta que lea todo el archivo
			while(true) {
				persona = (Persona)lectura.readObject();
				nombre = persona.getNombre();
				telefono = persona.getTelefono();
				
				String[] fila = {nombre, telefono};
				
				vista.getModeloTabla().addRow(fila);
			}
			
		}catch(EOFException e) { //Cuando lea todo el archivo sale del bucle
			return;
		}catch (FileNotFoundException e) {
			System.err.println("Error, "+e);
		} catch (IOException e) {
			System.err.println("Error, "+e);
		} catch (ClassNotFoundException e) {
			System.err.println("Error, "+e);
		}
	}
	
	

}
