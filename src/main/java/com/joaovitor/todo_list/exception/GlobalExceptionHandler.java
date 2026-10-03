package com.joaovitor.todo_list.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Essa etiqueta diz: "Spring, eu sou a ouvidoria global de todos os Controllers"
@ControllerAdvice
public class GlobalExceptionHandler {

    // Essa etiqueta diz: "Quando alguém jogar uma Exception padrão, joga pra esse método resolver"
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {

        // Pega a mensagem que você escreveu lá no Service ("Não se pode salvar task vazia")
        String mensagem = ex.getMessage();

        // Retorna o Status 400 (Bad Request) e o corpo da resposta com a sua mensagem!
        return ResponseEntity.badRequest().body(mensagem);
    }
}