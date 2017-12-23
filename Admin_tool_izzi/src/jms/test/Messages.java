package jms.test;

import java.util.Hashtable;

import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.log4j.Logger;


@Stateless
public class Messages {

	private Logger log = Logger.getLogger(this.getClass());

	public void sendMessage(String text) throws JMSException {
		Connection connection = null;
		Session session = null;

		try{
			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://10.25.11.191:61616");
			//			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://172.21.20.87:7001");

			connection = connectionFactory.createConnection();
			connection.start();

			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			Queue chatQueue = session.createQueue("customerQueue");

			MessageProducer producer = session.createProducer(chatQueue);
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			for(int i = 0; i < 1000; i++){
				TextMessage message = session.createTextMessage(text);
				producer.send(message);
			}


		}finally{
			if(session != null) session.close();
			if(connection != null) connection.close();
		}
	}

	public String receiveMessage() throws JMSException {
		
//		Hashtable<String, String> ht = new Hashtable();
//		ht.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
//		ht.put(Context.PROVIDER_URL, "t3://172.21.20.87:7001/");
//		Context cx = new InitialContext(ht);
//
//		ConnectionFactory cf = (ConnectionFactory)cx.lookup("java:comp/env/jms/ConnectionFactory");
//		Connection connection = cf.createConnection();
		Connection connection = null;
		Session session = null;
		MessageConsumer consumer = null;

		try{
			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://10.25.11.191:61616");
			//			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://172.21.20.87:7001");
			connection = connectionFactory.createConnection();
			connection.start();

			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			Queue chatQueue = session.createQueue("customerQueue");
			//			Queue chatQueue = session.createQueue("System.TVT1.ApplicationType.ServiceActivation.Application.1-0;7-2;ASAP.Comp.MessageQueue");

			consumer = session.createConsumer(chatQueue);

			TextMessage message = (TextMessage)consumer.receive(1000);
			log.error(message.getText());
			return message.getText();
		}finally{
			if(consumer != null) consumer.close();
			if(session != null) session.close();
			if(connection != null) connection.close();
		}

	}

	public String getMessage1(){
		String body = "";
		try{
			InitialContext init = new InitialContext();
			Queue destination = (Queue)init.lookup("java:comp/env/jms/myQueue");
			ConnectionFactory connectionFactory =(ConnectionFactory) init.lookup("java:comp/env/jms/ConnectionFactory");
			Connection connection = connectionFactory.createConnection();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			TextMessage message = session.createTextMessage();
//			message.setText("My text message was send and received");
			connection.start();

			message = null;

			MessageConsumer consumer = session.createConsumer(destination);
			message = (TextMessage) consumer.receive(1000);
			if( message!=null ) {
				body = message.getText();
			}


			consumer.close();
			session.close();
			connection.close();
		}catch(NamingException ne){
			ne.printStackTrace();
		}catch(JMSException jmse){
			jmse.printStackTrace();
		}
		System.out.println(body);
		return body;
	}

	public void putMessage1(String text) throws JMSException{
		try{
			InitialContext init = new InitialContext();
			Queue destination = (Queue)init.lookup("java:comp/env/jms/myQueue");
			ConnectionFactory connectionFactory =(ConnectionFactory) init.lookup("java:comp/env/jms/ConnectionFactory");
			Connection connection = connectionFactory.createConnection();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			TextMessage message = session.createTextMessage();
			message.setText(text);
			connection.start();

			MessageProducer producer = session.createProducer(destination);
			producer.setDeliveryMode(DeliveryMode.PERSISTENT);
			producer.send(message);
			producer.close();
			session.close();
			connection.close();
		}catch(NamingException ne){
			ne.printStackTrace();
		}
		//		catch(JMSException jmse){
		//			jmse.printStackTrace();
		//		}
	}

}
