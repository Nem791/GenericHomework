import java.util.ArrayList;

public class Repository {
    ArrayList<Waiter> waiterArrayList;
    ArrayList<Kitchen> kitchenArrayList;

    public ArrayList<Waiter> getWaiterArrayList() {
        waiterArrayList = new ArrayList<>();
        waiterArrayList.add(new Waiter("1", "Nam", 20, 15000000, 13000000));
        waiterArrayList.add(new Waiter("2", "Quang", 19, 13000000, 12000000));
        waiterArrayList.add(new Waiter("3", "Chau", 21, 16000000, 10000000));
        return waiterArrayList;
    }

    public ArrayList<Kitchen> getKitchenArrayList() {
        kitchenArrayList = new ArrayList<>();
        kitchenArrayList.add(new Kitchen("1", "Nem", 202, 152000000, 130002000));
        kitchenArrayList.add(new Kitchen("2", "Qu3ng", 119, 130100000, 120040000));
        kitchenArrayList.add(new Kitchen("3", "Ch@u", 231, 160000030, 100000200));
        return kitchenArrayList;
    }
}
