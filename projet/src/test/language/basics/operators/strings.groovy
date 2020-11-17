package test.language.basics.operators

def c2 = 'c'
println c2.class

def str2 = 'this is a string'
println str2.class

String name="Alex"

def str3 = "this is a string ${name}"
println str3.class


String msg2 = "Hello ${name}"
println msg2

String msg3 = 'Hello ${name}'
println msg3

String msg4 = "We can evaulate expressions here: ${1 + 1}"
println msg4

// multiline strings

def aLargeMsg = """
A 
Msg
goes 
here and 
keeps going ${1+1}
"""


def aLargeMsg2 = '''
A 
Msg
goes 
here and 
keeps going ${1+1}
'''

println aLargeMsg

// slashy
def folder = /C:\groovy\dan\foo\bar/
println folder

// dollar slashy
def folder2 = $/C:\groovy/\dan\foo\bar/$
println folder


def date = "April, 1st"

def dollarSlashy = $/
    Hello $name,
    today we're ${date}.

    $ dollar sign
    $$ escaped dollar sign
    \ backslash
    / forward slash
    $/ escaped forward slash
    $$$/ escaped opening dollar slashy
    $/$$ escaped closing dollar slashy
/$
println dollarSlashy
