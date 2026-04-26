public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int hp, int forca, int defesa) {
        super(nome, hp, forca, defesa);
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        int danoEspecial = getForca() * 2 - alvo.getDefesa();

        if (danoEspecial < 0) {
            danoEspecial = 0;
        }

        alvo.receberDano(danoEspecial);

        System.out.println(getNome() + " usou Golpe Pesado em " + alvo.getNome()
                + " e causou " + danoEspecial + " de dano!");
    }
}