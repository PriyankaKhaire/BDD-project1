package StepDefinition;

import io.cucumber.java.en.*;

public class SearchStep
{
	

@Given("i have search field on amazon page")
public void i_have_search_field_on_amazon_page() {
    System.out.println("i am in search page");
}

@When("i search for product with name {string} and price {int}")
public void i_search_for_product_with_name_and_price(String productname, Integer prize) {
    System.out.println("search the product with name" + productname + "price" + prize);
}

@Then("product with name {string} should be displayed")
public void product_with_name_should_be_displayed(String productname) {
   System.out.println("product" + productname + "is displayed");
}


}
