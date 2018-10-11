var University = require('../University');
var Student = require('../../person/Student');

class Internship {
    constructor(name, averageKnowledge) {
        this.internshipName = name;
        this.internshipStudents = [];
        this.averageKnowledge = averageKnowledge;
    }

    setStudent(student) {
        if(student.getKnowledge() > this.averageKnowledge){
            this.internshipStudents.push(student);
        }
    }

    getStudents() {
        var eligebleStudents = '';
        for (let j of this.internshipStudents){
            eligebleStudents += j.getName();
        }
    }
}
module.exports = Internship;