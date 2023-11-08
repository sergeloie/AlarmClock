package io.hexlet.states;

import io.hexlet.AlarmClock;

public interface State {

    String stateName = null;

    void switchDisplayMode(AlarmClock clock);
    void switchAlarmMode(AlarmClock clock);
    void turnOffAlarmSound(AlarmClock clock);
    void incrementHour(AlarmClock clock);
    void incrementMinute(AlarmClock clock);

    String getStateName();


}
