package paper.main;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import paper.entity.Answer;
import paper.entity.Question;

public class StoreData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Question.class);
		cfg.addAnnotatedClass(Answer.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Answer an1 = new Answer();
		an1.setAnswername("Java is a programming language");
		an1.setPostedBy("Ravi Malik");

		Answer an2 = new Answer();
		an2.setAnswername("Java is a platform");
		an2.setPostedBy("Sudhir Kumar");

		Question q1 = new Question();
		q1.setQname("What is Java?");
		ArrayList<Answer> l1 = new ArrayList<Answer>();
		l1.add(an1);
		l1.add(an2);
		q1.setAnswers(l1);

		Answer ans3 = new Answer();
		ans3.setAnswername("Servlet is an Interface");
		ans3.setPostedBy("Jai Kumar");

		Answer ans4 = new Answer();
		ans4.setAnswername("Servlet is an API");
		ans4.setPostedBy("Arun");

		Question q2 = new Question();
		q2.setQname("What is Servlet?");
		ArrayList<Answer> l2 = new ArrayList<Answer>();
		l2.add(ans3);
		l2.add(ans4);
		q2.setAnswers(l2);

		ss.persist(q1);
		ss.persist(q2);

		tr.commit();
		ss.close();
		System.out.println("success");

	}
}
