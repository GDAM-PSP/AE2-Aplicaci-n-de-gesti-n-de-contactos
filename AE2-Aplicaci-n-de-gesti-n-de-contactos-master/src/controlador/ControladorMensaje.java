package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import modelo.Persona;
import vista.VistaAnadir;
import vista.VistaMensaje;

public class ControladorMensaje implements ActionListener{
	private VistaMensaje vista;
	
	public ControladorMensaje(VistaMensaje vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		if(e.getSource() == vista.getOk()) {
			System.out.println("Has apretado ok en el mensaje");
			vista.dispose();
		}
		
	}
}
