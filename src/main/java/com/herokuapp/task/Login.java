package com.herokuapp.task;

import com.herokuapp.userInterfaces.CuraHomeUI;
import com.herokuapp.userInterfaces.LoginUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CuraHomeUI.BTN_MAKE_APPOINTMENT),
                Enter.keyValues("John Doe").into(LoginUI.TXT_USERNAME),
                Enter.keyValues("ThisIsNotAPassword").into(LoginUI.TXT_PASSWORD),
                Click.on(LoginUI.BTN_LOGIN)
        );
    }

    public static Performable on() {
        return Instrumented.instanceOf(Login.class).withProperties();
    }

}
