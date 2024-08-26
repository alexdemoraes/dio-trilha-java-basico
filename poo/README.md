POO - Desafio


```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        + tocar()
        + pausar(String exemplo)
        + selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        + ligar(String numero)
        + atender() 
        + iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    class IPhone {
        - musicaAtual
        + tocar()
        + pausar(String exemplo)
        + selecionarMusica(String musica)
        + ligar(String numero)
        + atender()
        + iniciarCorreioVoz()
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```




