package org.miguel.manejo_de_archivo.ejemplos;

import org.miguel.manejo_de_archivo.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
  public static void main(String[] args) {
    String nombreArchivo = "C:\\Users\\Miguel\\Documents\\java.txt";

    ArchivoServicio service = new ArchivoServicio();
    service.crearArchivo2(nombreArchivo);
  }
}
