package test.language.basics.classes1

class Me extends Person{
    Me(){
        this.setFirstName("Alexandros")
        this.setLastName("Rongas")
    }
}


Person student=new Student(firstName: "Alex", lastName: "Rongas", age: 40,grade: "1st elementary")
println student

Developer developer=new Developer(firstName: "Alex", lastName: "Rongas", age: 40)
developer.languages << "Java"
developer.languages << "Groovy"

println developer
developer.work()

Me me=new Me()
println me

