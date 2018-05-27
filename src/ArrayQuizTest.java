import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayQuizTest {
     //NullPointer error
    @org.junit.jupiter.api.Test
    @DisplayName("Null Error")    //cname will appear as this
    void process() {
        String name = null;
        assertThrows(NullPointerException.class,()->{
            int size = name.length();
            assertEquals(4,size);
        });
    }

    //parametrized test assists with dynamic inputs
    @ParameterizedTest
    @ValueSource(strings = { "raceCar", "radar", "able was I ere I saw elba" })
    void testParams(String string){
        assertTrue(string.length()>0);
    }

    @ParameterizedTest
    @CsvSource(value = {"abc,ABC","'',''"})      //empty string treated as a Null by CSV ('') <- solution
    @DisplayName("Params Test")
    void testUpperCase(String word, String capitalized){
        assertEquals(capitalized,word.toUpperCase());
    }

}