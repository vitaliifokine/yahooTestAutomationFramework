package pages;

import com.codeborne.selenide.Selenide;
import pages.domain.User;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public LoginPage open() {
        Selenide.open("https://www.yahoo.com/");
        return this;
    }

    public MainPage loginAs(User user) {
        $("#uh-signin").click();
        $("#login-username").val(user.getUsername());
        $("#login-signin").click();
        $("#login-passwd").val(user.getPassword());
        $("#login-signin").click();
        return new MainPage();
    }
}
