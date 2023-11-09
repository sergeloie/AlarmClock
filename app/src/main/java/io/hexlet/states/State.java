package io.hexlet.states;

import io.hexlet.AlarmClock;

public interface State {

    String stateName = null;

    void switchState(AlarmClock clock);

    void incrementHour(AlarmClock clock);
    void incrementMinute(AlarmClock clock);

    String getStateName();

    void clickMode(AlarmClock clock);


}
