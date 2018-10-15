package institution.interlink;

import java.util.ArrayList;
import java.util.List;

import institution.University;
import person.Student;
import person.consciousness.Knowledge;

public class Internship {
    private String internshipName;
    private int averageKnowledge;  
    public List<Student> internsList;

    public Internship(String name, int averageKnowledge) {
        this.internshipName = name;
        this.averageKnowledge = averageKnowledge;
        this.internsList = new ArrayList<Student>();
    }

    public void setStudent(Student student) {
		if(student.getKnowledge() > this.averageKnowledge){
            internsList.add(student);
        }
    }

    public String getStudents(){
    	String students = "";
        for (Student student : this.internsList) {
            students += student.getStudentName() + "\n";
        }
        return students;
    }
}

