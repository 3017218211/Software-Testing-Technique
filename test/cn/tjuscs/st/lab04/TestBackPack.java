package cn.tjuscs.st.lab04;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestBackPack {
	
	@Test
	public void testBackPack1() {
		int m1 = 8;
        int n1 = 4;
        int w1[] = {2, 1, 3, 4};//, 1, 6, 4, 2};
        int p1[] = {4, 3, 6, 5};//, 2, 6, 5, 1};
        int c1[][] = new int[][] {
			{0,	0, 0, 0, 0, 0, 0, 0, 0},	
			{0, 0, 4, 4, 4, 4, 4, 4, 4},	
			{0,	3, 4, 7, 7, 7, 7, 7, 7},	
			{0,	3, 4, 7, 9, 10, 13, 13, 13},
			{0,	3, 4, 7, 9, 10, 13, 13, 14},
		};
		assertTrue(isEqual2Array(c1, BackPack.BackPack_Solution(m1, n1, w1, p1)));
	}
	
	@Test
	public void testBackPack2() {
		int m2 = 8;
        int n2 = 4;
        int w2[] = {1, 6, 4, 2};
        int p2[] = {2, 6, 5, 1};
        int c2[][] = new int[][] {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 2, 2, 2, 2, 2, 2, 2, 2},
            {0, 2, 2, 2, 2, 2, 6, 8, 8},
            {0, 2, 2, 2, 5, 7, 7, 8, 8},
            {0, 2, 2, 3, 5, 7, 7, 8, 8},
        };
		assertTrue(isEqual2Array(c2, BackPack.BackPack_Solution(m2, n2, w2, p2)));
	}
	
	public boolean isEqual2Array(int[][] arr1, int[][] arr2){
		if((arr1 == null) || (arr2 == null) || (arr1.length != arr2.length) || (arr1[0].length != arr2[0].length)) {
			return false;
		}
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				if(arr1[i][j] != arr2[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}

}
