package entities;

public class Employee {
    private String name;
    private Integer hours;
    private double valuePerHour;

    public Employee(){
    }

    public double payment(){
        return hours * valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }
    public String getName() {
        return name;
    }
    public double getValuePerHour() {
        return valuePerHour;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Employee(String name, Integer hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }
}
