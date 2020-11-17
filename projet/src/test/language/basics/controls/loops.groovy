package test.language.basics.controls

// Looping
// --------------------------------------------

// while
List numbers = [1,2,3]
while( numbers ) {
    // do something
    numbers.remove(0)
}

assert numbers == []

// for
List nums = [1,2,3]

for( variable in nums ) {

}

for( Integer i in 1..10 ) {
    println i
}

for( i in 1..5 ) {

}


// return/break/continue

Integer a = 1
while( true ) { // infinite loop
    a++
    break
}
assert a == 2

for( String s in 'a'..'z' ){
    if( s == 'a') continue
    println s
    if( s > 'b' ) break
}


def list2 = [1,2,3,4]
list2.each { println it }
