import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.List;

public class Fire{
    public Fire( String[] url ){
        System.setProperty( "webdriver.gecko.driver", "/usr/local/bin/geckodriver" );
        File path = new File ("/home/devlwkyan/opt/devfire/firefox");
        FirefoxBinary binary = new FirefoxBinary(path);
        DesiredCapabilities desired = DesiredCapabilities.firefox();
        FirefoxOptions options = new FirefoxOptions();
        desired.setCapability( FirefoxOptions.FIREFOX_OPTIONS, options.setBinary( binary ));
        WebDriver obj = new FirefoxDriver(options);

        for ( int i = 0; i < url.length; i++ ) {
            if(i == 0){
                obj.get( "http://www."+ url[i] );
                obj.findElement( By.id("main-search")).sendKeys( "galaxy-s8" );
                obj.findElement( By.id( "btn-search" )).click();
//                obj.findElement( By.xpath( "//a[@href='/search/galaxy-s8?sort=MIN_PRICE&categoryId=77']" )).click();
                obj.findElement( By.xpath( "//*[contains(@value, 'MIN_PRICE'" ) ).click();
                obj.findElement( By.className( "btn__flat--card btn__go-pu" ) ).sendKeys( "COMPARE MAIS PREÇOS" );
            }
        }


//        obj.manage().window().maximize();


    }
}
