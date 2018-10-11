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
        for (let intern of this.internshipStudents){
            console.log(`    ${intern.getName()} \t \t ${intern.getKnowledge()}`)
        }
    }
}
module.exports = Internship;