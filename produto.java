class Produto {
  private String nome; 
  private int quantEstoque;
  private double valor;

  public Produto {
    this.nome = nome;
    this.quantEstoque = quantEstoque;
    this.va = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public int getQuantEstoque() {
    return this.quantEstoque;
  }

  public double getValor() {
    return this.valor;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setQuantEstoque(int quantEstoque) {
    this.quantEstoque = quantEstoque;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public void adicionaEstoque(int adicao) {
    this.quantEstoque = this.quantEstoque + adicao;
  }

  public void baixaEstoque(int sub) {
    if(this.quantEstoque >= sub)
      this.quantEstoque = this.quantEstoque - sub;
    else
      System.out.println("Tem não, ser de Luz!");
  }

  public void imprimeInventario() {
    System.out.println("--== INVENTÁRIO ==--");
    System.out.println("Nome: " + this.getNome());
    System.out.println("Quant.: " + this.getQuantEstoque());
    System.out.println("Valor: R$" + this.getValor());
  }
  
}
