package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import modelo.Persona;
import vista.VistaEditar;

public class ControladorEditar implements ActionListener{
	private VistaEditar vista;
	private Modelo modelo;
	
	public ControladorEditar(VistaEditar vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		try {
			String[] datos = modelo.getDatosEditar();
			vista.getTextonombre().setText(datos[0]);
			vista.getTextotelefono().setText(datos[1]);
		} catch (Exception e) {
			System.out.println("Error en vista editar. Seleccione un contacto.");
			vista.dispose();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == vista.getOk()) {
			String nombre = vista.getTextonombre().getText();
			String telefono = vista.getTextotelefono().getText();
			System.out.println("has pulsado ok, se guardan valores: " + nombre + " " + telefono);
			Persona persona = new Persona(nombre, telefono);
			modelo.editarDatos(persona);
			vista.dispose();
		}
		if(e.getSource() == vista.getCancel()) {
			System.out.println("has pulsado cancel");
			vista.dispose();
		}
	}
	
	public VistaEditar getVista() {
		return vista;
	}
}
