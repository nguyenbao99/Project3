package Rolls;

/* Implmenting the Factory pattern here to simplify instantiating all types of rolls */
public class RollFactory {

    //protected abstract String makeRoll(String type);  , use this if you want to expand more to different types of rolls for different store types

    /* Constants for prices of each roll */
    final Double eggRollPrice = 1.25;
    final Double JellyRollPrice = 2.0;
    final Double PastryRollPrice = 3.0;
    final Double SausageRollPrice = 1.5; 
    final Double SpringRollPrice = 1.75;

    public Roll makeRoll(String type) {
        switch (type) {
            case "Egg roll":
                return new EggRoll("Egg roll", eggRollPrice);
            case "Jelly roll":
                return new JellyRoll("Jelly roll", JellyRollPrice);
            case "Pastry roll":
                return new PastryRoll("Pastry roll", PastryRollPrice);
            case "Sausage roll":
                return new SausageRoll("Sausage roll", SausageRollPrice);
            case "Spring roll":
                return new SpringRoll("Spring roll", SpringRollPrice);
            default:
                System.out.println("Don't know what kind of roll I need to create");
                System.exit(0);
                return new EggRoll("Egg roll", eggRollPrice);   // should never come here.
        }
    }
}