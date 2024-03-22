package vn.edu.iuh.fit.week5;

import jakarta.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;
import vn.edu.iuh.fit.week5.entity.Student;

import static vn.edu.iuh.fit.week5.Queue.QueueConstants.QUEUE_NAME;

public class Sender {
    public static void main(String[] args) throws JMSException {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();

        Connection connection = factory.createConnection();

        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        connection.start();

        Destination destination = session.createQueue(QUEUE_NAME);
        MessageProducer producer = session.createProducer(destination);

        System.out.println("Waiting....");

        for (int i = 0; i < 10; i++) {
            TextMessage message = session.createTextMessage("Mess" + i);
            producer.send(message);
        }
        Student st = new Student(1l,"TranThienDat");
        ObjectMessage objectMessage = session.createObjectMessage(st);
        producer.send(objectMessage);
        System.out.println("sending....");
    }
}
