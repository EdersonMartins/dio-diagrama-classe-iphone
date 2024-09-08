import componentes.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone aparelhonovo = new Iphone();

        System.out.println("\\---> Reproduzindo Musicas <---//");
        aparelhonovo.tocarMusica();
        aparelhonovo.pausarMusica();
        aparelhonovo.pararMusica();

        System.out.println("\\---> Executando Chamada <---//");
        aparelhonovo.fazerChamada();
        aparelhonovo.receberChamada();
        aparelhonovo.encerrarChamada();

        System.out.println("\\---> Navegando Pela Internat <---//");
        aparelhonovo.abrirPagina();
        aparelhonovo.fecharPagina();
        aparelhonovo.navegarPara();
    }
}