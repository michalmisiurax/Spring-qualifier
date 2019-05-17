package pl.michalm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.michalm.beans.printers.MessagePrinter;



@Configuration
@ComponentScan
public class SpringDiApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDiApplication.class);
		MessagePrinter printer = ctx.getBean(MessagePrinter.class);
		printer.print();
		ctx.close();
	}
}