package classe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardapioSemanal {
    Map<String, List<Menu>> cardapio;

    CardapioSemanal() {
        cardapio = new HashMap<>();
    }

    void adicionarMenu(String dia, Menu menu) {
        cardapio.computeIfAbsent(dia, k -> new ArrayList<>()).add(menu);
    }

    void imprimirCardapio() {
        System.out.println("Cardápio Semanal:");
        for (String dia : cardapio.keySet()) {
            System.out.println("\n" + dia + ":");
            for (Menu menu : cardapio.get(dia)) {
                System.out.println(menu);
            }
        }
    }
}
