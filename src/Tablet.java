public class Tablet extends Device {

    private float ram, basis_ram = 1;

    Tablet() {
        ram = basis_ram;
        weight = basis_weight;
    }

    Tablet(byte a_weight, float a_price) {
        ram = basis_ram;
        weight = a_weight;
        price = a_price;
    }

    Tablet(byte a_weight, float a_price, char a_consumption_w, float a_ram) {
        ram = a_ram;
        weight = a_weight;
        price = a_price;
        consumption_w = a_consumption_w;
    }

    public float calc_price() {
        float   cost_w = calc_consume_w(),
                cost_weight  =  weight > 4? 100:
                                weight > 3? 80:
                                weight > 2? 50:
                                weight > 1? 10: 0,
                cost_ram =  ram > 4? 50:
                            ram > 2? 25:
                            ram > 1? 5: 0;

        return price + cost_w + cost_weight + cost_ram;
    }
}
