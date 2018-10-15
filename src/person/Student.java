package person;

import person.consciousness.Knowledge;

public class Student {
    private String studentName;
    private Knowledge studentKnowledge;

    public Student(String studentName, int level) {
        //Constructor
        this.studentName = studentName;
        this.studentKnowledge = new Knowledge(level);
    }

    public void setKnowledge(Knowledge knowledge) {
        //Sets knowledge???
    }

    public int getKnowledge(){
        return this.studentKnowledge.getLevel();
    }
    
    public String getStudentName() {
    	return this.studentName;
    }
}
