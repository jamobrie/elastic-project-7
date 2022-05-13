public class MethodNotes {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        employeeService.fetchEmployeeDetails();
        employeeService.fetchSalary();

        //See how Employee2 doesn't need to be static, but Employee1 does
        Employee2 employee2 = new Employee2();
        String name = employee2.getName();


        Employee employee = new Employee();
        String fetchedName = employee.getName();


        //Non-static
        Complex fulcrumPoint = new Complex(23.0);
        System.out.println(Complex.testString);
        System.out.println(fulcrumPoint.testString);

        Complex2 fulcrumPoint2 = new Complex2();
        System.out.println(fulcrumPoint2.complexString);

    }

    public static class Employee {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;
    }

    public static class Complex2{
        public String complexString = "test123";
    }

}
