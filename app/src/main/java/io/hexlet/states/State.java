package io.hexlet.states;

import io.hexlet.AlarmClock;

public interface State {

    String getStateName();

    void clickMode(AlarmClock clock);

    void clickH(AlarmClock clock);
    void clickM(AlarmClock clock);
}
