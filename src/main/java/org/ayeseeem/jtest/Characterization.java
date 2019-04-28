package org.ayeseeem.jtest;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;

/**
 * Marks unit tests (whole test classes, or individual test methods) as
 * characterization tests. That is, tests that <em>characterize</em> (capture,
 * or describe, or document) the behaviour of the code, but without necessarily
 * <em>specifying</em> the behaviour. For example,
 *
 * <code><pre>
 * &#64;Test
 * &#64;Characterization
 * public void testDefaultResponseIsNull() {
 *     //...
 * }
 * </pre></code>
 *
 * is a test that <em>describes</em> the current behaviour, but is <em>not</em>
 * a specification or requirement.
 * <p>
 * The main reason we need this annotation is that we do not name our normal
 * tests with "should": it is usually implied. So the example above -
 * {@code testDefaultResponseIsNull} would normally be ready as "default
 * response should be null". By marking it with this annotation ,we are
 * indicating that the default response <em>is</em> null, but without saying
 * that it <em>should</em> be.
 */
@Documented
@Target({ TYPE, METHOD })
public @interface Characterization {
    // marker interface - no extra content
}
