package org.miguel.optional.ejemplo;

import org.miguel.optional.ejemplo.models.Computador;
import org.miguel.optional.ejemplo.models.Fabricante;
import org.miguel.optional.ejemplo.models.Procesador;
import org.miguel.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.miguel.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);


    }

}
