import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class Base {
    @BeforeTest
    public void setup() {
        RestAssured.baseURI="https://api.kloudless.com/v1/accounts/399046502/crm/accounts";
    }
}
