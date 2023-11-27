package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import modelo.Modelo;
import vista.Vista;
import vista.VistaAnadir;
import vista.VistaEditar;
import vista.VistaMensaje;

public class Controlador extends MouseAdapter{
	private Vista vista;
	private Modelo modelo;
	
	public Controlador(Vista vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==vista.getAddContacto()) {
			try {
				System.out.println("le has dado click a a�adir contacto");
				VistaAnadir vistaAnadir = new VistaAnadir();
				ControladorAnadir controladorAnadir = new ControladorAnadir(vistaAnadir, modelo);
				vistaAnadir.addContactosOk(controladorAnadir);
				vistaAnadir.addContactosCancel(controladorAnadir);
			} catch (Exception e2) {
				VistaMensaje vistaMensaje = new VistaMensaje();
				ControladorMensaje controladorMensaje = new ControladorMensaje(vistaMensaje);
				vistaMensaje.inicializar("Error al crear el contacto.");
				vistaMensaje.mensajeOk(controladorMensaje);
			}
		}
		
		if(e.getSource()==vista.getEditContacto()) {
			try {
				System.out.println("le has dado click a editar contacto");
				VistaEditar vistaEditar = new VistaEditar();
				ControladorEditar controladorEditar = new ControladorEditar(vistaEditar, modelo);
				vistaEditar.addContactosOk(controladorEditar);
				vistaEditar.addContactosCancel(controladorEditar);
			} catch (Exception e2) {
				VistaMensaje vistaMensaje = new VistaMensaje();
				ControladorMensaje controladorMensaje = new ControladorMensaje(vistaMensaje);
				vistaMensaje.inicializar("No se ha seleccionado un contacto.");
				vistaMensaje.mensajeOk(controladorMensaje);
			}
		}
		
		if(e.getSource()==vista.getDeleteContacto()) {
			System.out.println("le has dado click a Eliminar contacto");
			try {
				modelo.borrarDato();
			} catch (ArrayIndexOutOfBoundsException e2) {
				VistaMensaje vistaMensaje = new VistaMensaje();
				ControladorMensaje controladorMensaje = new ControladorMensaje(vistaMensaje);
				vistaMensaje.inicializar("No se ha seleccionado un contacto.");
				vistaMensaje.mensajeOk(controladorMensaje);
				System.out.println("No se ha seleccionado elemento.");
			}
		}
	}
}
