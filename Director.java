public class Director extends Employee {
    public Director(String name, String department, double salary, String doubleBudget) {
        super(name, department, salary);
        this.doubleBudget = doubleBudget;
    }

    private String doubleBudget;

    // public Director(String doubleBudget) {
    // this.doubleBudget = doubleBudget;

    public String getdoubleBudget() {
        return doubleBudget;
    }

    public void setdoubleBudget(String doubleBudget) {
        this.doubleBudget = doubleBudget;
    }

    @Override
    public String toString() {
        return super.toString() + "Director[DoubleBudget=" + doubleBudget + "]";
    }

    public String getDoubleBudget() {
        return doubleBudget;
    }

    public void setDoubleBudget(String doubleBudget) {
        this.doubleBudget = doubleBudget;
    }
}
