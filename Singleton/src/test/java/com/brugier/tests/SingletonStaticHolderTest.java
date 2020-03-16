package com.brugier.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import com.brugier.SingletonStaticHolder;

public class SingletonStaticHolderTest {

	SingletonStaticHolder firstInstanceForTestBreakWithThreads, secondInstanceForTestBreakWithThreads;

	@Test
	public void checkObjectEqualsTest() {
		SingletonStaticHolder firstInstance = SingletonStaticHolder.getInstance();

		SingletonStaticHolder secondInstance = SingletonStaticHolder.getInstance();

		assertEquals(firstInstance, secondInstance);
	}

	@Test
	public void checkThreadSingletonTest() throws Exception {
		Runnable task1 = () -> {
			firstInstanceForTestBreakWithThreads = SingletonStaticHolder.getInstance();
		};
		Runnable task2 = () -> {
			secondInstanceForTestBreakWithThreads = SingletonStaticHolder.getInstance();
		};

		int testSuccess = 0;
		int testFail = 0;
		int repeatLimit = 1000;
		for (int i = 0; i < repeatLimit; i++) {
			ExecutorService service = Executors.newFixedThreadPool(2);
			service.submit(task1);
			service.submit(task2);
			service.shutdown();
			service.awaitTermination(1, TimeUnit.SECONDS);

			if (firstInstanceForTestBreakWithThreads != null && secondInstanceForTestBreakWithThreads != null
					&& firstInstanceForTestBreakWithThreads.equals(secondInstanceForTestBreakWithThreads)) {
				testSuccess++;
			} else {
				testFail++;
			}
		}

		assertEquals(repeatLimit, testSuccess);
		System.out.println(String.format("testSuccess: %d, testFail: %d", testSuccess, testFail));
	}
}
