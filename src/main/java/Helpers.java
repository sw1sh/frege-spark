package java_helpers;

import scala.Function1;
import scala.runtime.AbstractFunction1;
import frege.runtime.Lambda;
import java.lang.Object;

public class Helpers {
  public static <A, B> Function1<A, B> func(final Lambda f) {
    return new AbstractFunction1<A, B>() {
      public B apply(A x) {
        return f.apply(x).result().forced();
      }
    };
  }
  public static <A> Object toObject(final A x) {
    return x;
  }
}
