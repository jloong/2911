package lab03;

import org.junit.Before;

public class LinkedListFifoQueueTest extends QueueTest {
 
	@Before
	@Override
	public void setUp() throws Exception {
		queue = new LinkedListFifoQueue();
	}
}
