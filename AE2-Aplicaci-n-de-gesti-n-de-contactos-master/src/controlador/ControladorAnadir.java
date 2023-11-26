package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import modelo.Persona;
import vista.VistaAnadir;

public class ControladorAnadir implements ActionListener{
	private VistaAnadir vista;
	private Modelo modelo;
	
	public ControladorAnadir(VistaAnadir vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==vista.getOk()) {
			String nombre = vista.getTextonombre().getText();
			String telefono = vista.getTextotelefono().getText();
			System.out.println("Has apretado ok, se guardan valores: " + nombre + " " + telefono);
			Persona persona = new Persona(nombre, telefono);
			modelo.registrarPersona(persona, true);
			modelo.actualizarTabla(persona);
			vista.dispose();
		}
		
		if(e.getSource()==vista.getCancel()) {
			System.out.println("Has apretado cancelar");
			vista.dispose();
		}
		
	}
}
