package com.herokuapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CuraHomeUI {

    public static final Target BTN_MAKE_APPOINTMENT = Target.the("button make appointment").
            locatedBy("//*[@id=\"btn-make-appointment\"]");

}
