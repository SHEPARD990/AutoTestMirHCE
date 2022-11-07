package utils;

import java.io.*;
import java.util.Properties;

public class PropertyReader {
    private static Properties properties;
    private final String propertyFilePath= "C:\\Projects\\Intellij_idea\\AutoTestMirHCE\\src\\main\\resources\\testconfig.properties";

    public PropertyReader(){
        BufferedReader reader;
        try {
            properties = new Properties();
            reader = new BufferedReader(new FileReader(propertyFilePath));
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }
    public static String getThisProperty(String key){
        try{
            key = properties.getProperty(key);
        }catch (RuntimeException e){
            throw new RuntimeException(key + "not specified in the Configuration.properties file.");
        }
        return key;
    }

    public static String getLogSource(){
        String LogSource = properties.getProperty("LogSource");
        if(LogSource!= null) return LogSource;
        else throw new RuntimeException("LogSource not specified in the Configuration.properties file.");
    }

    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if(url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

}


//    public static void getInit(String file) throws AssertionError {
//        try {
//            //create a object for class InputStream and Load properties file
//            props.load(new FileInputStream(file)); //==InputStream input = new FileInputStream(projectPath + "/src/test/java/test/config.properties");+ prop.load(input);
//            getProperty("checkLogLocation");
//        } catch (Exception e) {
//            try {
//                props.load(props.getClass().getResourceAsStream(file));
//                getProperty("checkLogLocation");
//
//            } catch (FileNotFoundException e1) {
//                throw new AssertionError("File with locator's information not found: " + e.toString());
//            } catch (IOException e1) {
//                throw new AssertionError("IO error while trying to reach locator's information file: " + e.toString());
//            }
//        }
//    }
//
//    public static String getProperty(String key) {
//        return props.getProperty(key);
//    }