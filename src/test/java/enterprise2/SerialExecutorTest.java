package enterprise2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Дима on 14.05.2016.
 */
public class SerialExecutorTest {

    @Test
    public void getValidResults() throws Exception {
        SerialExecutor<Integer> executor = new SerialExecutor<>();
        executor.addTask(new AddTask(1, 2));
        executor.addTask(new AddTask(-8, -1), new NumberValidator());
        executor.execute();


        Assert.assertEquals(Integer.valueOf(3), executor.getValidResults().get(0));
        Assert.assertEquals(Integer.valueOf(-9),executor.getInvalidResults().get(0));
    }

    private static class AddTask implements Task<Integer> {
        private int value1, value2, result;

        public AddTask(int value2, int value1) {
            this.value2 = value2;
            this.value1 = value1;
        }

        @Override
        public void execute() {
            this.result = this.value1 + this.value2;
        }

        @Override
        public Integer getResult() {
            return result;
        }
    }
    private static class NumberValidator implements Validator <Number>{
        @Override
        public boolean isValid(Number result) {
            if (result.intValue() > 0){
                return true;
            }
            else if (result.doubleValue() > 0){
                return true;
            }
            return false;
        }
    }
}