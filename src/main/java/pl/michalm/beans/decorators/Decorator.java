package pl.michalm.beans.decorators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Target({ElementType.FIELD,
    ElementType.METHOD,
    ElementType.TYPE,
    ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Decorator {

	DecoratorType type();
	
	public enum DecoratorType {
		SMALL, LARGE;
	}
}