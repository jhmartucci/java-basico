package arquivos;

public class Cliente implements  ValorTotal{
    private String nome;
    private String produto;
    private int quantidade;
    private double valor;

    public Cliente(String nome, String produto, int quantidade, double valor){
        this.nome = nome;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    public String getNome(){
        return  this.nome;
    }
    public  String getProduto(){
        return this.produto;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public double getValor(){
        return this.valor;
    }

    @Override
    public double ValorTotal(double valorTotal) {
        valorTotal = this.quantidade * this.valor;
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", produto='" + produto + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }
}
