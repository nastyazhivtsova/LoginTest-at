import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static LoginPage loginPage;
    public static WebDriver driver;


    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        System.setProperty("webdriver.chrome.driver", "/Users/nastyazhivtsova/chromedriver/chromedriver"); // опрелделяем путь до драйвера
        WebDriver driver = new ChromeDriver(); // создаем вебдрайвер
        driver.manage().window().maximize(); // окошко на весь экран
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://online.sberbank.ru/#/");

    }

    //        1.Открыть сайт: https://online.sberbank.ru/#/
//        2.Ввести в поле ЛОГИН : 123
//        3.Ввести в поле ПАРОЛЬ : 123
//        4.Нажать кнопку: Войти
//        5.Проверить что отобразился текст ошибки: Неверный логин или пароль. Если не можете войти,восстановите доступ.


    @Test
    public void LoginTest(){
        loginPage.LoginInput("123");
        loginPage.PasswordInput("123");
        loginPage.ClickButton();

    }
}


