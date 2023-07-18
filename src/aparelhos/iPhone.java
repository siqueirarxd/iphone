package aparelhos;

import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    //Navegador de internet

    public void adicionarPagina() {
        System.out.println("Adicionando Página...");
        
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
        
    }

    public void exibirPagina() {
        System.out.println("Exibindo página...");
        
    }
    // Reprodutor de música

    public void pausar() {
        System.out.println("Música pausada.");
        
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música...");
        
    }

    public void tocar() {
        System.out.println("Reproduzindo música...");
        
    }
    // Aparelho telefônico

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
        
    }

    public void ligar() {
        System.out.println("Ligando...");
        
    }
    
}
