public class App {
    public static void main(String[] args) throws Exception {
        Device[] devices = new Device[3];
        devices[0] = new Tablet();
        devices[1] = new Laptop((byte) 3, 500,'E', 250);
        devices[2] = new Device((byte) 3, 600, 'D');
        TotalPrice answer = new TotalPrice(devices);
        answer.print_totals();
    }
}
