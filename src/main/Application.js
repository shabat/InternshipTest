var University = require('../institution/University');
var Internship = require('../institution/interlink/Internship');
var Student = require('../person/Student');

    var studentsList = [];
    studentsList.push(new Student("Andrew Kostenko", 59));
    studentsList.push(new Student("Julia Veselkina", 35));
    studentsList.push(new Student("Maria Perechrest", 66));
    studentsList.push(new Student("Peter Petrov", 29));
    studentsList.push(new Student("Oleg Urbanovich", 96));
    studentsList.push(new Student("Sam Samsonov", 74));
    studentsList.push(new Student("John Johnson", 87));

    var university = new University("CH.U.I.");

    var internship = new Internship("Interlink");
    console.log("List of internship's students:");
    console.log(internship.getStudents());

