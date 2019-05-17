package pl.michalm.beans.decorators;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import pl.michalm.beans.decorators.Decorator.DecoratorType;

@Component
@Decorator(type = DecoratorType.LARGE)
@Primary
public class UpperCaseMessageDecorator implements MessageDecorator {
	@Override
	public String decorate(String msg) {
		return msg.toUpperCase();
	}
}