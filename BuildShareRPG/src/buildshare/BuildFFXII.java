package buildshare;



public class BuildFFXII extends Build{
    private JobType jobPrimario;
    private JobType jobSecundario;
    private Personagem personagem;

    public BuildFFXII(Usuario criador, Personagem personagem, JobType jobPrimario, JobType jobSecundario) {
        this.criador = criador;
        this.personagem = personagem;
        this.jobPrimario = jobPrimario;
        this.jobSecundario = jobSecundario;
        this.jogo = Jogo.FINAL_FANTASY_XII;
    }

    @Override
    public void mostrarResumo(){

    }


}
