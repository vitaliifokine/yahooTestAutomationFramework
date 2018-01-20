package tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.domain.User;

public class LoginTest {

    @BeforeClass
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.yahoo.com/";
    }

    @Test
    public void testCanLoginAsValidUser() {
        User user = new User("andrewdavies80@yahoo.com", "vf281992");
        new LoginPage()
                .open()
                .loginAs(user);
    }
}
