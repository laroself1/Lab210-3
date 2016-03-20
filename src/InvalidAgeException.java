/**
 * Created by LaroSelf on 20.03.2016.
 */
public class InvalidAgeException extends  RuntimeException {
private  String message;
    public InvalidAgeException(String a){this.message=a;}

    public String getMessage(){return message;}

}
