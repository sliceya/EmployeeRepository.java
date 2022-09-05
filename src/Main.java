import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository emp = new EmployeeRepository();
        System.out.println(emp.checkIfPresentTopEmployeeWithWorkExperienceWorkMoreThenTwenty());
        System.out.println(emp.getDescendingSalaryByFullName());
        System.out.println(Arrays.toString(emp.getNameAndSurnameOfTop3BySalary()));
        System.out.println(emp.groupBySpeciality());
        System.out.println(emp.getSalaryByHugeCriterialList());
        System.out.println(emp.getAverageSalaryBySpeciality());
        System.out.println(emp.getAverageSalaryBySpeciality());
        List<? super Double> z = new ArrayList<>();
        z.add(new Object());
    }
}