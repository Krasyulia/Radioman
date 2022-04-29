package ru.netology.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test

    public void shouldTurnToNextStation() {

        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.nextCurrentStation();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnToNullStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.nextCurrentStation();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldTurnToNineStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.prevCurrentStation();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldTurnToPreviousStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(1);
        rad.prevCurrentStation();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNotTurnToNextStation() {
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setCurrentStation(10);
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNotTurnToPreviousStation() {
        Radio rad = new Radio();

        int expected = rad.getCurrentStation();
        rad.setCurrentStation(-1);
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 2;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNotIncreaseVolumeIfOverTen() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNotDecreaseVolumeUnderZero() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio rad = new Radio();

        int expected = rad.getCurrentVolume();
        rad.setCurrentVolume(-1);
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio rad = new Radio();

        int expected = rad.getCurrentVolume();
        rad.setCurrentVolume(11);
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

}