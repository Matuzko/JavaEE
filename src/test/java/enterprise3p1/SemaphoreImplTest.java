package enterprise3p1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Дима on 13.05.2016.
 */
public class SemaphoreImplTest {

    @Test
    public void acquire() throws Exception {
        SemaphoreImpl semaphore = new SemaphoreImpl(5);
        semaphore.acquire();
        Assert.assertEquals(4, semaphore.getAvailablePermits());
    }
}