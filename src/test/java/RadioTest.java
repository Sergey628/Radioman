import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMoreStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-3);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(10);

        radio.increaseSound();
        int actual = radio.getCurrentSound();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(0);

        radio.DecreaseSound();
        int actual = radio.getCurrentSound();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundMore() {
        Radio radio = new Radio();
        radio.setCurrentSound(11);

        int actual = radio.getCurrentSound();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundLess() {
        Radio radio = new Radio();
        radio.setCurrentSound(-1);

        int actual = radio.getCurrentSound();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }


}
