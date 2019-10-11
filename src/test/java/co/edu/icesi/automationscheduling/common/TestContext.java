package test.java.co.edu.icesi.automationscheduling.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class TestContext {
    private final Properties properties = new Properties();

    public TestContext()
    {
        loadProperties("test.properties");
    }

    private void loadProperties(final String propertiesFileName)
    {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFileName))
        {
            properties.load(inputStream);
        }
        catch (IOException exception)
        {
            throw new IllegalStateException("Error loading " + propertiesFileName + " file", exception);
        }
    }

    public String getBaseUrl()
    {
        return properties.getProperty("baseUrl");
    }

    public String getDriverPath()
    {
        return properties.getProperty("pathToChromeDriver");
    }

    public String getName()
    {
        return properties.getProperty("completeName");
    }
    
    public String getlastName()
    {
        return properties.getProperty("lastName");
    }
    
    public String getPhone()
    {
        return properties.getProperty("phone");
    }
    
    public String getIdType()
    {
        return properties.getProperty("identification_type");
    }
    
    public String getId()
    {
        return properties.getProperty("identification");
    }

    public WebDriver getDriver()
    {
        System.setProperty("webdriver.chrome.driver", getDriverPath());
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);

        ChromeOptions options  = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        return new ChromeDriver(options);
    }
}
