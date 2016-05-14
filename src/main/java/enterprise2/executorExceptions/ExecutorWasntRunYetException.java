package enterprise2.executorExceptions;

/**
 * Created by Дима on 11.05.2016.
 */
public class ExecutorWasntRunYetException extends Exception {
    public ExecutorWasntRunYetException() {
        super("Executor wasn`t run yet");
    }
}
