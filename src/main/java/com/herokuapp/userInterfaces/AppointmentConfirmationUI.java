package com.herokuapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AppointmentConfirmationUI {

    public static final Target LBL_APPOINTMENT_CONFIRMATION = Target.the("Appointment confirmation label").
            locatedBy("//*[@id=\"summary\"]/div/div/div[1]/h2");


}
