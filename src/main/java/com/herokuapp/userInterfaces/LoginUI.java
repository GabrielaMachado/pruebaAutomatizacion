package com.herokuapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target TXT_USERNAME = Target.the("username text").
            locatedBy("//*[@id=\"txt-username\"]");

    public static final Target TXT_PASSWORD = Target.the("password text").
            locatedBy("//*[@id=\"txt-password\"]");

    public static final Target BTN_LOGIN = Target.the("login button").
            locatedBy("//*[@id=\"btn-login\"]");

}
