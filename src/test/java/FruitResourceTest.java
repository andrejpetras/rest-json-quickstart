import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import io.smallrye.config.SmallRyeConfig;
import org.eclipse.microprofile.config.ConfigProvider;
import io.quarkus.test.common.QuarkusTestResource;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTestResource(ExampleTestResource.class)
@QuarkusTest
public class FruitResourceTest {

    @Test
    public void testHelloEndpoint() {
        System.out.println("##########################\nTest config profiles:" + ((SmallRyeConfig) ConfigProvider.getConfig()).getProfiles() + "\n##########################");
        given()
          .when().get("/fruits")
          .then()
             .statusCode(200);
    }

}