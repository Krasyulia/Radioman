package ru.netology.oop;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextCurrentStation() {
        if (currentStation == 9) {
            currentStation = 0;
        }
        else {
            currentStation = currentStation + 1;
        }
    }

    public void prevCurrentStation() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume <0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    }

