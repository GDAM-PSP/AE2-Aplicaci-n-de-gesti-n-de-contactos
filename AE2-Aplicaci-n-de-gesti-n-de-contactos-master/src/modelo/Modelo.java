package modelo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

import vista.Vista;

public class Modelo {
	private Vista vista;

	public Modelo(Vista vista) {
		this.vista = vista;
		leerRegistro();
	}
	
	//Creamos un m�todo para registrar personas en un archivo binario
	public void registrarPersona(Persona persona, Boolean limpiezaDatos) {
		try {
			//Poner a false para eliminar toda la info guardada
			FileOutputStream archivo = new FileOutputStream("registroPersona.bin", limpiezaDatos);
			AnadirBinario escribir = new AnadirBinario(archivo);
			
			escribir.writeObject(persona);
			escribir.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Error, "+e);
		} catch (IOException e) {
			System.err.println("Error, "+e);
		}
	}
	
	public void actualizarTabla () {
		Vector<Vector> vector = vista.getModeloTabla().getDataVector();
		Boolean noEliminar = false;
		
		for (Vector items : vector) {
			Persona personaTabla = new Persona(items.get(0).toString(), items.get(1).toString());
			
			registrarPersona(personaTabla, noEliminar);
			noEliminar = true;
		}
	}
	
	public void actualizarTabla (Persona persona) {
		String nombre = persona.getNombre();
		String telefono = persona.getTelefono();
		
		String[] fila = {nombre, telefono};
		vista.getModeloTabla().addRow(fila);
	}
	
	public String[] getDatosEditar () {
		Integer row = vista.getTable().getSelectedRow();
		String nombre = vista.getModeloTabla().getValueAt(row, 0).toString();
		String telefono = vista.getModeloTabla().getValueAt(row, 1).toString();
		String[] arrayDatos = {nombre, telefono};
		
		return arrayDatos;
	}
	
	public void editarDatos (Persona persona) {
		Integer row = vista.getTable().getSelectedRow();
		vista.getModeloTabla().setValueAt(persona.getNombre(),row, 0);
		vista.getModeloTabla().setValueAt(persona.getTelefono(),row, 1);
		actualizarTabla();
	}
	
	public void borrarDato () {
		Integer row = vista.getTable().getSelectedRow();
		vista.getModeloTabla().removeRow(row);
		actualizarTabla();
	}
	
	//Leemos el archivo que hemos creado con los datos de las personas a�adidas a la agenda
	public void leerRegistro() {
		Persona persona;
		String nombre, telefono;
		
		try {
			FileInputStream archivo = new FileInputStream("registroPersona.bin");
			ObjectInputStream lectura = new ObjectInputStream(archivo);
			
			//Creamos un bucle que se repetir� hasta que lea todo el archivo
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
