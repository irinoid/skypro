package course2.skypro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String lastName, @RequestParam String firstName, @RequestParam int departmentId, @RequestParam int salary) {
        return employeeService.addEmployee(lastName, firstName, departmentId, salary);
    }

    @GetMapping("/remove")
    public String deleteEmployee(@RequestParam String lastName, @RequestParam String firstName) throws EmpNotFoundException {
        return "Удалён: " + employeeService.deleteEmployee(lastName, firstName);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String lastName, @RequestParam String firstName) throws EmpNotFoundException {
        return employeeService.findEmployee(lastName, firstName);
    }
}
