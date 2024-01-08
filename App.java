public class App {
    public static void main(String[] args) throws Exception {
        Employee Abdulrahman = new Employee("Abdulrahman", "IT",
                2000);

        Director fatema = new Director(null, null, 0, null);
        Engineer Haya = new Engineer(null, null, 0, null);
        SalesPerson Razan = new SalesPerson("Razan", "Sales", 0, 1);
        System.out.println(Abdulrahman);
        System.out.println(fatema);
        System.out.println(Haya);
        System.out.println(Razan);

    }
}
