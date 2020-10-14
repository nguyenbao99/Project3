package Rolls;

public abstract class Roll {

    private String rollName = "roll";  /* gets updated inside of RollFactory */
    private Double price = 0.0;

    public String getDescription() { return this.rollName; }
    public Double getPrice() { return this.price; }
    public void setPrice(Double _price) { this.price = _price; }
    public void setName(String _name) { this.rollName = _name; }

}