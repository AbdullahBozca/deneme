package stepdefinitions.APIStepdefinations;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;

import static Hooks.Hooks.spec;

public class StaffAPIStepdefinitions {

    Faker faker = new Faker();
    Response response;

    @Given("Kullanici hasta sorgusu icin gerekli path params ayarlar")
    public void kullaniciHastaSorgusuIcinGerekliPathParamsAyarlar() {
    //    https://medunna.com/api/patients
        spec.pathParams("first", "api", "second", "patients","thrid",2551);
    }




}
