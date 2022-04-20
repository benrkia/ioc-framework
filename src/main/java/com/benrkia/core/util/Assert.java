package com.benrkia.core.util;

public class Assert {
  public static void notEmpty (Object[] objects, String msg) {
    if (isEmpty(objects))
      throw new IllegalStateException(msg);
  }

  private static boolean isEmpty (Object[] objects) {
    return objects == null || objects.length == 0;
  }
}
