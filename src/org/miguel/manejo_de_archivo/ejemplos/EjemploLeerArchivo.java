package org.miguel.manejo_de_archivo.ejemplos;

import org.miguel.manejo_de_archivo.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
  public static void main(String[] args) {
    String nombreArchivo = "C:\\Users\\Miguel\\Documents\\java.txt";
    ArchivoServicio servicio = new ArchivoServicio();

    System.out.println(servicio.leerArchivo(nombreArchivo));
  }
}
