import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class EmployeeRepository {
    ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeRepository() {
        employees.add(new Employee(1, "Masha", "Lytvynova", Gender.FEMALE, 17, 12000, 4, Speciality.FRONTED_DEVELOPER));
        employees.add(new Employee(2, "Angelina", "Vovk", Gender.FEMALE, 18, 18000.9, 6, Speciality.HR));
        employees.add(new Employee(3, "Mykyta", "Berkut", Gender.MALE, 18, 4000.1, 2, Speciality.PM));
        employees.add(new Employee(4, "Maxim", "Kyshuk", Gender.MALE, 18, 7700.017, 3, Speciality.DEV_OPS));
        employees.add(new Employee(5, "Viktoria", "Turko", Gender.FEMALE, 17, 9980.5, 5, Speciality.QA));
        employees.add(new Employee(6, "Maxim", "Fidrya", Gender.MALE, 18, 1150, 1, Speciality.BACKAND_DEVELOPER));
        employees.add(new Employee(7, "Serhii", "Suk", Gender.MALE, 17, 14000.2, 5, Speciality.HR));
        employees.add(new Employee(8, "Kostya", "Los", Gender.MALE, 18, 21000.400, 7, Speciality.QA));
    }

    public String[] getNameAndSurnameOfTop3BySalary() {
        String[] empls = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .map(x -> x.getName() + " " + x.getLastName())
                .toArray(String[]::new);
        return empls;
    }
    public Map<Speciality, List<Employee>> groupBySpeciality() {
        return employees.stream().collect(groupingBy(Employee::getSpeciality));
    }
    public int getSalaryByHugeCriterialList() {
        int i = employees.stream()
                .filter((x) -> x.getGender() == Gender.FEMALE &&
                        x.getAge() <= 30 &&
                        x.getSpeciality() == Speciality.QA &&
                        x.getWorkExperience() <= 5)
                .mapToInt(x -> (int) x.getSalary())
                .sum();
        return i;
    }
    public boolean checkIfPresentTopEmployeeWithWorkExperienceWorkMoreThenTwenty() {
        return employees.stream()
                .anyMatch(x -> x.getGender() == Gender.MALE &&
                        x.getWorkExperience()>20 &&
                        ((x.getSpeciality() == Speciality.BACKAND_DEVELOPER) || x.getSpeciality() == Speciality.DEV_OPS));
    }
    public String getDescendingSalaryByFullName() {
        StringBuffer buffer = new StringBuffer();
        employees.stream().
        sorted(Comparator.comparing(Employee::getSalary).reversed()).
                toList().
                forEach(x->buffer.append(x.getName() + " " + x.getLastName() + " " + x.getSalary() + ";\n"));
        return buffer.toString();
    }
    public Map<Speciality, Double> getAverageSalaryBySpeciality() {
        return employees.stream()
                .collect(toMap(Employee::getSpeciality, Employee::getSalary));

    }
}
