package de.tomconn.web.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Methods annotated with this annotation are meant to have a respective single-return pendant.</p>
 * <p>named pendant is expected to take a single batch of arguments and return a single value.</p>
 * <br>
 * <p>This is a source-marker annotation and will not be carried over into runtime.</p>
 * <p>It is expected to be used by IDEs to index the proper building process of APIs.</p>
 *
 * @since 0.0.2
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface HasSingle {

}
