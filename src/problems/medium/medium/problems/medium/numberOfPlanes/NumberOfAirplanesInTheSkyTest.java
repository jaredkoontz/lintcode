package problems.medium.medium.problems.medium.numberOfPlanes;

import org.junit.Test;
import problems.medium.medium.shared.Interval;

import java.util.Arrays;
import java.util.List;


public class NumberOfAirplanesInTheSkyTest {
	@Test
	public void happyPath() {
		NumberOfAirplanesInTheSky n = new NumberOfAirplanesInTheSky();
		Interval[] inputs = {new Interval(1, 10), new Interval(2, 3), new Interval(5, 8), new Interval(4, 7)};
		List<Interval> list = Arrays.asList(inputs);
		System.out.println(n.countOfAirplanes(list));
	}

}
