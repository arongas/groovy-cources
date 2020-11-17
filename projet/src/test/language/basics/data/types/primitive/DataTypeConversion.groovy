package test.language.basics.data.types.primitive

//Converting Data Types

//1. Casting
def myFloat = (float) 1.0
println myFloat.class

// 2. Coercion

// Rules for +,-,*
// If either operand is a float or a double the result is a double
// If either operand is a BigInteger the result is a BigInteger
// If either operand is a Long the result is a Long
// If either operand is a Integer the result is an Integer
// If either operand is a big decimal the result is a big decimal

//println 5.0d - 4.1d
//def x=5.0d - 4.1d;
//x.getClass().getName()
//println 5-4.1
//def y=5-4.1
//println y.getClass().getName()


// Division
Float f = 5.25
Float d = 10.50

def result = d / f
println result
println result.class




def intDiv = 1 / 2
println intDiv // this is much different than Java where we would get 0
println intDiv.getClass().getName()
println 1.intdiv(2)

// 3. GDK
assert 2 == 2.5.toInteger() // conversion
assert 2 == 2.5 as Integer  // enforced coercion
assert 2 == (int) 2.5 // cast

assert '5.50'.isNumber()
assert 5 == '5'.toInteger()
