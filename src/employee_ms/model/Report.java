package employee_ms.controller;

import java.util.HashMap;
import java.util.Map;

public class Report {
    private Map<Integer, Attendance> attendanceData;

    public Report() {
        attendanceData = new HashMap<>();
    }

    public void addAttendance(int employeeId, String employeeName, int daysWorked, int totalWorkingDays) {
        Attendance attendance = new Attendance(employeeId, employeeName, daysWorked, totalWorkingDays);
        attendanceData.put(employeeId, attendance);
    }

    public void displayAttendanceReport() {
        System.out.println("Attendance Report");
        System.out.println("------------------");
        for (Attendance attendance : attendanceData.values()) {
            System.out.println("Employee ID: " + attendance.getEmployeeId());
            System.out.println("Name: " + attendance.getEmployeeName());
            System.out.println("Days Worked: " + attendance.getDaysWorked() + "/" + attendance.getTotalWorkingDays());
            System.out.println("Attendance Percentage: " + attendance.getAttendancePercentage() + "%");
            System.out.println("------------------------------");
        }
    }

    public void displayPayrollSummary(Payroll payroll) {
        System.out.println("Payroll Summary");
        System.out.println("------------------");
        payroll.displayEmployeePayroll();
    }

    private static class Attendance {
        private int employeeId;
        private String employeeName;
        private int daysWorked;
        private int totalWorkingDays;

        public Attendance(int employeeId, String employeeName, int daysWorked, int totalWorkingDays) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.daysWorked = daysWorked;
            this.totalWorkingDays = totalWorkingDays;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public int getDaysWorked() {
            return daysWorked;
        }

        public int getTotalWorkingDays() {
            return totalWorkingDays;
        }

        public double getAttendancePercentage() {
            return (double) daysWorked / totalWorkingDays * 100;
        }
    }
}
