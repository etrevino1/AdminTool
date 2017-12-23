package jms.test.action;

import javax.jms.JMSException;
import javax.naming.NamingException;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import jms.test.Message;
import jms.test.Messages;
import jms.test.QueueSend;

@Namespace("/jms")
public class JMSTestAction extends ActionSupport {

	private Messages messages= null;
	private QueueSend send = null;

	@Autowired
	public void setSend(QueueSend send) {
		this.send = send;
	}

	@Action(
			value="WriteQueueWLS" ,
			results={
					@Result(name="success", location="../../../jsp/logs/viewLogs.jsp")
			}
			)
	public String execute(){
		try{
//			QueueSend send = new QueueSend();
//			send.send(new Message().getNewCMMessage("22747558", "384C90298A22", "Unity_10_E"));
			send.initializeConnParams(); // invokes initialize method to all necessary connections
			send.send(new Message().getNewCMMessage("22747558", "384C90298A22", "Unity_10_E")); // invokes send method with actual message
			send.closeConnParams(); // invokes to close all connections
			
			
		}catch(JMSException jmse){
			jmse.printStackTrace();
		}catch(NamingException ne){
			ne.printStackTrace();
		}

		return null;
	}

	@Action(
			value="WriteQueueMQ" ,
			results={
					@Result(name="success", location="../../../jsp/logs/viewLogs.jsp")
			}
			)
	public String writeQueueMQ(){
		messages = new Messages();
		try{
			messages.putMessage1(new Message().getNewCMMessage("22747558", "384C90298A22", "Unity_10_E"));
		}catch(JMSException jmse){
			jmse.printStackTrace();
		}

		return null;
	}
	
	@Action(
			value="ReadQueue" ,
			results={
					@Result(name="success", location="../../../jsp/logs/viewLogs.jsp")
			}
			)
	public String getMessages(){
		messages = new Messages();

//		try{
			System.err.println(messages.getMessage1());
//		}catch(JMSException jmse){
//			jmse.printStackTrace();
//		}
		return null;
	}



	
}
