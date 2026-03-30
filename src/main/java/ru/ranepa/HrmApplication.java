package ru.ranepa;

import ru.ranepa.model.Employee;
import ru.ranepa.repository.EmployeeRepositoryImpl;

import java.time.LocalDate;

public class HrmApplication {
    public static void main(String[] args) {
        Employee emp = new Employee(
                "Kankosheva Liliana Anzorovna",
                "java разработчик",
                100_000.0,
                LocalDate.of(2026, 3, 1)
        );

        //sout
        System.out.println(emp.getSalary());

        new EmployeeRepositoryImpl();

        var repo = new EmployeeRepositoryImpl();
        System.out.println("========");
        System.out.println(repo.save(emp));
        System.out.println("========");
        var emp1 = repo.findById(1L)
                .orElseThrow();
        System.out.println("Employee was found: " + emp1);
    }
}