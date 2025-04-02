public class Main {
    public static void main(String[] args) {
        Produto[] produtos = {
            new Produto("Placa de Vídeo RTX 3060", "Placa de vídeo para alto desempenho", "rtx3060.jpg",1900.00, 5),
            new Produto("Processador Intel i7", "Processador de 12ª geração", "i7.jpg",1200.00, 3),
            new Produto("SSD NVMe 1TB", "Armazenamento ultrarrápido", "ssd1tb.jpg",550.00, 8),
            new Produto("Memória RAM 16GB", "Memória RAM DDR4", "ram16gb.jpg",350.00, 10),
            new Produto("Gabinete Gamer", "Gabinete com LED RGB", "gabinete.jpg",200.00, 4),
            new Produto("Teclado Mecânico", "Teclado RGB para jogos", "teclado.jpg",320.00, 6),
            new Produto("Mouse Gamer", "Mouse com sensor óptico de alta precisão", "mouse.jpg",380.00, 7)
        };

        Servico[] servicos = {
            new Servico("Formatação de Computador", "Reinstalação do sistema operacional", "formatacao.jpg",80.00),
            new Servico("Limpeza Interna de PC", "Remoção de poeira e troca de pasta térmica", "limpeza.jpg",150.00),
            new Servico("Troca de Tela de Notebook", "Substituição de tela quebrada", "tela.jpg",250.00),
            new Servico("Upgrade de Hardware", "Instalação de SSD, RAM e outros componentes", "upgrade.jpg",50.00),
            new Servico("Reparo de Placa-Mãe", "Diagnóstico e reparo de placas-mãe", "placamae.jpg",500.00),
            new Servico("Substituição de Bateria de Notebook", "Troca de bateria para melhor autonomia", "bateria.jpg",50.00),
            new Servico("Configuração de Rede", "Instalação e otimização de redes Wi-Fi", "rede.jpg",80.00)
        };

        System.out.println("--- Produtos ---");
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
            System.out.println();
        }

        System.out.println("--- Serviços ---");
        for (Servico servico : servicos) {
            servico.exibirDetalhes();
            System.out.println();
        }
    }
}