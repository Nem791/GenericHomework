public class Kitchen extends Employee {
    private long serviceCharge;

    public Kitchen(String id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public long calculatorSalary() {
        long salary = getBasicSalary() + serviceCharge;
        return salary;
    }

    @Override
    public String toString() {
        return getId() + " - " + getName() + " - " + getAge() +
                " - " + getBasicSalary() + " - salary = " + calculatorSalary();
    }
}
