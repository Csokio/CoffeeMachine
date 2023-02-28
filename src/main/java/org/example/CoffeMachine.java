package org.example;

public class CoffeMachine {

    public Coffee createCoffee(CoffeeType type){
        if (type == CoffeeType.AMERICANO){
            Americano americano = new Americano();
            return americano;
        } else if (type == CoffeeType.ESPRESSO) {
            Espresso espresso = new Espresso();
            return espresso;
        } else if (type == CoffeeType.CAPUCCINO) {
            Capuccino capuccino = new Capuccino();
            return capuccino;
        } else {
            return null;
        }
    }

}
