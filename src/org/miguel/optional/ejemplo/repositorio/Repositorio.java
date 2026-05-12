package org.miguel.optional.ejemplo.repositorio;

import org.miguel.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
