package customeType;

import domainObjects.CityDetails;
import io.cucumber.java.ParameterType;

public class CustomParameterType {

    @ParameterType(".*")
    public CityDetails cityName(String city) {
        return new CityDetails(city.replace("\"", ""));
    }
}
