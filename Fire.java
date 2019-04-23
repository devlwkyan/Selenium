import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class Fire{
    public Fire( String url ){
        System.setProperty( "webdriver.gecko.driver", "/usr/local/bin/geckodriver" );
        File path = new File ("/home/devlwkyan/opt/devfire/firefox");
        FirefoxBinary binary = new FirefoxBinary(path);
        DesiredCapabilities desired = DesiredCapabilities.firefox();
        FirefoxOptions options = new FirefoxOptions();
        desired.setCapability( FirefoxOptions.FIREFOX_OPTIONS, options.setBinary( binary ));
        WebDriver obj = new FirefoxDriver(options);
        obj.get( url  );
    }
}
