import domain.Carro;

import java.util.Arrays;

public class LocadoraApplication {
    public static void main(String[] args) {
        Carro[] frota = new Carro[5];

        Carro modeloCarro = new Carro("ABC-1234", "Toyota", "SW4", "Cinza", 250, true);

        //Arrays.fill(frota, modeloCarro);

        frota[0] = new Carro("ABC-000" + 0, "Toyota", "Cinza Chumbo", "SW" + 0, 964, true);
        frota[1] = new Carro("ABC-000" + 1, "Toyota", "Cinza Chumbo", "SW" + 1, 123, true);
        frota[2] = new Carro("ABC-000" + 2, "Toyota", "Cinza Chumbo", "SW" + 2, 1096, true);
        frota[3] = new Carro("ABC-000" + 3, "Toyota", "Cinza Chumbo", "SW" + 3, 80, true);
        frota[4] = new Carro("ABC-000" + 4, "Toyota", "Cinza Chumbo", "SW" + 4, 333, true);

        frota = ordenarVeiculos(frota);

        System.out.println(frota.length);

        //frota = new Carro[20];
        //frota = Arrays.copyOf(frota, 10);

        System.out.println(frota.length);

        //System.out.println(Arrays.toString(frota));

    }

    public static Carro[] ordenarVeiculos(Carro[] veiculos) {
        Arrays.sort(veiculos);

        return veiculos;
    }
}
