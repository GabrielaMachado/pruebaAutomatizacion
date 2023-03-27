package com.herokuapp.task;

import com.herokuapp.userInterfaces.MakeAppointmentUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class MakeAppointment implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MakeAppointmentUI.SELECT_FACILITY),
                Click.on(MakeAppointmentUI.CHECK_READMISSION),
                Click.on(MakeAppointmentUI.RB_PROGRAM),
                Enter.keyValues("12/04/2023").into(MakeAppointmentUI.TXT_VISIT_DATE),
                Enter.keyValues("No comments").into(MakeAppointmentUI.TXT_COMMENT),
                Click.on(MakeAppointmentUI.BTN_BOOK_APPOINTMENT)
        );
    }

    public static Performable on() {
        return Instrumented.instanceOf(MakeAppointment.class).withProperties();
    }

}
