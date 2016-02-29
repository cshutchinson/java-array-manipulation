package main;

public class ArrayUtils {

  public static int[] reverse(int[] array) {
    int[] tempArray = new int[array.length];
    for (int i=0;i<array.length; i++){
      tempArray[i]=array[array.length-1-i];
    }
    return tempArray;
  };

  public static int[] push(int[] array, int num) {
    int[] tempArray = new int[array.length+1];
    for (int i=0; i<array.length; i++){
      tempArray[i]=array[i];
    }
    tempArray[array.length]= num;
    return tempArray;
  };

  public static void print(int[] array) {
    System.out.print('[');
    for(int i=0; i<array.length; i++){
      if (i == array.length -1) {
        System.out.print(array[i] + "]");
      } else {
        System.out.print(array[i] + ", ");
      }
    }
    System.out.print('\n');
  };

}
