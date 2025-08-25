public class Numbers {
  public static void main(String[] args) {
    int[][] arr = {
      {1, 12, 123},
      {321, 1, 12},
      {12, 321, 1}
    };

    for (int[] line : arr) {
      for (int num : line) {
        System.out.println(num + "\t");
      }
    }
  }
}
