package rocketseat.com.passin.domain.event.exceptions;

public class EventNotFoundException  extends  RuntimeException{

    public EventNotFoundException (String message){
        //Super call contructor args
        super(message);
    }
}
