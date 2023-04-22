package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test

    public void stationTest() {

        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void stationTest2() {

        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void stationTest3() {

        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeTest() {

        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        int actual = radio.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeTest2() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeTest3() {

        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeTest4() {

        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(4);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStation2() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStation3() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStation5() {

        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevStation2() {

        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevStation3() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevStation4() {

        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeUp() {

        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeUp2() {

        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeUp3() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeUp4() {

        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeDown() {

        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeDown2() {

        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeDown3() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeDown4() {

        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void extendedRadio() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(15);

        int actual = radio.getCurrentStation();
        int expected = 15;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void extendedRadio2() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(19);

        int actual = radio.getCurrentStation();
        int expected = 19;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void extendedRadio3() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(21);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void extendedRadio4() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void extendedNextRadio() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(15);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 16;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void extendedNextRadio2() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(29);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void extendedNextRadio3() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(28);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 29;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void extendedNextRadio4() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(0);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void extendedPrevRadio() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(15);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 14;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void extendedPrevRadio2() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(20);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 19;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void extendedPrevRadio3() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(1);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void extendedPrevRadio4() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(0);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 19;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void extendedVolumeUp() {

        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void extendedVolumeDown() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


}