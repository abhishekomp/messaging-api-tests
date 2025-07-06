package org.example.stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.aom.NotificationService;
import org.example.SpringContextHolder;

import static org.assertj.core.api.Assertions.assertThat;

public class NotificationSteps {

    private String actualMessage;

    @When("I send a notification with {string} to {string}")
    public void i_send_a_notification(String message, String recipient) {
        NotificationService notificationService = SpringContextHolder
                .getContext().getBean(NotificationService.class);
        actualMessage = notificationService.send(message, recipient);
        assertThat(actualMessage).isNotBlank();
    }

    @Then("the response should contain {string}")
    public void the_response_should_contain(String expected) {
        // Your assertion (using plain JUnit or Hamcrest)
        assert actualMessage.contains(expected);
    }
}