package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestForceFully {
	@Test
	public void skip()
	{
		throw new SkipException("Element is not present so Skipp test");

}
}

