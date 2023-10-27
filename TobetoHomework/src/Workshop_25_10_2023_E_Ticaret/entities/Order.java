package Workshop_25_10_2023_E_Ticaret.entities;

public class Order{

    private  int id;
    private  int total;



    public Order(int id, int total) {
        this.id = id;
        this.total = total;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
