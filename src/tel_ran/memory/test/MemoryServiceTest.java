package tel_ran.memory.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tel_ran.memory.MemoryService;

public class MemoryServiceTest {
private static final int N_RUNS = 10;
long []array;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetMaxLongs() {
		for(int i = 0; i < N_RUNS; i++){
		int maxLongs = MemoryService.getMaxLongs();
		array = new long[maxLongs];
		array = null;
		boolean fl_exception = false;
		try {
			array = new long[maxLongs + 1];
		} catch (Throwable e) {
			fl_exception = true;
		}
		assertTrue(fl_exception);
		array = null;
		}
	}

}
