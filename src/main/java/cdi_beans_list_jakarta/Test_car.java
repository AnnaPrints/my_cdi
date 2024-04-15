package cdi_beans_list_jakarta;

import javax.inject.Inject;
import javax.inject.Named;

public class Test_car {
    @Inject
    @Named("driver")
    public Test driverSeat;

    @Inject
    @Named("passenger")
    public Test passengerSeat;

}
