package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;

public class Vista extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2148362886594534836L;
	JLabel contactoTexto;
	JTable table;
	DefaultTableModel modeloTabla;
	JScrollPane scrollpane;
	JLabel addContacto;
	JLabel deleteContacto;
	JLabel editContacto;
	
	public Vista() {
		setBounds(150,100,700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		inicializar();
		setVisible(true);
	}
	
	private void inicializar() {
		ImageIcon img = new ImageIcon("src/img/agenda.png");
		this.setIconImage(img.getImage());
		
		//Creo el label con el t�tulo
		contactoTexto = new JLabel();
		//La posici�n del texto
		contactoTexto.setBounds(180,50,100,100);
		//El contenido del texto
		contactoTexto.setText("Mis Contactos");
		//El primer numero indica el espacio de largo width --> de las letras y el segundo alto heigh si el texto es mas grande ocupara mas espacio de alto y largo esto se usa para eso
		contactoTexto.setSize(400,50);
		//Le a�ado una nueva fuente que sea Tahoma en negrita y con 50 de tama�o
		contactoTexto.setFont(new Font("Tahoma", Font.BOLD, 50));
		//le cambiamos el color del texto a blue
		contactoTexto.setForeground(Color.blue);
		//Lo a�adimos todo al JFrame
		add(contactoTexto);
		
		//Creacion de las columnas
		String[] datos = {"Nombre","Telefono"};
		//modeloTabla con los datos y 0 lineas de datos que se muestran, si lo cambias a n saldran n lineas en blanco
		modeloTabla = new DefaultTableModel(datos, 0);
		
		//A�adimos a un JTable el modeloTabla
		table = new JTable(modeloTabla);
		
		//Le a�adimos un scrollPane a la tabla y le damos las proporciones
		scrollpane = new JScrollPane(table);
		scrollpane.setBounds(100,150,500,300);
		add(scrollpane);
		
		addContacto = new JLabel();
		addContacto.setIcon(new ImageIcon("src/img/add.png"));
		addContacto.setBounds(130,500,100,100);
		//funci�n para escalar las im�genes
		escalarIcono(addContacto);
		add(addContacto);
		
		editContacto = new JLabel();
		editContacto.setIcon(new ImageIcon("src/img/edit.png"));
		editContacto.setBounds(300,525,50,50);
		//funci�n para escalar las im�genes
		escalarIcono(editContacto);
		add(editContacto);
		
		deleteContacto = new JLabel();
		deleteContacto.setIcon(new ImageIcon("src/img/delete.png"));
		deleteContacto.setBounds(400,525,50,50);
		//funci�n para escalar las im�genes
		escalarIcono(deleteContacto);
		add(deleteContacto);	
	}
	
	//Esta funci�n reescala las imagenes que le pases para que cuadren
	public void escalarIcono(JLabel label) {
	    if (label.getIcon() != null) {
	        ImageIcon icon = (ImageIcon) label.getIcon();
	        Image img = icon.getImage();
	        Image imgEscalada = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
	        ImageIcon iconoEscalado = new ImageIcon(imgEscalada);
	        label.setIcon(iconoEscalado);
	    }
	}
	
	public void addContactos(Controlador controlador) {
		addContacto.addMouseListener(controlador);
	}
	
	public void editContactos(Controlador controlador) {
		editContacto.addMouseListener(controlador);
	}
	
	public void deleteContactos(Controlador controlador) {
		deleteContacto.addMouseListener(controlador);
	}
	
	public JLabel getContactoTexto() {
		return contactoTexto;
	}
	
	public void setContactoTexto(JLabel contactoTexto) {
		this.contactoTexto = contactoTexto;
	}
	
	public JTable getTable() {
		return table;
	}
	
	public void setTable(JTable table) {
		this.table = table;
	}
	
	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}
	
	public void setModeloTabla(DefaultTableModel modeloTabla) {
		this.modeloTabla = modeloTabla;
	}
	
	public JScrollPane getScrollpane() {
		return scrollpane;
	}
	
	public void setScrollpane(JScrollPane scrollpane) {
		this.scrollpane = scrollpane;
	}
	
	public JLabel getAddContacto() {
		return addContacto;
	}
	
	public void setAddContacto(JLabel addContacto) {
		this.addContacto = addContacto;
	}
	
	public JLabel getDeleteContacto() {
		return deleteContacto;
	}
	
	public void setDeleteContacto(JLabel deleteContacto) {
		this.deleteContacto = deleteContacto;
	}
	
	public JLabel getEditContacto() {
		return editContacto;
	}
	
	public void setEditContacto(JLabel editContacto) {
		this.editContacto = editContacto;
	}	
}
