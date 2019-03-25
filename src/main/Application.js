var University = require('../institution/University');
var Internship = require('../institution/interlink/Internship');
var Student = require('../person/Student');
var fs = require('fs');
var file = fs.readFileSync('../students.txt').toString().split('\r\n');
var studentsArray = [];

for (let line of file){
    studentsArray.push(line.split(','));
}


var university = new University("CH.U.I.");
for (let student of studentsArray){
    university.addStudent(new Student(student[0], student[1]));
}


var internship = new Internship("Interlink", university.getAverage());
    for(let student of university.studentsList){
        internship.setStudent(student);
    }
    console.log(`\nAverage knowledge of students is ${Math.round(university.averageKnowledge)}`)
    console.log("List of internship's students:");
    console.log(internship.getStudents());
