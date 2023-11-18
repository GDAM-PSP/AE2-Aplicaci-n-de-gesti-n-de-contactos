package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.VistaAnadir;

public class ControladorAnadir implements ActionListener{
	private VistaAnadir vista;
	private Modelo modelo;
	
	public ControladorAnadir(VistaAnadir vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==vista.getOk()) {
			System.out.println("Has apretado ok");
		}
		if(e.getSource()==vista.getCancel()) {
			System.out.println("Has apretado cancelar");
		}
		
	}
}
