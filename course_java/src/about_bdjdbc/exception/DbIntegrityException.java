package about_bdjdbc.exception;

public class DbIntegrityException  extends RuntimeException{
    public DbIntegrityException(String msg) {
        super(msg);
    }
}
