package factoryMethod;


public class orderPizza {
    public static void main(String[] args) {

        // factory fact = new factory();
        // pizza pizz = factory.order(null, "anar");
        // pizz.back();

        pizza anar = (anarPizza) factory.order(new anarPizza());
        anar.cut();
        anar.box();
        anar.back();
        System.out.println("-------------------------");

        pizza chees = (cheesePizza) factory.order(new cheesePizza());
        chees.back();

    }
 
}
