package course2.skypro;

import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;
    private int salary;
    private int department;

    public Employee(String lastName, String firstName, int department, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee employee1 = (Employee) other;
        return lastName.equals(employee1.lastName) && firstName.equals(employee1.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName + lastName);
    }
}
