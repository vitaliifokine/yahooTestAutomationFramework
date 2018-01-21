package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.domain.User;

public class LoginTest extends BaseTest {

    @Test
    public void testCanLoginAsValidUser() {
        User user = new User("andrewdavies80@yahoo.com", "vf281992");
        new LoginPage()
                .open()
                .loginAs(user);
    }
}
