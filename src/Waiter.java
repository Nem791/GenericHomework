public class Waiter extends Employee {
    private long compensate;

    public Waiter(String id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }

    @Override
    public long calculatorSalary() {
        long salary = compensate + getBasicSalary();
        return salary;
    }

    @Override
    public String toString() {
        return getId() + " - " + getName() + " - " + getAge() +
                " - " + getBasicSalary() + " - salary = " + calculatorSalary();
    }
}
