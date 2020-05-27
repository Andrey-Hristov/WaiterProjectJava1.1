import com.company.Dishes;
import com.company.Purchase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PurchaseTest {
    private Purchase purchase;

    @Before
    public void createObjectsAndListBeforeEveryTestAndAddThem () {
        Dishes dish1 = new Dishes("drink",1.0,"water");
        Dishes dish2 = new Dishes("desert", 3.0, "Ice Cream");

        List<Dishes> purchasedDishes = new ArrayList<Dishes>();

        purchasedDishes.add(dish1);
        purchasedDishes.add(dish2);
    }

    @Test
    public void TestCalcTotalPriceMethod () {
        createObjectsAndListBeforeEveryTestAndAddThem();

        double expected = 4.0;
        double actual = purchase.calcTheTotalAndCurrentPriceOfThePurchase();

        Assert.assertEquals(expected, actual);
    }
}
