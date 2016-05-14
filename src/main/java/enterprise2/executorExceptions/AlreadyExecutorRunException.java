package enterprise2.executorExceptions;

/**
 * Created by Дима on 11.05.2016.
 */
public class AlreadyExecutorRunException extends Exception {
    public AlreadyExecutorRunException() {
        super("Executor was already started");
    }
}
