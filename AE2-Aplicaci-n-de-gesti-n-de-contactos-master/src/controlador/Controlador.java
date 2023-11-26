package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import modelo.Modelo;
import vista.Vista;
import vista.VistaAnadir;
import vista.VistaEditar;

public class Controlador extends MouseAdapter{
	private Vista vista;
	private Modelo modelo;
	
	public Controlador(Vista vista) {
		this.vista = vista;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==vista.getAddContacto()) {
			System.out.println("le has dado click a a�adir contacto");
			VistaAnadir vistaAnadir = new VistaAnadir();
			ControladorAnadir controladorAnadir = new ControladorAnadir(vistaAnadir);
			vistaAnadir.addContactosOk(controladorAnadir);
			vistaAnadir.addContactosCancel(controladorAnadir);
		}
		if(e.getSource()==vista.getEditContacto()) {
			System.out.println("le has dado click a editar contacto");
			VistaEditar vistaEditar = new VistaEditar();
			ControladorEditar controladorEditar = new ControladorEditar(vistaEditar);
			vistaEditar.addContactosOk(controladorEditar);
			vistaEditar.addContactosCancel(controladorEditar);
		}
		if(e.getSource()==vista.getDeleteContacto()) {
			System.out.println("le has dado click a Eliminar contacto");
		}
	}
}
