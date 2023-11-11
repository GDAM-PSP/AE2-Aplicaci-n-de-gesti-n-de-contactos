package modelo;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class A�adirBinario extends ObjectOutputStream{

	public A�adirBinario(OutputStream out) throws IOException {
		super(out);
		
	}
	
	public A�adirBinario() throws IOException, SecurityException {
		super();
	}
	
	
	//Sobreescribiendo este m�todo evitamos que al a�adir personas a�ada tambi�n nuevas cabeceras
		@Override 
		public void writeStreamHeader()throws IOException {
			File archivo = new File("registroPersona.bin");
			
			if(archivo.length()==0) {//Si el archivo est� vacio llamamos al m�todo padre para crear la cabecera inicial
				super.writeStreamHeader();
			}else {
				reset();
			}
		}
		
}
