package poo_fp11.PizzaRestaurant;

public enum PizzaSize {
    SMALL,
    MEDIUM,
    BIG,
    KING;

    public static String PizzaSizeToStrig(PizzaSize size){
        switch (size){
            case SMALL -> {
                return "The pizza is small.";
            }
            case MEDIUM -> {
                return "The pizza is medium.";
            }
            case BIG -> {
                return "The pizza is big.";
            }
            case KING -> {
                return "The pizza is king.";
            }
            default -> {
                return "The pizza is Medium.";
            }
        }
    }

}
