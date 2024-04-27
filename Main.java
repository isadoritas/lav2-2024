public class Main {
  public static void main(String[] args) {
    OrganizadorMochila organizador = new OrganizadorMochila();
    BubbleSort bs = new BubbleSort();

    
    int valItens[] = new int[]{60, 100, 120};
    int pesoItens[] = new int[]{10, 20, 30};
    int capacidade = 50;
    int n = valItens.length;

    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    arr = bs.ordenarBubbleSort(arr);
    String resultado = bs.arrayParaString(arr);
    System.out.println("Array ordenada é: " + resultado);

    System.out.println("O valor máximo alcançado com a menor quantidade de itens, delimitado pelo valor máximo de capacidade da mochila foi de R$" + organizador.organizarMochila(capacidade, pesoItens, valItens, n));
    System.out.println("A array antes de ordenar era " + bs.arrayParaString(arr));
    bs.ordenarBubbleSort(arr);
    System.out.println("A array após ordenar é " + bs.arrayParaString(arr));

  }
}
