package controlador;

import java.io.IOException;

import modelo.Modelo;
import vista.Vista;
import vista.VistaAnadir;
import vista.VistaEditar;

public class Main {
	public static void main(String[] args) throws SecurityException, IOException {
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(vista);
		vista.addContactos(controlador);
		vista.editContactos(controlador);
		vista.deleteContactos(controlador);
	}
}
