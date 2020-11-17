package test.language.basics.operators

//Non-empty Collections and arrays are true
assert [1, 2, 3]
assert ![]

// Iterators and Enumerations with further elements are coerced to true.
assert [0].iterator()
assert ![].iterator()
Vector v = [0] as Vector
Enumeration enumeration = v.elements()
assert enumeration
enumeration.nextElement()
assert !enumeration

//Non-empty Maps are evaluated to true.
assert ['one' : 1]
assert ![:]

// Non-empty Strings, GStrings and CharSequences are coerced to true.
assert 'a'
assert !''
def nonEmpty = 'a'
assert "$nonEmpty"
def empty = ''
assert !"$empty"

//Non-zero numbers are true.
assert 1
assert 3.5
assert !0

//Non-null object references are coerced to true.
assert new Object()
assert !null


def str = 'example of method reference'
def fun = str.&toUpperCase
def upper = fun()
assert upper == str.toUpperCase()

assert 6G == [1G, 2G, 3G].stream().reduce(0G, BigInteger::add)
println 6G.class.getName()
