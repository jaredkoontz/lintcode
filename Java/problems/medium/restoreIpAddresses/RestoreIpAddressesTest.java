package problems.medium.restoreIpAddresses;

import org.junit.Test;

public class RestoreIpAddressesTest {

	@Test
	public void happyPath(){
		String s = "25525511135";
		RestoreIpAddresses r = new RestoreIpAddresses();
		r.restoreIpAddresses(s);
	}

}
