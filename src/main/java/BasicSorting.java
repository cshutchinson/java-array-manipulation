package main;

public class BasicSorting {

  public static int[] bubble(int[] array) {
    int n = array.length;
    int temp = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (array[j - 1] > array[j]) {
            temp = array[j - 1];
            array[j - 1] = array[j];
            array[j] = temp;
        }
      }
    }
    return array;
  }

  public static int[] selection(int[] array) {
    return array;
  }

  public static int[] insertion(int[] array) {
    return array;
  }

}
