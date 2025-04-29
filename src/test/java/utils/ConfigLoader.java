package utils;

import contants.EnvType;

import java.util.Properties;

public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader() {
        String env = System.getProperty("env", String.valueOf(EnvType.UAT));
        switch (EnvType.valueOf(env)) {
            case DEVTEST2:
                properties = PropertyUtils.propertyLoader("src/test/resources/devtest2_config.properties");
                break;
            case ROBINQA:
                properties = PropertyUtils.propertyLoader("src/test/resources/robinqa_config.properties");
                break;
            case UAT:
                properties = PropertyUtils.propertyLoader("src/test/resources/uat_config.properties");
                break;
            default:
                throw new IllegalStateException("INVALID Environment Type .. " + env);

        }
    }

    public static ConfigLoader getInstance() {
        if (configLoader == null) {
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getBaseUrl() {
        String prop = properties.getProperty("baseURL");
        if (prop != null) return prop;
        else throw new RuntimeException("property baseURL is not specified in the devtest2_config.properties file");
    }

    public String getImplicitWaitTime() {
        return properties.getProperty("implicitWait");
    }
}
