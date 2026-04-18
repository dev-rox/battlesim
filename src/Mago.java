public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int hp, int forca, int defesa, int mana) {
        super(nome, hp, forca, defesa);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void recuperarMana(int valor) {
        this.mana += valor;
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        int custoMana = 10;

        if (mana < custoMana) {
            System.out.println(getNome() + " não tem mana suficiente para usar Bola de Fogo!");
            return;
        }

        mana -= custoMana;

        int danoMagico = getForca() + 15 - alvo.getDefesa();

        if (danoMagico < 0) {
            danoMagico = 0;
        }

        alvo.receberDano(danoMagico);

        System.out.println(getNome() + " usou Bola de Fogo em " + alvo.getNome()
                + " e causou " + danoMagico + " de dano!");
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Mana: " + mana);
    }
}