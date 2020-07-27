import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class GetAccount extends Base{
    @Test
    public void getAccounts() {
        List<String> response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .header("Authorization", "ApiKey PereFdL3OTLNo2_ixpI2Gc7SE4Qq0kgm-IX9-pHi5jnEgC_o")
                .get()
                .then()
                .extract()
                .path("objects.name");
        Random random = new Random();
        String randomElement = response.get(random.nextInt(response.size()));
        System.out.println(randomElement);
    }
}
