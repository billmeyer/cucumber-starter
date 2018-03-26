package stepdefs;

//public class StepDefinitions
//{
//    @Given("^I am on the \"([^\"]*)\" page on URL \"([^\"]*)\"$")
//    public void i_am_on_the_page_on_URL(String arg1, String arg2) throws Throwable
//    {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
//    public void i_fill_in_with(String arg1, String arg2) throws Throwable
//    {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I click on the \"([^\"]*)\" button$")
//    public void i_click_on_the_button(String arg1) throws Throwable
//    {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Then("^I should see \"([^\"]*)\" message$")
//    public void i_should_see_message(String arg1) throws Throwable
//    {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Then("^I should see the \"([^\"]*)\" button$")
//    public void i_should_see_the_button(String arg1) throws Throwable
//    {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//}

import cucumber.api.java8.En;

public class StepDefinitions implements En
{
    public StepDefinitions()
    {
        Given("^I am on the '([^\"]*)' page on URL '([^\"]*)'$", (String companyName, String url) -> {
            System.out.format(">>> I'm on the %s page (url: %s)\n", companyName, url);
        });

        When("^I fill in '([^\"]*)' with '([^\"]*)'$", (String arg, String val) -> {
            System.out.format(">>> I fill in: %s and %s\n", arg, val);
        });

        When("^I click on the '([^\"]*)' button$", (String arg) -> {
            System.out.format(">>> I click on the %s button\n", arg);
        });

        Then("^I should see '([^\"]*)' message$", (String arg) -> {
            System.out.format(">>> I should see %s message\n", arg);
        });

        Then("^I should see the '([^\"]*)' button$", (String arg) -> {
            System.out.format(">>> I should see the %s button\n", arg);
        });
    }
}
