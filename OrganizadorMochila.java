import java.util.Arrays;

public class OrganizadorMochila {

  public static int max(int a, int b) {
    return (a > b)? a : b;
  }

  public static int organizarMochila(int capacidade, int pesoItens[], int valItens[], int n) {
    if (n == 0 || Arrays.stream(pesoItens).sum() == 0 )
      return 0;
    if (pesoItens[n-1] > capacidade)
      return organizarMochila(capacidade, pesoItens, valItens, n - 1);
    else 
      return max(valItens[n-1] + organizarMochila(capacidade - pesoItens[n-1], pesoItens, valItens, n-1), organizarMochila(capacidade, pesoItens, valItens, n-1));
  }

  public static void main(String args[]) {
    int valItens[] = new int[]{60, 100, 120};
    int pesoItens[] = new int[]{10, 20, 30};
    int capacidade = 50;
    int n = valItens.length;
    System.out.println("O valor máximo alcançado com a menor quantidade de itens, delimitado pelo valor máximo de capacidade da mochila foi de R$" + organizarMochila(capacidade, pesoItens, valItens, n));
  }
}