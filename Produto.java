class Produto extends Item {
    private int quantidadeRestante;

    public Produto(String nome, String descricao, String foto, double preco, int quantidadeRestante) {
        super(nome, descricao, foto, preco);
        this.quantidadeRestante = quantidadeRestante;
    }

    public int getQuantidadeRestante() {
        return quantidadeRestante;
    }

    public void reduzirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeRestante) {
            quantidadeRestante -= quantidade;
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade restante: " + quantidadeRestante);
    }
}