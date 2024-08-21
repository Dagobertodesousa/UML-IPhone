# UML - Iphone
## multipla funcionalidade de Dispositivo Inteligente

### Representação por meio de diagrama UML
Funcionalidades a Modelar

    Player
        Métodos: tocar(), pausar(), selecionarMusica(String musica)
    Phone
        Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
    Browser
        Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

Objetivo

    Criar um diagrama UML que represente as funcionalidades descritas acima.
    Implementar as classes e interfaces correspondentes em Java (Opcional).
    

```mermaid
classDiagram
  class Browser{
    public String url;
    public String atualizarPagina()
    public String adicionarNovaAba()
    public String exibirPagina(String Url)
  }

  class Phone{
    public String ligar(String Contato)
    public String atender()
    public String iniciarCorreioDeVoz()
  }

  class Player{
    public String musica;
    public String tocar()
    public String pausar()
    public String selecionarMusica(String Musica)
  }

  class SmartPhone{
    public Browser browser;
    public Phone phone;
    public Player player;
    public static void main(String[] args)
  }

  SmartPhone --> Browser
  SmartPhone --> Player
  SmartPhone --> Phone
```
