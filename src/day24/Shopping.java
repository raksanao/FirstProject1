package day24;

public class Shopping {
    public static void main(String[] args) {
        String[] groceryItem = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        int itemCount = groceryItem.length;
        int lastItemIndex = itemCount - 1;

        String lastFruit = groceryItem[lastItemIndex];
        for (String eachFruit : groceryItem) {
            System.out.println(eachFruit);
            if (!eachFruit.equals(lastFruit)) {
                System.out.print("-->");

            }
        }
    }
}