package val.mx.de;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Test {
    List<Hero> heros = new List<>();

    public Test() {

        for (int i = 0; i < 100; i++)
            heros.append(new Hero(ThreadLocalRandom.current().nextInt(1000), UUID.randomUUID().toString()));

        Hero h;
        heros.toFirst();

        while ((h = heros.getContent()) != null) {
            h.print();
            heros.next();
        }
    }
}