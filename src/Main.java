//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    int itemPrice = 10;
    double TAX_RATE = 0.05;

    double salesTax = itemPrice * TAX_RATE;

    System.out.println("The tax on a purchase of $" + itemPrice + " is $" + salesTax);


    }
}