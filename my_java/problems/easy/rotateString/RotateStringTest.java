package problems.easy.rotateString;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * @author koontz
 */
public class RotateStringTest {

    @Test
    public void happyPath() {
        RotateString rotateString = new RotateString();
        String s = "abcdefg";

        //immutable
        assertEquals("abcdefg", rotateString.rotateStringImmutable(s, 0));
        assertEquals("gabcdef", rotateString.rotateStringImmutable(s, 1));
        assertEquals("fgabcde", rotateString.rotateStringImmutable(s, 2));
        assertEquals("efgabcd", rotateString.rotateStringImmutable(s, 3));

        char[] c = "abcdefg".toCharArray();
        rotateString.rotateString(c, 0);
        assertArrayEquals("abcdefg".toCharArray(), c);
        c = "abcdefg".toCharArray();
        rotateString.rotateString(c, 1);
        assertArrayEquals("gabcdef".toCharArray(), c);
        c = "abcdefg".toCharArray();
        rotateString.rotateString(c, 2);
        assertArrayEquals("fgabcde".toCharArray(), c);
        c = "abcdefg".toCharArray();
        rotateString.rotateString(c, 3);
        assertArrayEquals("efgabcd".toCharArray(), c);
    }

}
