package io.github.arielsegura.starterexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class SimpleTest {
    @Test
    public void contextLoads() throws Exception {
        // application test well configured
    }
}
