package com.javanauta.usuario.infraestructure.config.exception;


public class ResourceNotFound extends RuntimeException {

    public ResourceNotFound(String mensagem) {
        super(mensagem);
    }
}