/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

public class DrivableTrader<T extends Drivable> extends Trader<T> {

    public DrivableTrader(List<T> inventory, List<T> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    public DrivableTrader(int money) {
        super(money);
    }

    @Override
    public int getSellingPrice(T item) {
        if(item instanceof Tradable) {
            return ((Tradable) item).getPrice() + item.getMaxSpeed();
        }
        return Tradable.MISSING_PRICE;
    }
}