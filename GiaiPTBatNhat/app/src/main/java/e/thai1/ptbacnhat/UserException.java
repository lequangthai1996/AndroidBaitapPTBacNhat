package e.thai1.ptbacnhat;

/**
 * Created by PC on 19-Mar-18.
 */
public class UserException extends Exception {
    String message;

    public UserException() {
        super();
    }
    public UserException(String s){
        super(s);
        message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}