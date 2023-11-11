package modelo;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AñadirBinario extends ObjectOutputStream{

	public AñadirBinario(OutputStream out) throws IOException {
		super(out);
		
	}
	
	public AñadirBinario() throws IOException, SecurityException {
		super();
	}
	
	
	//Sobreescribiendo este método evitamos que al añadir personas añada también nuevas cabeceras
		@Override 
		public void writeStreamHeader()throws IOException {
			File archivo = new File("registroPersona.bin");
			
			if(archivo.length()==0) {//Si el archivo está vacio llamamos al método padre para crear la cabecera inicial
				super.writeStreamHeader();
			}else {
				reset();
			}
		}
		
}
