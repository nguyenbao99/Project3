package Extras;
import Rolls.*;

/* Implementing the decorator pattern. Each type of Extra will update the rolls name and the rolls current price. */
public abstract class Extras extends Roll {
    public Double price;    /* all of them should have a price */
    public Roll roll;
}

/*  Extras Semantics
        EggRoll
            Sauces
                - siracha
                - fish sauce
                - sweet sauce
            Fillings
                - extra meat
            Topping
                - Lettuce
                - Cucumber
        JellyRoll
            Sauce
                - Syrup
                - PowderSugar
                - Choclate
            Fillings
                - cream
            Toppings
                - Fruit
                - Candy
        PastryRoll
            Sauce
                - strawberry syrup
                - choclate syrup
                - vanilla syrup
            Fillings
                - cream
            Toppings
                - Caramel 
                - Ice Cream
        SausageRoll
            Sauce
                - hot
                - spicy
                - mild
            Fillings
                - eggs
                - tomatoes
            Toppings
                - guace
                - sourcream
        SpringRoll
            Sauce
                - Siracha
                - Hoison 
                - peanut
            Fillings
                - pork
                - shrimp
            Toppings
                - beansprouts
                - jalepeno
*/