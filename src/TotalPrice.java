public class TotalPrice {

    private float total_devices, total_laptops, total_tablets;
    private Device[] devices;

    TotalPrice(Device[] a_devices) {
        total_devices = 0;
        total_laptops = 0;
        total_tablets = 0;
        devices = a_devices;
    }

    public void print_totals() {

        for (int count = 0; count < devices.length; ++count) {
            String name = devices[count].getClass().getSimpleName();
            switch (name) {
                case "Device": total_devices += devices[count].calc_price(); break;
                case "Laptop": total_laptops += devices[count].calc_price(); break;
                case "Tablet": total_tablets += devices[count].calc_price(); break;
            }
        }

        System.out.println( "Total price of Devices: " + total_devices + "\n" +
                            "Total price of Laptops: " + total_laptops + "\n" +
                            "Total price of Tablets: " + total_tablets);
    }
}
