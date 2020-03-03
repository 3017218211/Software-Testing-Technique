package cn.tjuscs.st.lab01;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestPayMoney {
	private int input;
	private boolean expected;
	private PayMoney pm = null;
	
	public TestPayMoney(int input, boolean expected) {
		this.input = input;
		this.expected = expected;
	}
	
	@Before
	public void init() {
		pm = new PayMoney();
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][] {
			{50, true},
			{59, false},
			{92, true},
			{64, false},
			{0, true},
			{100, false}
		});
	}
	
	@Test
	public void testIsAffordable() {
		assertEquals(this.expected, pm.isAffordable(this.input));
	}

}
