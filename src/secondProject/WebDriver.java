package secondProject;
/*
10. Provide Implementation for the diagram below.
 Then create a test class in which you need to
 create Objects of ChromeDriver, FirefoxDrive and
 SafariDriver classes and see which methods
 available to them.
 */
public interface WebDriver {
    void open();
    void close();
    void getTitle();
}
interface TakesScreenShot{
    void getScreenShot();
}

interface  RemoteWebDriver extends WebDriver,TakesScreenShot{
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open Chrome");
    }

    @Override
    public void close() {
        System.out.println("close Chrome");
    }

    @Override
    public void getTitle() {
        System.out.println("Title");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Take screenShot");
    }

    @Override
    public void navigate() {
        System.out.println("navigate to Chrome");
    }
}

class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open FireFox");
    }

    @Override
    public void close() {
        System.out.println("close FireFox");
    }

    @Override
    public void getTitle() {
        System.out.println("get Title");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Take screenShot");

    }

    @Override
    public void navigate() {
        System.out.println("navigate to FireFox");

    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open Safari");

    }

    @Override
    public void close() {
        System.out.println("close Safari");

    }

    @Override
    public void getTitle() {
        System.out.println("title");

    }

    @Override
    public void getScreenShot() {
        System.out.println("Take screenShot");

    }

    @Override
    public void navigate() {
        System.out.println("navigate to Safari");

    }
}
