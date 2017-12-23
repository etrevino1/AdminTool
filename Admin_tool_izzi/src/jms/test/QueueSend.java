package jms.test;

import java.util.Hashtable;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class QueueSend {
    // JNDI name for Weblogic, ConnectionFactory & Queue
    private static final String WEBLOGIC_JMS_URL = "t3://172.21.20.87:7001"; // Weblogic JMS URL
    public final static String WEBLOGIC_JNDI_FACTORY_NAME = "weblogic.jndi.WLInitialContextFactory"; // Weblogic JNDI
    private static final String CONNECTION_FACTORY_JNDI_NAME = "jms/ConnectionFactory"; // Weblogic ConnectionFactory JNDI
    private static final String QUEUE_JNDI_NAME = "jms/test/TestQueue"; // Weblogic Queue JNDI
 
    // variables 
    private Hashtable<String, String> wlsEnvParamHashTbl = null;
    private static InitialContext initialContext = null;
    private static QueueConnectionFactory queueConnectionFactory = null;
    private static QueueConnection queueConnection = null;
    private static QueueSession queueSession = null;
    private static Queue queue = null;
    private static QueueSender queueSender = null;
    private static TextMessage textMessage = null;

    
    /**
     * default constructor
     */
    public QueueSend() {
 
        wlsEnvParamHashTbl = new Hashtable<String, String>();
        wlsEnvParamHashTbl.put(Context.PROVIDER_URL, WEBLOGIC_JMS_URL); // set Weblogic JMS URL
        wlsEnvParamHashTbl.put(Context.INITIAL_CONTEXT_FACTORY, WEBLOGIC_JNDI_FACTORY_NAME); // set Weblogic JNDI
        wlsEnvParamHashTbl.put(Context.SECURITY_PRINCIPAL, "weblogic"); // set Weblogic UserName
        wlsEnvParamHashTbl.put(Context.SECURITY_CREDENTIALS, "weblogic1"); // set Weblogic PassWord
    }
 
    /**
     * This method initializes all necessary connection parameters for establishing JMS Queue communication
     * 
     * @throws NamingException
     * @throws JMSException
     */
    public void initializeConnParams() throws NamingException, JMSException {
        initialContext = new InitialContext(wlsEnvParamHashTbl); // set InitialContext
        System.out.println("1");
        queueConnectionFactory = (QueueConnectionFactory) initialContext.lookup(CONNECTION_FACTORY_JNDI_NAME); // lookup using initial context
        System.out.println("2");
        queueConnection = queueConnectionFactory.createQueueConnection(); // create ConnectionFactory
        queueSession = queueConnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE); // create QueueSession
        queue = (Queue) initialContext.lookup(QUEUE_JNDI_NAME); // lookup Queue JNDI using initial context created above
        queueSender = queueSession.createSender(queue); // create Sender using Queue JNDI as arguments
        textMessage = queueSession.createTextMessage(); // create TextMessage for Queue
        queueConnection.start(); // start Queue connection
    }
 
    /**
     * This is the actual method to SEND messages to JMS Queues
     * 
     * @param message
     * @throws JMSException
     */
    public void send(String message) throws JMSException {
 
        textMessage.setText(message);
        queueSender.send(textMessage);
    }
 
    /**
     * This method closes all connections
     * 
     * @throws JMSException
     */
    public void closeConnParams() throws JMSException {
 
        queueSender.close();
        queueSession.close();
        queueConnection.close();
    }
	
}
