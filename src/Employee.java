import java.util.ArrayList;

public class Employee {
    ArrayList<Employee> employees = new ArrayList<>();
    private int id;
    private String name;
    private String lastName;
    private Gender gender;
    private int age;
    private double salary;
    private int workExperience;
    private Speciality speciality;
    public void fillEmployees() {
        employees.add(new Employee(1, "Masha", "Lytvynova", Gender.FEMALE, 17, 12000, 4, Speciality.BACKAND_DEVELOPER));
        employees.add(new Employee(1, "Angelina", "Vovk", Gender.FEMALE, 18, 18000.9, 6, Speciality.HR));
        employees.add(new Employee(1, "Mykyta", "Berkut", Gender.MALE, 18, 4000.1, 2, Speciality.PM));
        employees.add(new Employee(1, "Maxim", "Kyshuk", Gender.MALE, 18, 7700.017, 3, Speciality.FRONTED_DEVELOPER));
        employees.add(new Employee(1, "Viktoria", "Turko", Gender.FEMALE, 17, 9980.5, 5, Speciality.QA));
        employees.add(new Employee(1, "Maxim", "Fidrya", Gender.MALE, 18, 1150, 1, Speciality.BACKAND_DEVELOPER));
        employees.add(new Employee(1, "Serhii", "Suk", Gender.MALE, 17, 14000.2, 5, Speciality.HR));
        employees.add(new Employee(1, "Kostya", "Los", Gender.MALE, 18, 21000.400, 7, Speciality.QA));

    }
    public Employee(int id, String name, String lastName, Gender gender, int age, double salary, int workExperience, Speciality speciality) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.workExperience = workExperience;
        this.speciality = speciality;
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Gender getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getWorkExperience() {
        return this.workExperience;
    }

    public Speciality getSpeciality() {
        return this.speciality;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Employee)) return false;
        final Employee other = (Employee) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$employees = this.getEmployees();
        final Object other$employees = other.getEmployees();
        if (this$employees == null ? other$employees != null : !this$employees.equals(other$employees)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false;
        if (this.getAge() != other.getAge()) return false;
        if (Double.compare(this.getSalary(), other.getSalary()) != 0) return false;
        if (this.getWorkExperience() != other.getWorkExperience()) return false;
        final Object this$speciality = this.getSpeciality();
        final Object other$speciality = other.getSpeciality();
        if (this$speciality == null ? other$speciality != null : !this$speciality.equals(other$speciality))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Employee;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $employees = this.getEmployees();
        result = result * PRIME + ($employees == null ? 43 : $employees.hashCode());
        result = result * PRIME + this.getId();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        result = result * PRIME + this.getAge();
        final long $salary = Double.doubleToLongBits(this.getSalary());
        result = result * PRIME + (int) ($salary >>> 32 ^ $salary);
        result = result * PRIME + this.getWorkExperience();
        final Object $speciality = this.getSpeciality();
        result = result * PRIME + ($speciality == null ? 43 : $speciality.hashCode());
        return result;
    }

    public String toString() {
        return "Employee(employees=" + this.getEmployees() + ", id=" + this.getId() + ", name=" + this.getName() + ", lastName=" + this.getLastName() + ", gender=" + this.getGender() + ", age=" + this.getAge() + ", salary=" + this.getSalary() + ", workExperience=" + this.getWorkExperience() + ", speciality=" + this.getSpeciality() + ")\n";
    }
}
