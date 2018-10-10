package institution;

import java.util.ArrayList;
import java.util.List;

import person.Student;
import person.consciousness.Knowledge;

public class University {
    private String universityName;
    private List<Student> studentsList;
    private Knowledge averageKnowlede;

    public University(String name) {
        //Constructor
        this.universityName = name;
        this.studentsList = new ArrayList<Student>();
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
    }

    public void addStudent(Student student) {
        studentsList.add(student);
        updateAverage();
    }

    private void updateAverage(){
        int averageLevel = 0;
        for(Student j : studentsList){
            averageLevel = j.getKnowledge() + averageLevel;
        }
        averageKnowlede.setLevel((int) averageLevel / listOfStudents.size());
    }

    public int getAverageKnowledge() {
        return this.averageKnowlede.getLevel();
    }
}
