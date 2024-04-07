package rocketseat.com.passin.domain.attendee.exceptions;

public class AttenddeNotFoundException extends RuntimeException{
    public AttenddeNotFoundException(String message){
        super(message);
    }
}
