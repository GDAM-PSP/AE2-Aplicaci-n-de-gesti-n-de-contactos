package vista;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ControladorAnadir;
import controlador.ControladorEditar;

public class VistaEditar extends JFrame{
	JLabel nombre;
	JTextField textonombre;
	JLabel telefono;
	JTextField textotelefono;
	JButton ok;
	JButton cancel;
	public VistaEditar() throws HeadlessException {
		setBounds(900,200,400,300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		inicializar();
		setVisible(true);
	}
	public void inicializar() {
		//El Label del nombre y del telefono se inicializa y se coloca con su respectiva fuente tamaño etc... y se añade
		nombre = new JLabel();
		nombre.setBounds(50,30,100,50);
		nombre.setText("Nombre");
		nombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(nombre);
		
		telefono = new JLabel();
		telefono.setBounds(50,100,100,50);
		telefono.setText("Teléfono");
		telefono.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(telefono);
		
		//El Input del nombre y el del telefono se inicializan y se da tamaño de fuente y de width
		textonombre = new JTextField();
		textonombre.setBounds(150,45,180,23);
		textonombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(textonombre);
		
		textotelefono = new JTextField();
		textotelefono.setBounds(150,115,180,23);
		textotelefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(textotelefono);
		
		//Agrego los botones ok y cancel en su posicion con su grosor y decoraciones varias
		ok = new JButton();
		ok.setBounds(150,210,100,50);
		ok.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ok.setText("OK");
		add(ok);
		
		cancel = new JButton();
		cancel.setBounds(270,210,100,50);
		cancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cancel.setText("Cancel");
		add(cancel);
	}
	public void addContactosOk(ControladorEditar controlador) {
		ok.addActionListener(controlador);
	}
	public void addContactosCancel(ControladorEditar controlador) {
		cancel.addActionListener(controlador);
	}
	public JLabel getNombre() {
		return nombre;
	}
	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}
	public JTextField getTextonombre() {
		return textonombre;
	}
	public void setTextonombre(JTextField textonombre) {
		this.textonombre = textonombre;
	}
	public JLabel getTelefono() {
		return telefono;
	}
	public void setTelefono(JLabel telefono) {
		this.telefono = telefono;
	}
	public JTextField getTextotelefono() {
		return textotelefono;
	}
	public void setTextotelefono(JTextField textotelefono) {
		this.textotelefono = textotelefono;
	}
	public JButton getOk() {
		return ok;
	}
	public void setOk(JButton ok) {
		this.ok = ok;
	}
	public JButton getCancel() {
		return cancel;
	}
	public void setCancel(JButton cancel) {
		this.cancel = cancel;
	}
}
