package stepdefinitions.APIStepdefinations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Registrant;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.WriteToTxt.saveRegistrantApiData;

public class RegistrantApiSteps {


    Registrant registrant = new Registrant();
    Faker faker = new Faker();
    Response response;


    @Given("kullanici gerekli path params ayarlar")
    public void kullanici_gerekli_path_params_ayarlar() {
        spec.pathParams("first", "api", "second", "register");
    }

    @Given("Kullanici expected datalari girer {string} {string} {string} {string} {string} {string} ve {string}")
    public void kullanici_expected_datalari_girer(String firstname, String lastname, String ssn, String email, String username, String password, String langkey) {

        firstname = faker.name().firstName();
        lastname = faker.name().lastName();
        ssn = faker.idNumber().ssnValid();
        email = faker.internet().emailAddress();
        username = faker.name().username();
        password = faker.internet().password(8,10,true, true);

        registrant.setFirstName(firstname);
        registrant.setLastName(lastname);
        registrant.setSsn(ssn);
        registrant.setEmail(email);
        registrant.setLogin(username);
        registrant.setPassword(password);
        registrant.setLangKey(langkey);

    }

    @Given("kullanici request gonderir ve response alir")
    public void kullanici_request_gonderir_ve_response_alir() {
        response = given().spec(spec).contentType(ContentType.JSON)
                .body(registrant)
                .when()
                .post("/{first}/{second}");
    }

    @When("kullanici API kayitlarini dosyaya kaydeder")
    public void kullanici_apı_kayitlarini_dosyaya_kaydeder() {
        saveRegistrantApiData(registrant);

    }

    @Then("kullanici API kayitlarini onaylar")
    public void kullanici_apı_kayitlarini_onaylar() throws JsonProcessingException {
        response.then().statusCode(201);
        response.prettyPrint();

        ObjectMapper obj = new ObjectMapper();

        Registrant actualRegistrant = obj.readValue(response.asString(), Registrant.class);

        System.out.println("Actual Data: " + actualRegistrant);

        Assert.assertEquals(registrant.getFirstName(), actualRegistrant.getFirstName());
        Assert.assertEquals(registrant.getLastName(), actualRegistrant.getLastName());
        Assert.assertEquals(registrant.getSsn(), actualRegistrant.getSsn());
        Assert.assertEquals(registrant.getEmail(), actualRegistrant.getEmail());
        Assert.assertEquals(registrant.getLogin(), actualRegistrant.getLogin());

    }
}
