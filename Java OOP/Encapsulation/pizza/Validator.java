package pizza;

public class Validator {
    public static void validatePizzaName(String name){
        if (name == null ||
                name.trim().isEmpty() ||
                name.length() < 1 ||
                name.length() > 15){

            throw new IllegalArgumentException(
                    "Pizza name should be between 1 and 15 symbols.");
        }
    }

    public static void validateNumberOfToppings(int numberOfToppings){
            if (numberOfToppings < 0 || numberOfToppings > 10) {
                throw new IllegalArgumentException(
                        "Number of toppings should be in range [0..10].");
            }
    }

    public static void validateDoughWeight(double weight) {
        if (weight < 0 || weight > 200) {
            throw new IllegalArgumentException(
                    "Dough weight should be in the range [1..200]."
            );
        }
    }

    public static void validateToppingWeight(double weight, String toppingType) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(
                    String.format("%s weight should be in the range [1..50].", toppingType));
        }
    }

    public static void validateToppingType (String toppingType) {
        if (!toppingType.equals("Meat") &&
            !toppingType.equals("Veggies") &&
            !toppingType.equals("Cheese") &&
            !toppingType.equals("Sauce")) {

            throw new IllegalArgumentException(
                    String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    public static void validateFlourType (String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain") ) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public static void validateBakingTechnique (String technique) {
        if (!technique.equals("Crispy") && !technique.equals("Chewy") &&
            !technique.equals("Homemade")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }
}
