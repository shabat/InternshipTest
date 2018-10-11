var University = require('../institution/University');
var Internship = require('../institution/interlink/Internship');
var Student = require('../person/Student');

var university = new University("CH.U.I.");
    university.addStudent(new Student("Andrew Kostenko", 59));
    university.addStudent(new Student("Julia Veselkina", 35));
    university.addStudent(new Student("Maria Perechrest", 66));
    university.addStudent(new Student("Peter Petrov", 29));
    university.addStudent(new Student("Oleg Urbanovich", 96));
    university.addStudent(new Student("Samuel Samsonov", 74));
    university.addStudent(new Student("Johnatan Johnson", 87));

var internship = new Internship("Interlink", university.getAverage());
    for(let student of university.studentsList){
        internship.setStudent(student);
    }
    console.log(`\nAverage knowledge of students is ${Math.round(university.averageKnowledge)}`)
    console.log("List of internship's students:");
    console.log(internship.getStudents());
