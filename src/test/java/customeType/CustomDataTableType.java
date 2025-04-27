package customeType;

import domainObjects.PurchaseDetails;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDataTableType {

    @DataTableType
    public PurchaseDetails purchaseDetailsEntry(Map<String, String> entry) {
        return new PurchaseDetails(entry.get("name"),
                entry.get("address"),
                entry.get("city"),
                entry.get("state"),
                entry.get("zipCode"),
                entry.get("cardType"),
                entry.get("creditCardNumber"),
                entry.get("month"),
                entry.get("year"),
                entry.get("nameOnCard"));
    }

}
