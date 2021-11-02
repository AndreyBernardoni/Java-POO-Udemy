package entities;

public final class ImportedProduct extends Product{
    
    private double customsFee;

    public double totalPrice() {
        return (this.getPrice() + this.customsFee);
    }

    @Override
    public String priceTag() {
        return (this.getName() + " $" + this.totalPrice() + " (Customs fee: $" + this.customsFee + ")");
    }

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
}