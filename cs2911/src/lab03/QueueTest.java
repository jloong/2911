package lab03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public abstract class QueueTest {

	protected Queue queue;
	
	@Before
	public abstract void setUp() throws Exception;

	Object test1 = "123";
	Object test2 = "456";
	Object test3 = "789";
	
	@Test
	public void testAdd() {
		queue.add(test3);
		assertNotNull (queue);
	}

	@Test
	public void testGet() {
		queue.add(test1);
		assertEquals("Get last item (123)", test1, queue.get());
	}

	@Test
	public void testRemove() {
		queue.add(test1);
		assertEquals("Added object '123'", test1, queue.get());
		assertEquals ("Removing object '123'", test1, queue.remove ());
		assertTrue("Queue should be empty", queue.isEmpty());
	}

	@Test
	public void testSize() {
		queue.add(test1);
		queue.add(test2);
		queue.add(test3);
		assertEquals("3 Items added, size should be 3", 3, queue.size());
	}

	@Test
	public void testIsEmpty() {
		assertTrue("Queue should be empty", queue.isEmpty());
	}

	@Test
	public void testIsFull() {
		assertFalse("Queue is not full", queue.isFull());
	}
	
	@Test
	public void testCyclic() {
		
	}

}
