// Classe base para produtos e serviços
abstract class Item {
    protected String nome;
    protected String descricao;
    protected String foto;
    protected double preco;

    public Item(String nome, String descricao, String foto, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.foto = foto;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFoto() {
        return foto;
    }
    
    public double getpreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Foto: " + foto);
        System.out.println("Preço: R$ " + preco);
       
    }
}
