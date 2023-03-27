package com.herokuapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MakeAppointmentUI {

    public static final Target SELECT_FACILITY = Target.the("Tokyo CURA Healthcare Center").
            locatedBy("//*[@id=\"combo_facility\"]/option[1]");

    public static final Target CHECK_READMISSION = Target.the("Check to apply for hospital readmission").
            locatedBy("//*[@id=\"chk_hospotal_readmission\"]");

    public static final Target RB_PROGRAM = Target.the("Select healthcare program").
            locatedBy("//*[@id=\"radio_program_medicaid\"]");

    public static final Target TXT_VISIT_DATE = Target.the("Visit date").
            locatedBy("//*[@id=\"txt_visit_date\"]");
    public static final Target TXT_COMMENT = Target.the("Txt to comments").
            locatedBy("//*[@id=\"txt_comment\"]");

    public static final Target BTN_BOOK_APPOINTMENT = Target.the("button to book appointment").
            locatedBy("//*[@id=\"btn-book-appointment\"]");

}
