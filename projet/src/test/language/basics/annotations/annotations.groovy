package test.language.basics.annotations

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.Sortable
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@TupleConstructor
@ToString
@EqualsAndHashCode

class Person {
    String firstname
    String lastName
    int age
}

@Singleton
@ToString
class Universe{
    def planets=[]
}

Person p1=new Person("Alex")
Person p2=new Person("Alex", "Rongas")
Person p3=new Person("Alex", "Rongas", 40)

Universe.instance.planets<<"earth"

println Universe.instance



@Sortable
@Canonical
class TeamMember{
    String first
    String last
    Integer born
}

List<TeamMember> teamMembers=[]
teamMembers << new TeamMember("Alex", "Rongas", 40)
teamMembers << new TeamMember("Alex", "Rongas", 45)
teamMembers << new TeamMember("Alex", "Rongas", 39)

// Use toSorted() method to sort
final List<TeamMember> sorted = teamMembers.toSorted()
println sorted.first()
println sorted.last()
println sorted
println teamMembers
