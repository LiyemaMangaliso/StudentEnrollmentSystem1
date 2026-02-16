package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UndergraduateStudent undergrad =
                new UndergraduateStudent.Builder("U101", "Alice")
                        .email("alice@uni.com")
                        .department("Computer Science")
                        .creditHours(15)
                        .scholarshipAmount(1000)
                        .build();

        GraduateStudent grad =
                new GraduateStudent.Builder("G201", "Bob")
                        .email("bob@uni.com")
                        .department("Engineering")
                        .researchAssistant(true)
                        .stipend(2000)
                        .build();

        undergrad.displayStudentDetails();
        System.out.println("---------------------");
        grad.displayStudentDetails();
    }
}
    
