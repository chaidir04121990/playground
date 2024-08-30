package digibank;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import java.net.MalformedURLException;

public class CucumberHooks {
    @Before
    public static void beforeAll() throws MalformedURLException {
        BaseTest.setUp();
    }

    @After
    public static void afterAll(){
        BaseTest.tearDown();
    }

}
