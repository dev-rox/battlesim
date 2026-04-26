import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void guerreiroDeveAtacarMagoEReduzirHp() {
        Guerreiro guerreiro = new Guerreiro("Arthur", 120, 20, 8);
        Mago mago = new Mago("Merlin", 80, 18, 5, 30);

        guerreiro.atacar(mago);

        assertEquals(65, mago.getHp());
    }

    @Test
    void magoDeveUsarBolaDeFogoConsumindoManaECausandoDano() {
        Mago mago = new Mago("Merlin", 80, 18, 5, 30);
        Guerreiro guerreiro = new Guerreiro("Arthur", 120, 20, 8);

        mago.usarHabilidadeEspecial(guerreiro);

        assertEquals(95, guerreiro.getHp());
        assertEquals(20, mago.getMana());
    }

    @Test
    void guerreiroDeveUsarGolpePesadoECausarDanoEspecial() {
        Guerreiro guerreiro = new Guerreiro("Arthur", 120, 20, 8);
        Mago mago = new Mago("Merlin", 80, 18, 5, 30);

        guerreiro.usarHabilidadeEspecial(mago);

        assertEquals(45, mago.getHp());
    }
}
