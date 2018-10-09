package main;

import java.util.ArrayList;
import java.util.List;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<Student>();
        studentsList.add(new Student("Andrew Kostenko", 59));
        studentsList.add(new Student("Julia Veselkina", 35));
        studentsList.add(new Student("Maria Perechrest", 66));
        studentsList.add(new Student("Peter Petrov", 29));
        studentsList.add(new Student("Oleg Urbanovich", 96));
        studentsList.add(new Student("Sam Samsonov", 74));
        studentsList.add(new Student("John Johnson", 87));

        University university = new University("CH.U.I.");

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
