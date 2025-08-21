package br.com.fiap.game.model;

public class PersonagemMagico {

    //Atributos
    private String nome;
    private String poderMagico;
    private int nivelEnergia;

    public HabilidadeEspecial habilidade;

    private PersonagemMagico() {
    }

    public PersonagemMagico(String nome) {
        this.nome = nome;
    }

    public void atacar(String ataque) {
        if (nivelEnergia >= 10) {
            System.out.println(nome + " realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10;
        } else {
            System.out.println(nome + " está sem energia para atacar.");
        }
    }

    public int aumentarEnergia(int energia){
        nivelEnergia = nivelEnergia + energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial(){
        if (!habilidade.isHabilitada()){
            System.out.println("Habilidade especial não está ativada");
        } else if (nivelEnergia >= habilidade.getCustoEnergia()){
            System.out.println("Ativando a habilidade: " + habilidade.getNome());
            nivelEnergia -= habilidade.getCustoEnergia();
        } else {
            System.out.println(nome + "está sem energia para a habilidade especial");
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HabilidadeEspecial getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(HabilidadeEspecial habilidade) {
        this.habilidade = habilidade;
    }

    public String getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(String poderMagico) {
        this.poderMagico = poderMagico;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

}