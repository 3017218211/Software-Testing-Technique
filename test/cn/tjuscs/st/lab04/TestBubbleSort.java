package cn.tjuscs.st.lab04;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBubbleSort {
	private BubbleSort bs;
	
	@Before
	public void setUp() throws Exception {
		bs = new BubbleSort();
	}
	
	@After
	public void tearDown() throws Exception {
		bs = null;
	}
	
	@Test
	public void testBubbleSort1() {
		assertArrayEquals(new int[]{-2, -1, 0, 1, 2, 3, 3}, bs.BubbleSort(new int[]{-1,-2,3,1,0,2,3}));
	}
	
	@Test
	public void testBubbleSort2() {
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, bs.BubbleSort(new int[]{5, 4, 3, 2, 1}));
	}

}
