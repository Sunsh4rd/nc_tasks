package except;

public class KeyAlreadyExists extends Exception {

    public KeyAlreadyExists(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
