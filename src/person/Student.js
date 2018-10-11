var Knowledge = require('./consciousness/Knowledge');

class Student {
    constructor(studentName, level) {
        this.studentName = studentName;
        this.studentKnowledge = new Knowledge(level)
    }

    setKnowledge(knowledge) {
        //Sets knowledge???
    }

    getKnowledge(){
        return this.studentKnowledge.getLevel();
    }
    getName(){
        return this.studentName;
    }
}
module.exports = Student;