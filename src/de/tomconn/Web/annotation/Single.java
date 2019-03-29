package de.tomconn.Web.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Methods annotated with this annotation are marked to have no bulk method, meaning that bulk-processing behavior has to be implemented by users.</p>
 * <br></br>
 * <p>This is a source-marker annotation and will not be carried over into runtime.</p>
 * <p>It is expected to be used by IDEs to index the proper building process of APIs.</p>
 *
 * @since 0.0.1
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface Single {

}
