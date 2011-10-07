package fr.epsi.kata;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: Louis Marle
 */
public class FizzBuzzTest {
    private List<String> fizz;

    @Test
    public void donneLesCentsPremiers() {
        creeMonFizzBuzz();
        assertNotNull(fizz);
        assertEquals(fizz.size(), 101);
    }

    @Test
    public void donneLesChiffresNormaux() {
        creeMonFizzBuzz();
        for(int index = 1; index < 101; index++) {
            if(index % 15 != 0 && index % 3 != 0 && index % 5 != 0) {
                assertEquals("" + index, fizz.get(index));
            }
        }
    }

    @Test
    public void donneFizz() {
        creeMonFizzBuzz();
        assertEquals("Fizz", fizz.get(3));
    }

    @Test
    public void donneBuzz() {
        creeMonFizzBuzz();
        assertEquals("Buzz", fizz.get(5));
    }

    @Test
    public void donneFizzBuzz() {
        creeMonFizzBuzz();
        assertEquals("FizzBuzz", fizz.get(15));
    }

    private void creeMonFizzBuzz() {
        final FizzBuzz fizzbuzzer = new FizzBuzz();
        fizz = fizzbuzzer.genererLesFizzBuzz();
    }

}
