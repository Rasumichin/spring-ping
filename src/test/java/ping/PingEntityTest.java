package ping;

import static org.junit.Assert.*;

import org.junit.Test;

public class PingEntityTest {
	
	@Test
	public void testGetUuid() {
		PingEntity sut = new PingEntity("someReply");
		
		String object = sut.getUuid();
		
		assertNotNull("'uuid' must not be 'null'!", object);
	}

	@Test
	public void testGetReply() {
		PingEntity sut = new PingEntity("Duke");
		String expected = "Hi, Duke.";
		
		String actual = sut.getReply();
		
		assertEquals("'reply' is not correct!", expected, actual);
	}
}
