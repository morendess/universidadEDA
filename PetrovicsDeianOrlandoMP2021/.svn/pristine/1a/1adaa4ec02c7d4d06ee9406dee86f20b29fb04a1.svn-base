package org.mp.sesion06;

import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * The Class UtilidadArchivos.
 *
 */
public class UtilidadArchivos {
	
	/** The lista. */
	private ArrayList lista = new ArrayList();
	
	/**
	 * Instantiates a new utilidad archivos.
	 */
	public UtilidadArchivos() {
		
	}
	
	/**
	 * Copiar.
	 *
	 * @param origen the origen
	 * @param destino the destino
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void copiar(File origen, File destino) throws IOException{
		
		InputStream in = new FileInputStream(origen);
		OutputStream out = new FileOutputStream(destino);
		
		 byte[] buf = new byte[1024];
		 int len;
		 while((len = in.read(buf))>0) {
			 out.write(buf, 0, len);
		 }
		 
		 in.close();
		 out.close();
	}
	
	/**
	 * Listar directorios archivos.
	 *
	 * @param dir the dir
	 * @return the array list
	 */
	public ArrayList listarDirectoriosArchivos(File dir) {
		lista.clear();
		listarDirectoriosArchivosRec(dir);
		return lista;
	}
	
	/**
	 * Listar directorios archivos rec.
	 *
	 * @param dir the dir
	 */
	private void listarDirectoriosArchivosRec(File dir) {
		lista.add(dir.getAbsoluteFile());
		if(dir.isDirectory()) {
			String[] hijos1 = dir.list();
			for(int i=0; i<hijos1.length; i++) {
				listarDirectoriosArchivosRec(new File(dir, hijos1[i]));
			}
		}
	}
	
	/**
	 * Zip.
	 *
	 * @param dir the dir
	 * @param caminoSalida the camino salida
	 * @param nombreArchivo the nombre archivo
	 */
	public void zip(File dir, String caminoSalida, String nombreArchivo) {
		
		listarDirectoriosArchivos(dir);
		byte[] buffer = new byte[1024];
		try {
			String archivoSalida = caminoSalida + File.separator + nombreArchivo;
			ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(archivoSalida));
			
			for(Iterator iter = lista.iterator(); iter.hasNext();) {
				File elemento = ((File) iter.next());
				if(elemento.isFile()) {
					FileInputStream fis = new FileInputStream(elemento.getAbsolutePath());
					zos.putNextEntry(new ZipEntry(elemento.getAbsolutePath()));
					int len;
					while((len = fis.read(buffer))>0) {
						zos.write(buffer, 0, len);
					}
					
					zos.closeEntry();
				}
				
			}
			}catch(IOException e) {
				e.printStackTrace();
		}
	}
}
