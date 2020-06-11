package test.ie.just.another.java.repo;

import ie.just.another.java.repo.impl.ArraysAndStrings;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysAndStringsTest {

    @Test
    public void nullInput() {
        assertEquals(null, ArraysAndStrings.findFirstNonRepeatedCharacter(null));
    }

    @Test
    public void emptyInput() {
        assertEquals(null, ArraysAndStrings.findFirstNonRepeatedCharacter(""));
    }

    @Test
    public void validInput() {
        assertEquals(new Character('r'), ArraysAndStrings.findFirstNonRepeatedCharacter("teeter"));
        assertEquals(new Character('s'), ArraysAndStrings.findFirstNonRepeatedCharacter("tester"));
        assertEquals(new Character('o'), ArraysAndStrings.findFirstNonRepeatedCharacter("total"));
        assertEquals(null, ArraysAndStrings.findFirstNonRepeatedCharacter("toto"));
    }

}
