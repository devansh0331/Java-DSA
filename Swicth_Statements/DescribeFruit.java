package Swicth_Statements;

public class DescribeFruit {
    public static void main(String[] args) {

        String fruit = "Mango";
        switch (fruit) {
            case "Apple":
                System.out.println("A fruit that doctor hates...");
                break;
            case "Mango":
                System.out.println("King of fruits...");
                break;
            case "Grapes":
                System.out.println("Small green fruit...");
            case "Orange":
                System.out.println("Name of fruit same as colour....");
            default:
                System.out.println("Fruit is from another planet...");
                break;
        }
        // switch (fruit) {
        // case "Apple" -> System.out.println("A fruit that doctor hates...");

        // case "Mango" -> System.out.println("King of fruits...");

        // case "Grapes" -> System.out.println("Small green fruit...");
        // case "Orange" -> System.out.println("Name of fruit same as colour....");
        // default -> System.out.println("Fruit is from another planet...");
        // }
    }
}
