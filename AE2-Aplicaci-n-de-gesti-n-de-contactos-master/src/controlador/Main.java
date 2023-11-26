package controlador;

import java.io.IOException;

import modelo.Modelo;
import vista.Vista;

public class Main {
	public static void main(String[] args) throws SecurityException, IOException {
		System.out.println("Iniciando aplicacion...");
		Vista vista = new Vista();
		Modelo modelo = new Modelo(vista);
		Controlador controlador = new Controlador(vista, modelo);
		vista.addContactos(controlador);
		vista.editContactos(controlador);
		vista.deleteContactos(controlador);
		System.out.println("\r\n"
				+ "█▀▀ █▀▀ █▀ ▀█▀ █ █▀█ █▄░█   █▀▄ █▀▀   █▀▀ █▀█ █▄░█ ▀█▀ ▄▀█ █▀▀ ▀█▀ █▀█ █▀   █░█ ▄█ ░ █▀█\r\n"
				+ "█▄█ ██▄ ▄█ ░█░ █ █▄█ █░▀█   █▄▀ ██▄   █▄▄ █▄█ █░▀█ ░█░ █▀█ █▄▄ ░█░ █▄█ ▄█   ▀▄▀ ░█ ▄ █▄█");
	}
}
