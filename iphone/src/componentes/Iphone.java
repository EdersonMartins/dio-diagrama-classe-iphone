
package componentes;

import aparelho.Navegador;
import aparelho.ReprodutorMusical;
import aparelho.Telefone;

public class Iphone implements Telefone, Navegador, ReprodutorMusical {

    @Override
    public void fazerChamada(){
    
        System.out.println("Fazendo ligação...");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo ligação...");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando Ligação...");
    }

    @Override
    public void abrirPagina() {
        System.out.println("Abrindo página web...");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página web...");
    }

    @Override
    public void navegarPara() {
        System.out.println("Navegando entre páginas web...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica...");
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando musica...");
    }
}