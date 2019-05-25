import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import currencyConverter.*;
import unitConverter.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefConverter {

    CurrencyConverter cc;
    UnitFactory uf;
    double ccResult, uResult;

    @Before
    public void init(){
        cc = CurrencyConverter.getCurrencyInstance();
        uf = UnitFactory.getInstance();
    }

    @When("I convert currency from (.*) THB: Thai Baht to (.*)")
    public void i_convert_thb_to(double amount, String currency){
        ccResult = cc.convertCurrency(amount, currency);
    }

    @Then("the result is (.*)")
    public void the_convert_thb_result_is(double result){
        assertEquals(result, ccResult);
    }

    @When("I convert (.*) from (.*) (.*) to (.*)")
    public void i_convert_to(UnitType type, double amount, String unit1, String unit2){
        UnitType unittype = (UnitType) type;
        Unit<?>[] units = uf.getUnits(unittype);
        Unit<?> n1 = null , n2 = null;

        for (Unit<?> unit: units) {
            if(unit1.equals(unit.toString())){ n1 = unit; }
            if(unit2.equals(unit.toString())){ n2 = unit; }
        }

        uResult = Double.parseDouble(String.format("%.5g",n1.convert(amount, n2)));
    }

    @Then("the unit result is (.*)")
    public void the_unit_convert_result_is(double result){
        assertEquals(result, uResult);
    }
}
