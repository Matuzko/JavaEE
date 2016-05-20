package enterprise2;

import enterprise2.executorExceptions.AlreadyExecutorRunException;
import enterprise2.executorExceptions.ExecutorWasntRunYetException;

import java.util.ArrayList;
import java.util.List;

public class SerialExecutor<T> implements Executor<T> {

    private boolean runStatus = true;

    private List<T> validResults = new ArrayList<>();
    private List<T> invalidResults = new ArrayList<>();

    private List<Task<? extends T>> taskList = new ArrayList<>();
    private List<Validator<? super T>> validatorList = new ArrayList<>();


    @Override

    public void addTask(Task<? extends T> task) throws AlreadyExecutorRunException {
        if (runStatus) {
            taskList.add(task);
            validatorList.add(null);
        } else {
            throw new AlreadyExecutorRunException();
        }

    }

    @Override
    public void addTask(Task<? extends T> task, Validator<? super T> validator) throws AlreadyExecutorRunException {
        if (runStatus) {
            taskList.add(task);
            validatorList.add(validator);
        } else {
            throw new AlreadyExecutorRunException();
        }


    }

    @Override
    public void execute() {
        runStatus = false;
        for (int i = 0; i < taskList.size(); i++) {
            taskList.get(i).execute();
            if (validatorList.get(i) == null) {
                validResults.add(taskList.get(i).getResult());
            } else if (validatorList.get(i).isValid(taskList.get(i).getResult())) {

                validResults.add(taskList.get(i).getResult());
            } else
                invalidResults.add(taskList.get(i).getResult());


        }
    }

    @Override
    public List<T> getValidResults() throws ExecutorWasntRunYetException {
        if (true){
            throw new ExecutorWasntRunYetException();
        }
        return validResults;
    }

    @Override
    public List<T> getInvalidResults() throws ExecutorWasntRunYetException {
        if (true){
            throw new ExecutorWasntRunYetException();
        }
        return invalidResults;
    }
}
