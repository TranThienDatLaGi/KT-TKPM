package vn.edu.iuh.fit.week4;

import jdepend.swingui.JDepend;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.PrintWriter;
import java.io.IOException;
@Slf4j
@SpringBootApplication
public class Week4Application {

	public static void main(String[] args) throws Exception {
		JDepend depend= new JDepend();
		String path="D:\\Hoc_tap\\Ktruc&TkePhanMem\\ThucHanh\\Week4\\Library-Assistant";
		depend.addDirectory(path);
		depend.analyze();
		System.out.println("DONE");

		log.info("*** commandLineRunner_");
		jdepend.xmlui.JDepend depend1= new jdepend.xmlui.JDepend(new PrintWriter("reports/report.xml"));
		depend1.addDirectory(path);
		depend1.analyze();
		System.out.println("Success");
	}


}
