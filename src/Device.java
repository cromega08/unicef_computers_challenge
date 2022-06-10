import java.util.HashMap;

public class Device {

    protected float price, basis_price = 100f;
    protected byte weight, basis_weight = 1;
    protected char consumption_w, basis_consumption_w = 'F';

    Device() {
        weight = basis_weight;
        price = basis_price;
        consumption_w = basis_consumption_w;
    }

    Device(byte a_weight, float a_price) {
        weight = a_weight;
        price = a_price;
        consumption_w = basis_consumption_w;
    }

    Device(byte a_weight, float a_price, char a_consumption_w) {
        weight = a_weight;
        price = a_price;
        consumption_w = a_consumption_w;
    }

    public float calc_consume_w() {
        HashMap<Character,Float> cost_w = new HashMap<Character,Float>();
        cost_w.put('A', 100f); cost_w.put('B', 80f); cost_w.put('C', 60f);
        cost_w.put('D', 50f); cost_w.put('E', 30f); cost_w.put('F', 10f);
        return cost_w.get(Character.toUpperCase(consumption_w));
    }

    public float calc_price() {
        float   cost_w = calc_consume_w(),
                cost_weight  =  weight > 1 && weight <= 2? 10f:
                                weight > 2 && weight <= 3? 50f:
                                weight >3 && weight <= 4? 80f:
                                weight > 4? 100f: 0;

        return price + cost_w + cost_weight;
    }
}
