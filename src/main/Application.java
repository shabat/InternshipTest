package main;

import java.util.ArrayList;
import java.util.List;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university  = new University("CH.U.I.");
        
        university.addStudent(new Student("Andrew Kostenko", 59));
        university.addStudent(new Student("Julia Veselkina", 35));
        university.addStudent(new Student("Maria Perechrest", 66));
        university.addStudent(new Student("Peter Petrov", 29));
        university.addStudent(new Student("Oleg Urbanovich", 96));
        university.addStudent(new Student("Sam Samsonov", 74));
        university.addStudent(new Student("John Johnson", 87));

        Internship internship = new Internship("Interlink", university.getAverageKnowledge());
        for(int i=0; i<university.studentsList.size(); i++) {
			internship.setStudent(university.studentsList.get(i));
        }
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
