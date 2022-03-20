package searchtool.exception;

public class SearchToolException extends RuntimeException{
    public SearchToolException(String message, Throwable e){
        super(message, e);
    }
}
