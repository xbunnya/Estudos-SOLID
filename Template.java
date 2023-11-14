abstract class PratoDeMassa {
    final void preparaReceita() {
        aqueceAgua();
        cozinhaMassa();
        preparaIngredientes();
        preparaMolho();
        finaliza();
    }

    abstract void preparaIngredientes();
    abstract void preparaMolho();
    abstract void finaliza();

    void aqueceAgua() {
        System.out.println("Aquecendo água");
    }

    void cozinhaMassa() {
        System.out.println("Cozinhando a massa");
    }
}

class MassaCarbonara extends PratoDeMassa {
    public void preparaIngredientes() {
        System.out.println("Cortar 200g de bacon, bater 2 ovos, ralar 100g de queijo pecorino, adicionar pimenta do reino a gosto");
    }

    public void preparaMolho() {
        System.out.println("Fritar o bacon e misturar ao ovo batido, pimenta e queijo");
    }

    public void finaliza() {
        System.out.println("Escorrer a água da massa e misturar ao molho");
    }
}

class MassaAlhoAndOleo extends PratoDeMassa {
    public void preparaIngredientes() {
        System.out.println("Picar alho, adicionar azeite e pimenta vermelha a gosto");
    }

    public void preparaMolho() {
        System.out.println("Misturar alho e azeite, adicionando pimenta vermelha conforme desejado");
    }

    public void finaliza() {
        System.out.println("Escorrer a água da massa e misturar ao molho de alho e azeite");
    }
}

class MassaComSalsicha extends PratoDeMassa {
    public void preparaIngredientes() {
        System.out.println("Cortar salsichas, preparar molho de tomate, picar manjericão fresco");
    }

    public void preparaMolho() {
        System.out.println("Cozinhar salsichas no molho de tomate, acrescentar manjericão");
    }

    public void finaliza() {
        System.out.println("Escorrer a água da massa e misturar com o molho de salsicha e tomate");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Preparando Massa Carbonara:");
        PratoDeMassa carbonara = new MassaCarbonara();
        carbonara.preparaReceita();
        
        System.out.println("\nPreparando Pasta Alho e odio:");
        PratoDeMassa aglioEOlio = new MassaAlhoAndOleo();
        aglioEOlio.preparaReceita();

        System.out.println("\nPreparando Pasta com Salsicha:");
        PratoDeMassa pastaComSalsicha = new MassaComSalsicha();
        pastaComSalsicha.preparaReceita();
    }
}