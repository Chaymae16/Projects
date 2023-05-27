package secondProject;

public class WebDriverTester {
    public static void main(String[] args) {
        ChromeDriver driver1=new ChromeDriver();
        driver1.close();
        driver1.getScreenShot();
        driver1.getTitle();
        driver1.open();
        driver1.navigate();

        FirefoxDriver driver2=new FirefoxDriver();
        driver2.close();
        driver2.getScreenShot();
        driver2.getTitle();
        driver2.open();
        driver2.navigate();

        SafariDriver driver3=new SafariDriver();
        driver3.close();
        driver3.getScreenShot();
        driver3.getTitle();
        driver3.open();
        driver3.navigate();

    }
}
