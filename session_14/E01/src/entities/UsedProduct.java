package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
    private Date manufactureDate;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String priceTag() {
    	return getName() 
		+ " (used) $ " 
		+ String.format("%.2f", getPrice())
		+ " (Manufacture date: "
		+ sdf.format(manufactureDate)
		+ ")";
       
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    public Date getManufactureDate() {
        return manufactureDate;
    }
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
}