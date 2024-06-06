import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldAcceptableCountOfRadioStation() {
        Radio radio = new Radio(56);

        radio.setCurrentRadioStation(54);

        int expected = 54;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessThanMinCountOfRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIfCountOfRadioStationIsNull() {
        Radio station = new Radio();

        station.setCurrentRadioStation(0);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIfCountOfRadioStationIsOne() {
        Radio station = new Radio();

        station.setCurrentRadioStation(1);

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextIfCurrentStationIsFiveIfCountOfRadioStationByDefault() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);
        station.nextRadioStation();

        int expected = 6;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextIfCurrentStationIsNullIfCountOfRadioStationByDefault() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);
        station.nextRadioStation();

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextIfCurrentStationIsOneIfCountOfRadioStationByDefault() {
        Radio station = new Radio();
        station.setCurrentRadioStation(1);
        station.nextRadioStation();

        int expected = 2;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextIfCurrentStationIsEightIfCountOfRadioStationByDefault() {
        Radio station = new Radio();
        station.setCurrentRadioStation(8);
        station.nextRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextIfCurrentStationIsNineIfCountOfRadioStationByDefault() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        station.nextRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevIfCurrentStationIsFiveIfCountOfRadioStationByDefault() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);
        station.prevRadioStation();

        int expected = 4;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevIfCurrentStationIsNullIfCountOfRadioStationByDefault() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);
        station.prevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevIfCurrentStationIsOneIfCountOfRadioStationByDefault() {
        Radio station = new Radio();
        station.setCurrentRadioStation(1);
        station.prevRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevIfCurrentStationIsEightIfCountOfRadioStationByDefault() {
        Radio station = new Radio();
        station.setCurrentRadioStation(8);
        station.prevRadioStation();

        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevIfCurrentStationIsNineIfCountOfRadioStationByDefault() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        station.prevRadioStation();

        int expected = 8;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToAcceptableVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(50);

        int expected = 50;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMoreThenMaxVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(120);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessThanMinVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIfVolumeIsNull() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIfVolumeIsOne() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIfVolumeIsNinetyNine() {
        Radio volume = new Radio();

        volume.setCurrentVolume(99);

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIfVolumeIsHundred() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        int expected = 0;
        int actual = volume.getCurrentVolume();
    }

    @Test
    public void shouldSetIfVolumeIsHundredOne() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(58);
        volume.increaseVolume();

        int expected = 59;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfVolumeIsHundred() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfVolumeIsNinetyNine() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(6);
        volume.decreaseVolume();

        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseIfVolumeIsNull() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseIfVolumeIsOne() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
