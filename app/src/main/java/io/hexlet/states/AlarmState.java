package io.hexlet.states;

import io.hexlet.AlarmClock;

public final class AlarmState implements State {

    @Override
    public String getStateName() {
        return "alarm";
    }

    public void clickMode(AlarmClock clock) {
        clock.setState(new ClockState());
    }

    @Override
    public void clickH(AlarmClock clock) {
        clock.incrementAlarmHours();
    }

    @Override
    public void clickM(AlarmClock clock) {
        clock.incrementAlarmMinutes();
    }
}
