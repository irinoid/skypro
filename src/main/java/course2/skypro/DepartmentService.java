package course2.skypro;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Optional<Employee> getMaxSalary(int departmentId);

    Optional<Employee> getMinSalary(int departmentId);

    List<Employee> printDepartmentEmployee(int departmentId);

    List<Employee> printDepartmentEmployee();
}
