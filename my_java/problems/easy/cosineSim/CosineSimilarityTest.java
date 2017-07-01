package problems.easy.cosineSim;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author koontz
 */
public class CosineSimilarityTest {

    @Test
    public void happyPath() {
        int[] A = {1, 2, 3}, B = {2, 3, 4};
        CosineSimilarity cosineSimilarity = new CosineSimilarity();
        assertEquals(cosineSimilarity.cosineSimilarity(A, B), 0.9926, 0.001);
        A = new int[]{0};
        B = new int[]{0};
        assertEquals(cosineSimilarity.cosineSimilarity(A, B), 2.0000, 0.001);
    }

}
