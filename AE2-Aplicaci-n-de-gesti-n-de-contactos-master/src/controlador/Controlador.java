package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import modelo.Modelo;
import vista.Vista;

public class Controlador extends MouseAdapter{
	private Vista vista;
	private Modelo modelo;
	
	public Controlador(Vista vista) {
		this.vista = vista;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==vista.getAddContacto()) {
			System.out.println("le has dado click a añadir contacto");
			
		}
		if(e.getSource()==vista.getEditContacto()) {
			System.out.println("le has dado click a editar contacto");
		}
		if(e.getSource()==vista.getDeleteContacto()) {
			System.out.println("le has dado click a Eliminar contacto");
		}
	}
}
