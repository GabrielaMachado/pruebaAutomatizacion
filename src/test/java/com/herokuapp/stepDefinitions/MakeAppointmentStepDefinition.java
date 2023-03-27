package com.herokuapp.stepDefinitions;

import com.herokuapp.pages.OpenBrowserPages;
import com.herokuapp.task.Login;
import com.herokuapp.task.MakeAppointment;
import com.herokuapp.userInterfaces.AppointmentConfirmationUI;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

public class MakeAppointmentStepDefinition {
    OpenBrowserPages openBrowserPages;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("the actor is on the CURA website")
    public void theActorIsOnTheCURAWebsite() {
        OnStage.theActorCalled("").
                wasAbleTo(Open.browserOn(openBrowserPages));
    }
    @When("the actor is log in and completes the appointment form")
    public void theActorIsLogInAndCompletesTheAppointmentForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.on());
        OnStage.theActorInTheSpotlight().attemptsTo(MakeAppointment.on());
    }
    @Then("the actor sees the appointment confirmation")
    public void theActorSeesTheAppointmentConfirmation() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion
                .the(AppointmentConfirmationUI.LBL_APPOINTMENT_CONFIRMATION.of()),
                WebElementStateMatchers.containsText("Appointment Confirmation")));
    }

}
