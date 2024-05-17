package main;

public class AparelhoTelefonico {
    private String numero;

    public AparelhoTelefonico() {
        System.out.println("Iniciando Aparelho telefonico...");
    }

    public void ligar(String numero){
        this.numero = numero;
        System.out.println("Ligando para o numero " + this.numero);
    }

    public void atender(){
        System.out.println("Atendendo ligação...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Abrindo correio de voz...");
    }
}
