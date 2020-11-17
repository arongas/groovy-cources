package test.language.basics.classes1

import groovy.transform.ToString

@ToString
class Person {
    String firstName=''
    def lastName=''
    int age
}

class Student extends Person{
    def grade
}

class Developer extends Person{
    def languages= []

    def work(){
        println "The developer $lastName,$firstName is working and knows the following programming languages: $languages"
    }
}
