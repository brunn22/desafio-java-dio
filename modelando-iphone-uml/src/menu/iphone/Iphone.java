package menu.iphone;

import menu.iphone.aparelho.AparelhoTelefonico;
import menu.iphone.navegador.NavegadorInternet;
import menu.iphone.reprodutor.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void tocar() {
        System.out.println("Reproduzindo musica");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");
    }  

    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }
}
