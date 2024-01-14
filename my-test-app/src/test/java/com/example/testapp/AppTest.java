package com.example.testapp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    public void shouldMoveNorthAndReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("NNN", 0, 3);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldMoveNortheastAndReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("NNNEE", 2, 3);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldMoveNorthwestAndReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("NNNWW", -2, 3);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldMoveSouthAndReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("SSSSS", 0, -5);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldMoveSoutheastAndReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("SSSSSEE", 2, -5);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldMoveSouthwestAndReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("SSSSSWW", -2, -5);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldMoveEastAndReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("EEEE", 4, 0);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldMoveWestAndReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("W", -1, 0);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldMoveNorthAndNotReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("NNN", 0, 4);

        //then
        assertThat(result).isFalse();
    }

    @Test
    public void shouldMoveNortheastAndNotReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("NNNEE", 1, 4);

        //then
        assertThat(result).isFalse();
    }

    @Test
    public void shouldMoveNorthwestAndNotReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("NNNWW", -3, 2);

        //then
        assertThat(result).isFalse();
    }

    @Test
    public void shouldMoveSouthAndNotReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("SSSSS", 0, -6);

        //then
        assertThat(result).isFalse();
    }

    @Test
    public void shouldMoveSoutheastAndNotReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("SSSSSEE", 3, -6);

        //then
        assertThat(result).isFalse();
    }

    @Test
    public void shouldMoveSouthwestAndNotReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("SSSSSWW", -1, -4);

        //then
        assertThat(result).isFalse();
    }

    @Test
    public void shouldMoveEastAndNotReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("EEEE", 3, 0);

        //then
        assertThat(result).isFalse();
    }

    @Test
    public void shouldMoveWestAndNotReachTheDestination() {
        //given
        App findMyDestination = new App();

        //when
        boolean result = findMyDestination.reachedDestination("W", -2, 0);

        //then
        assertThat(result).isFalse();
    }
}
