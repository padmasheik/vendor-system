package com.career.soa.activemq.vendorsystem.jms.listener;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConsumerListenerTest {

	private ConsumerListener listener = new ConsumerListener();
	private String json = "{vendorName:\"Microsoft\",firstName:\"Bob\",lastName:\"Smithtest6\",address:\"123 Main test6\",city:\"Tulsatest6\",state:\"OKtest6\",zip:\"71345test6\",email:\"Bob@microsoft.test6\",phoneNumber:\"test-123-test666\"}";
	private TextMessage message;

	@Before
	public void setUp() throws Exception {
		message = createMock(TextMessage.class);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOnMessage() throws JMSException {
		expect(message.getText()).andReturn(json);
		replay(message);
		System.out.println(message);
		listener.onMessage(message);
		verify(message);
	}

}
