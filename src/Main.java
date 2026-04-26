public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Arthur", 120, 20, 8);
        Mago mago = new Mago("Merlin", 80, 18, 5, 30);

        System.out.println("=== STATUS INICIAL ===");
        guerreiro.exibirStatus();
        System.out.println();
        mago.exibirStatus();

        System.out.println("\n=== BATALHA ===");
        guerreiro.atacar(mago);
        mago.usarHabilidadeEspecial(guerreiro);
        guerreiro.usarHabilidadeEspecial(mago);

        System.out.println("\n=== STATUS FINAL ===");
        guerreiro.exibirStatus();
        System.out.println();
        mago.exibirStatus();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}