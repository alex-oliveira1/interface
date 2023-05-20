class Cachorro extends Animal implements Domestico, Brincalhao {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }

    @Override
    public void serAmigavel() {
        System.out.println("O cachorro é amigável.");
    }

    @Override
    public void serTreinado() {
        System.out.println("O cachorro pode ser treinado.");
    }

    @Override
    public void brincar() {
        System.out.println("O cachorro está brincando.");
    }
}