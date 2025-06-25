package buildshare;

import java.util.ArrayList;
import java.util.List;

public class BuildKH extends Build{
    private String personagem;
    private List<String> habilidades = new ArrayList<>();


    public BuildKH(Usuario criador, String personagem, Jogo jogoKH) {
        this.criador = criador;
        this.personagem = personagem;
        this.jogo = jogoKH; // pode ser KH1, KH2 ou KH3
    }

    public void adicionarHabilidade(String habilidade){

    }
    @Override
    public void mostrarResumo(){

    }
}
