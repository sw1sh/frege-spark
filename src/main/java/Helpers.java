package java_helpers;

import frege.runtime.*;
import org.apache.spark.api.java.function.Function;

public class Helpers {
  public static Function<String, Boolean> equalsOne = new Function<String, Boolean>() {
    public Boolean call(String s) {
      return s.equals("1");
    }
  };
  public static <A, B> Function<A, B> lambdaToFunction(final Lambda f) {
    return new Function<A, B>() {
      public B call(A x) {
        return f.apply(x).result().forced();
      }
    };
  }
}
