public abstract class Personagem {
    private String nome;
    private int hp;
    private int forca;
    private int defesa;

    public Personagem(String nome, int hp, int forca, int defesa) {
        this.nome = nome;
        this.hp = hp;
        this.forca = forca;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public int getForca() {
        return forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public boolean estaVivo() {
        return hp > 0;
    }

    public void atacar(Personagem alvo) {
        int dano = this.forca - alvo.getDefesa();

        if (dano < 0) {
            dano = 0;
        }

        alvo.receberDano(dano);

        System.out.println(this.nome + " atacou " + alvo.getNome() + " e causou " + dano + " de dano.");
    }

    public void receberDano(int dano) {
        this.hp -= dano;

        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("HP: " + hp);
        System.out.println("Força: " + forca);
        System.out.println("Defesa: " + defesa);
    }

    public abstract void usarHabilidadeEspecial(Personagem alvo);
}