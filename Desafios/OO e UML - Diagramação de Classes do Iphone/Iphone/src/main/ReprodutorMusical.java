package main;

public class ReprodutorMusical {

    private String musica;

    public ReprodutorMusical() {
        System.out.println("Iniciando reprodutor musical...");
    }

    public void tocar(){
        System.out.println("Tocando musica");
    }

    public void pausar(){
        System.out.println("Musica Pausada");

    }

    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Selecionado a musica: " + this.musica);

    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }
}
