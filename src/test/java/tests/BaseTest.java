package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeTest;


public class BaseTest {
    @BeforeTest
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.yahoo.com/";
        Selenide.open("https://www.yahoo.com/");
    }
}
