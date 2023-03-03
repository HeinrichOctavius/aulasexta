import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    // Cadastro (conjunto)
    Produto produtos[] = new Produto[3];

    for(int i=0; i<3; i++) {
      System.out.println("Digite os dados do Produto:");
      String nome = entrada.next();
      int quantEstoque = entrada.nextInt();
      double valor = entrada.nextDouble();
      produtos[i] = new Produto();
      produtos[i].setNome(nome);
      produtos[i].setQuantEstoque(quantEstoque);
      produtos[i].setValor(valor);
    }
  }
}
