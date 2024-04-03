package rocketseat.com.passin.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//identifica nossa class como um controller
@RestController
//mapeamento do nosso endpoint
@RequestMapping("/attendees")
public class AttendeeController {
    //identifica o metodo que escuta uma requisição do tipo get
    @GetMapping
    public ResponseEntity<String> getTest(){
        return  ResponseEntity.ok("Sucesso!");
    }
}
