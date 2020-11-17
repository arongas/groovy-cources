package test.javaAndGroovy

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString;

@ToString(includePackage = false, includeNames = true)
@EqualsAndHashCode
class User2 {
    String firstName
    String lastName
    String email
    int age
    Date dob
    List<User> friends
    List<User> family
    List<User> coWorkers
}
