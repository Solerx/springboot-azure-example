package pt.jimmyboys.azuresample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by adaofeliz on 06/05/15.
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class) // Web Application base config file
public class ApplicationTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void testSpringApplicationContextLoad() throws Exception {
        Assert.assertNotNull(context);
    }
}