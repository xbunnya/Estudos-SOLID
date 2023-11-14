interface Duck {
    void quack();
    void fly();
}

interface Turkey {
    void gobble();
    void fly();
}

class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}

class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}

class TurkeyAdapter implements Duck {
    Turkey turkey;

    TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}

public class Main {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The duck says...");
        testDuck(duck);

        System.out.println("=== The turkey adapted ===");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}


==========================================================================


public interface BoilerController {
    void setTemperature(float temp);
}

public class FahrenheitBoilerController implements BoilerController {
    @Override
    public void setTemperature(float temp) {
        System.out.println("Definindo temperatura em Fahrenheit: " + temp + "°F");
    }
}

public class CelsiusBoilerAdapter implements BoilerController {
    private BoilerController fahrenheitController;

    public CelsiusBoilerAdapter(BoilerController fahrenheitController) {
        this.fahrenheitController = fahrenheitController;
    }

    @Override
    public void setTemperature(float temp) {
        float tempInFahrenheit = (temp * 9 / 5) + 32;
        fahrenheitController.setTemperature(tempInFahrenheit);
    }
}

public class Main {
    public static void main(String[] args) {
        FahrenheitBoilerController fahrenheitController = new FahrenheitBoilerController();
        BoilerController celsiusAdapter = new CelsiusBoilerAdapter(fahrenheitController);

        // O adaptador cuidará da conversão para Fahrenheit e chamará a API da caldeira em Fahrenheit
        celsiusAdapter.setTemperature(100.0f); // Define 100 graus Celsius

    }
}


==========================================
