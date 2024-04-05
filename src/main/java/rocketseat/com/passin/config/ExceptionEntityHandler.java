package rocketseat.com.passin.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import rocketseat.com.passin.domain.event.exceptions.EventNotFoundException;

//Identifica a classe que captura os erros das cahamdas no controller
@ControllerAdvice
public class ExceptionEntityHandler {

    //informa que o evento lida com x elemento
    @ExceptionHandler(EventNotFoundException.class)
    public ResponseEntity handleEventNotFound(EventNotFoundException exception){
        return ResponseEntity.notFound().build();
    }
}
