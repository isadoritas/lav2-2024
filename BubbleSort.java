public class BubbleSort {

  public int[] ordenarBubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++)
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
    return arr;
  }

  public String arrayParaString(int arr[]) {
    StringBuilder sb = new StringBuilder();
    int n = arr.length;
    for (int i=0; i<n; ++i)
        sb.append(arr[i] + " ");
    return sb.toString();
  }
}
