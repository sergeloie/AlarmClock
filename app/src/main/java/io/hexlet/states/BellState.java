package io.hexlet.states;

import io.hexlet.AlarmClock;

public final class BellState implements State {

    @Override
    public String getStateName() {
        return "bell";
    }

    @Override
    public void clickMode(AlarmClock clock) {
        clock.setState(new ClockState());
    }

    @Override
    public void clickH(AlarmClock clock) { }

    @Override
    public void clickM(AlarmClock clock) { }
}
