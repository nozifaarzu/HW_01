package stepDef;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends Config {
    //QA: http://www.qa.taltektc.com
    //Stage: http://www.stage.taltektc.com
    //Prod: http://www.prod.taltektc.com


    public static String url;
    //getting input from user
    public static String driverType = System.getProperty("browser");
    public static String envType = System.getProperty("env");

    @Before
    public void beforeTest() {
        if (Strings.isNullOrEmpty(driverType)) {
            driverType = "chrome";
        }
        if (Strings.isNullOrEmpty(envType)) {
            envType = "qa";
        }

    driver = setupBrowser(driverType);



    switch(envType){
        case "qa":
            url = "http://www.qa.taltektc.com";
            break;

        case "stg":
            url = "http://www.stage.taltektc.com";
            break;

        case "prod":
            url = "http://www.prod.taltektc.com";
            break;

        default:
            url = "http://www.qa.taltektc.com";
    }
        driver.get(url);

}

    @After
    public void afterEachTest(){
        driver.quit();
    }
}

