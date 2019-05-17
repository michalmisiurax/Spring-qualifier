package pl.michalm.beans.decorators;

import org.springframework.stereotype.Component;

import pl.michalm.beans.decorators.Decorator.DecoratorType;

@Component
@Decorator(type = DecoratorType.SMALL)
public class LowerCaseMessageDecorator implements MessageDecorator{

	@Override
	public String decorate(String msg) {
		return msg.toLowerCase();
	}

}
