package institution;

import java.util.ArrayList;
import java.util.List;

import person.Student;
import person.consciousness.Knowledge;

public class University {
    private String universityName;
    public List<Student> studentsList;
    public int averageKnowledge;
    
    
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

    public void updateAverage(){
    	int averageLevel = 0;
        for(int i=0; i<studentsList.size(); i++){
            averageLevel += studentsList.get(i).getKnowledge();
        }
        averageKnowledge= averageLevel / studentsList.size();
    }    

    public int getAverageKnowledge() {
        return averageKnowledge;
    }
}
