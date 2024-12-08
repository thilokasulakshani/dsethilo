package employee_ms.controller;

import java.util.HashMap;
import java.util.Map;

public class Payroll {
    private Map<Integer, Employee> employeeData;

    public Payroll() {
        employeeData = new HashMap<>();
    }

    public void addEmployee(int id, String name, double basicSalary, double allowances, double deductions) {
        Employee employee = new Employee(id, name, basicSalary, allowances, deductions);
        employeeData.put(id, employee);
    }

    public double calculateNetSalary(int employeeId) {
        if (employeeData.containsKey(employeeId)) {
            Employee employee = employeeData.get(employeeId);
            double grossSalary = employee.getBasicSalary() + employee.getAllowances();
            return grossSalary - employee.getDeductions();
        }
        throw new IllegalArgumentException("Employee ID not found.");
    }

    public void displayEmployeePayroll() {
        for (Employee employee : employeeData.values()) {
            double netSalary = calculateNetSalary(employee.getId());
            System.out.println("Employee ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Basic Salary: " + employee.getBasicSalary());
            System.out.println("Allowances: " + employee.getAllowances());
            System.out.println("Deductions: " + employee.getDeductions());
            System.out.println("Net Salary: " + netSalary);
            System.out.println("------------------------------");
        }
    }

    private static class Employee {
        private int id;
        private String name;
        private double basicSalary;
        private double allowances;
        private double deductions;

        public Employee(int id, String name, double basicSalary, double allowances, double deductions) {
            this.id = id;
            this.name = name;
            this.basicSalary = basicSalary;
            this.allowances = allowances;
            this.deductions = deductions;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getBasicSalary() {
            return basicSalary;
        }

        public double getAllowances() {
            return allowances;
        }

        public double getDeductions() {
            return deductions;
        }
    }
}
