package main;

public class NavegadorWeb {

    private String url;

    public NavegadorWeb() {
        System.out.println("Iniciando Navegador Web");
    }

    public void exibirPagina(String url){
        this.url = url;
        System.out.println("Exibindo página " + this.url);
    }

    public void adicionarNovaAba(){
        System.out.println("Abrindo Nova aba...");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página...");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
