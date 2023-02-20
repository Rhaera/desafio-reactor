package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

public class Question3 {

    private static final Throwable Throwable = null;

    /*
    Verifica se o usuário passado é valido, caso seja retorna void, caso contrário deve disparar uma exception
    (para esse desafio vamos considerar que o usário é valido quando ele tem uma senha com mais de 8 caractéres)
     */
    public Mono<Void> userIsValid(final User user) {

        if (user.password.length() <= 8) Mono.error(Throwable);
        
        return null;

    }
}
