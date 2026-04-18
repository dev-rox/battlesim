public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro1 = new Guerreiro("Fulano", 100, 20, 10);
        Guerreiro guerreiro2 = new Guerreiro("Ciclano", 90, 18, 8);

        guerreiro1.exibirStatus();
        System.out.println();

        guerreiro1.atacar(guerreiro2);
        guerreiro2.usarHabilidadeEspecial(guerreiro1);

        System.out.println();
        guerreiro1.exibirStatus();
        System.out.println();
        guerreiro2.exibirStatus();
    }
}