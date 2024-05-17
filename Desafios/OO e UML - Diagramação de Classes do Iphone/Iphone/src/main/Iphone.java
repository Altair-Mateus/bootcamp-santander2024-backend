package main;

public class Iphone {

    public static void main(String[] args) {

        //  Navegador
        NavegadorWeb navegador = new NavegadorWeb();
        navegador.adicionarNovaAba();
        navegador.exibirPagina("https://www.google.com/");
        navegador.atualizarPagina();

        //  Reprodutor musical
        ReprodutorMusical spotify = new ReprodutorMusical();
        spotify.selecionarMusica("My Way - Calvin Harris");
        spotify.tocar();
        spotify.pausar();

        // Aparelho telefonico
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("+555199999999");
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }


}
