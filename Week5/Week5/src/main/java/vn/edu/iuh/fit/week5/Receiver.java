package vn.edu.iuh.fit.week5;

import jakarta.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;
import vn.edu.iuh.fit.week5.entity.Student;

import java.util.List;

import static vn.edu.iuh.fit.week5.Queue.QueueConstants.QUEUE_NAME;

public class Receiver {
    public static void main(String[] args) throws Exception {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        factory.setTrustedPackages(List.of("vn.edu.iuh.fit.week5"));

        Connection connection = factory.createConnection();

        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        connection.start();

        Destination destination = session.createQueue(QUEUE_NAME);
        MessageConsumer consumer = session.createConsumer(destination);

        factory.setTrustedPackages(List.of("vn.edu.iuh.fit.week5.entity"));
        System.out.println("Waiting....");

        consumer.setMessageListener(message -> {
            try {
                if (message instanceof TextMessage) {
                    String mess = ((TextMessage) message).getText();
                    System.out.println("*** "+mess);
                } else if (message instanceof ObjectMessage) {
                    Student student = message.getBody(Student.class);
                    System.out.println("*** "+ student);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
