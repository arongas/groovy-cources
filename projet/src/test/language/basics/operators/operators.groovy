package test.language.basics.operators

// Arithmetic operators
assert 10 + 1 == 11
assert 10 - 1 == 9
assert 10 * 2 == 20
assert 10 / 5 == 2
assert 10 % 3 == 1
assert 10 ** 2 == 100

// Comparison operators
assert 1 + 2 == 3
assert 3 != 4
assert -2 < 3
assert 2 <= 2
assert 5 > 1
assert 5 >= -2

// Logical Operators

assert !false
assert true && true
assert true || false

// Ternary Operator

String s = ""
result = ( s != null && s.length() > 0 ) ? 'Found' : 'Not Found'
displayName = user.name ? user.name : 'Anonymous'
displayName = user.name ?: 'Anonymous'
