package pl.michalm.beans.producers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import pl.michalm.beans.producers.Producer.ProducerType;

@Component
@Producer(type = ProducerType.SIMPLE)
@Primary
public class SimpleMessageProducer implements MessageProducer {
	@Override
	public String getMessage() {
		return "Simple Message: " + System.currentTimeMillis();
	}
}