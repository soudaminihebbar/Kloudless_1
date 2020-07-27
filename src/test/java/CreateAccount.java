import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;

public class CreateAccount extends Base{
    @Test
    public void createAccount() {
        File file = new File("account.json");
        String response = RestAssured
                .given()
                .log().all()
                .contentType(ContentType.JSON)
                .header("Authorization", "ApiKey PereFdL3OTLNo2_ixpI2Gc7SE4Qq0kgm-IX9-pHi5jnEgC_o")
                .body(file)
                .post()
                .then()
                .extract()
                .path("name");
        System.out.println("   "+ response);
    }
}
