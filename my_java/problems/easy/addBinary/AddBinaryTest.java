package problems.easy.addBinary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author koontz
 */
public class AddBinaryTest {

    @Test
    public void happyPath() {
        String a = "11";
        String b = "1";
        AddBinary addBinary = new AddBinary();
        assertEquals(addBinary.addBinary(a, b), "100");
    }

}
