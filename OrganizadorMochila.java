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

}