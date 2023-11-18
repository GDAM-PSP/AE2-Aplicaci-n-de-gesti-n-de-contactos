package controlador;

import java.io.IOException;

import modelo.Modelo;
import vista.Vista;
import vista.VistaAnadir;
import vista.VistaEditar;

public class Main {
	public static void main(String[] args) throws SecurityException, IOException {
		Vista vista = new Vista();
		VistaAnadir vistaAnadir = new VistaAnadir();
		VistaEditar vistaEditar = new VistaEditar();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(vista);
		ControladorAnadir controladorAnadir = new ControladorAnadir(vistaAnadir);
		ControladorEditar controladorEditar = new ControladorEditar(vistaEditar);
		vista.addContactos(controlador);
		vista.editContactos(controlador);
		vista.deleteContactos(controlador);
	}
}
