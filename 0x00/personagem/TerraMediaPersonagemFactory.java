public class TerraMediaPersonagemFactory extends PersonagemFactory {

    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {
        Personagem personagem;
        if (tipo.equals(TipoPersonagem.MAGO)) {
            personagem = new Mago(nome, 10, 2, 5, 3, 4);
        } else if (tipo.equals(TipoPersonagem.GUERREIRO)) {
            personagem = new Guerreiro(nome, 1, 8, 5, 10, 6);
        } else {
            personagem = new Ladrao(nome, 2, 6, 8, 5, 10);
        }
        return personagem;
    }
}
