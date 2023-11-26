package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.VistaEditar;

public class ControladorEditar implements ActionListener{
	private VistaEditar vista;
	private Modelo modelo;
	
	public ControladorEditar(VistaEditar vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == vista.getOk()) {
			System.out.println("has pulsado ok");
		}
		if(e.getSource() == vista.getCancel()) {
			System.out.println("has pulsado cancel");
		}
	}
}
