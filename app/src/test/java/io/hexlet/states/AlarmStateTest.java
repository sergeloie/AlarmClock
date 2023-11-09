package io.hexlet.states;

import io.hexlet.AlarmClock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmStateTest {

    @Test
    void clickMode() {
        AlarmClock clock = new AlarmClock();
        clock.clickMode();
        clock.clickMode();
        clock.clickMode();
        clock.clickMode();
        clock.clickMode();
        clock.clickMode();
    }
}