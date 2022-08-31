import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {



    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext6() {
        Radio radio = new Radio(55);
        radio.setCurrentStation(53);


        int actual = radio.getCurrentStation();
        int expected = 53;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext7() {
        Radio radio = new Radio(55);
        radio.setCurrentStation(56);


        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNext8() {
        Radio radio = new Radio(55);
        radio.setCurrentStation(55);

        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext2() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void testPrevBoundary() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 4;
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
    public void IncreaseSoundBoundary() {
        Radio radio = new Radio();
        radio.setCurrentSound(100);

        radio.increaseSound();
        int actual = radio.getCurrentSound();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(5);

        radio.increaseSound();
        int actual = radio.getCurrentSound();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseSoundBoundary() {
        Radio radio = new Radio();
        radio.setCurrentSound(0);

        radio.decreaseSound();
        int actual = radio.getCurrentSound();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(4);

        radio.decreaseSound();
        int actual = radio.getCurrentSound();
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundMore() {
        Radio radio = new Radio();
        radio.setCurrentSound(101);

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
