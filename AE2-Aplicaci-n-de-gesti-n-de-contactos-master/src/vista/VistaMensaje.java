package vista;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.ControladorMensaje;

public class VistaMensaje extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6999326888421057417L;
	JLabel mensajeLabel;
	JButton ok;
	
	public VistaMensaje() throws HeadlessException {
	}
	
	public void inicializar(String mensaje) {
		setBounds(900,200,450,300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		//El Label del nombre y del telefono se inicializa y se coloca con su respectiva fuente tamaño etc... y se añade
		mensajeLabel = new JLabel();
		mensajeLabel.setBounds(50,30,400,50);
		mensajeLabel.setText(mensaje);
		mensajeLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(mensajeLabel);
		
		//Agrego los botones ok y cancel en su posicion con su grosor y decoraciones varias
		ok = new JButton();
		ok.setBounds(150,210,100,50);
		ok.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ok.setText("OK");
		add(ok);
	}
	
	public void mensajeOk(ControladorMensaje controlador) {
		ok.addActionListener(controlador);
	}
	
	public JButton getOk() {
		return ok;
	}

	public JLabel getMensaje() {
		return mensajeLabel;
	}
	
	public void setMensaje(JLabel mensajeLabel) {
		this.mensajeLabel = mensajeLabel;
	}
}
