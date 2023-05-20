public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Bolt", 3, "Golden Retriever");
        cachorro.fazerSom(); // Saída: Au au!
        cachorro.serAmigavel(); // Saída: O cachorro é amigável.
        cachorro.serTreinado(); // Saída: O cachorro pode ser treinado.
        cachorro.brincar(); // Saída: O cachorro está brincando.
    }
}
