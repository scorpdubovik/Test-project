package core;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private static Properties properties = null;
    private static String filename = "config.properties";

    static {
        properties = new Properties();
        try{
            properties.load(ReadProperties.class.getClassLoader().getResourceAsStream(filename));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String getUrl() { return properties.getProperty("url");}
    public static String getBrowserType() { return properties.getProperty("browserType");}
    public static boolean getHeadless() { return properties.getProperty("headless").equalsIgnoreCase("true");}
    public static int getTimeOut() {return Integer.parseInt(properties.getProperty("timeout"));}

    public static String getLogin() { return properties.getProperty("login");}
    public static String getPassword() { return properties.getProperty("password");}
    public static String getRecipientsMail() { return properties.getProperty("recipientsMail");}
    public static String getMailBody() { return properties.getProperty("mailBody");}
}
