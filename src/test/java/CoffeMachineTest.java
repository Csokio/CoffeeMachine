import org.example.Americano;
import org.example.CoffeMachine;
import org.example.Coffee;
import org.example.CoffeeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeMachineTest {

    @Test
    public void createCoffeeTest(){
        CoffeMachine machine = new CoffeMachine();
        Coffee coffee = machine.createCoffee(CoffeeType.AMERICANO);
        Assertions.assertInstanceOf(Americano.class, machine.createCoffee(CoffeeType.AMERICANO));

        Assertions.assertEquals(1, coffee.getMilk());
    }

}
