package io.hexlet.states;

import io.hexlet.AlarmClock;

public final class ClockState implements State {

    @Override
    public String getStateName() {
        return "clock";
    }

    @Override
    public void clickMode(AlarmClock clock) {
        clock.setState(new AlarmState());
    }

    @Override
    public void clickH(AlarmClock clock) {
        clock.incrementHours();
    }

    @Override
    public void clickM(AlarmClock clock) {
        clock.incrementMinutes();
    }
}
