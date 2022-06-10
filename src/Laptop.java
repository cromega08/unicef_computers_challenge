public class Laptop extends Device {
    
    private float hd, basis_hd = 250;

    Laptop () {
        hd = basis_hd;
    }

    Laptop(byte a_weight, float a_price) {
        hd = basis_hd;
        weight = a_weight;
        price = a_price;
    }
    
    Laptop(byte a_weight, float a_price, char a_consumption_w, float a_hd) {
        hd = a_hd;
        weight = a_weight;
        price = a_price;
        consumption_w = a_consumption_w;
    }

    public float calc_price() {
        float   cost_w = calc_consume_w(),
                cost_weight  =  weight > 4? 100f:
                                weight > 3? 80f:
                                weight > 2? 50f:
                                weight > 1? 10f: 0,
                cost_hd =   hd > 1000? 100f:
                            hd > 500? 50f:
                            hd > 250? 10f: 0;
        return price + cost_w + cost_weight + cost_hd;
    }
}
