var Student = require('../person/Student');
var Knowledge = require('../person/consciousness/Knowledge');

class University {
    constructor(name) {
        this.universityName = name;
        this.studentsList = [];
    }

    addStudent(student) {
        this.studentsList.push(student);
        this.updateAverage();
    }

    updateAverage(){
        var averageLevel = 0;
        for(const j of this.studentsList){
            averageLevel = j.getKnowledge() + averageLevel;
        }
        this.averageKnowledge = averageLevel / this.studentsList.length;
    }

    getAverage() {
        return this.averageKnowledge;
    }
}
module.exports = University;