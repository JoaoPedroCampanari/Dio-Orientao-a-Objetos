package celular;

import celular.funcoes.AparelhoTelefonico;
import celular.funcoes.NavegadorNaInternet;
import celular.funcoes.RepodutorMusicial;

public class Celular implements RepodutorMusicial, AparelhoTelefonico, NavegadorNaInternet {
    @Override
    public void tocar() {
        System.out.println("Musica está tocando!");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada!");
    }


    @Override
    public void ligar() {
        System.out.println("Discando para o numero ...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida!");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Correio de Voz iniciado!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Pagina amostra!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba criada! ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada!");
    }
}
