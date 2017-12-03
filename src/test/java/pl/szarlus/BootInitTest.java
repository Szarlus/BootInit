package pl.szarlus;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.szarlus.controller.HelloController;

/**
 * Created by karol on 03.12.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BootInitTest {

    @Autowired
    private HelloController helloController;

    @Test
    public void checkIfContextLoads() throws Exception{
        Assertions.assertThat(helloController).isNotNull();
    }

}
