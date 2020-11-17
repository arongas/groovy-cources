package test.language.basics.closure

def c = {}
println c.getClass().getName()
println c instanceof Closure

def sayHello = {
    println "Hello"
}

def sayHelloWithName = { name, lastname ->
    println "Hello $name $lastname"
}

sayHello()
sayHelloWithName("Alex", "Rongas")


List nums=[1,2,3,4,5]

nums.each({
    println it
})

nums.each(num->{
    println num
})




def timesTen(num,closure){
    closure(num *10)
}

timesTen(10,{println it})
timesTen(10) {println it}

def timesTwenty(num, closure1, closure2){
    closure1(num *10)
    closure2 (num *20)
}

timesTwenty(5) {println it} {println it}


10.times {println it}

//implicit param
def foo = { println it}
foo("Alex")
foo "Alex"

def noParams={ -> println "No params"}
noParams()

def sayHelloFull ={String first, String last -> println "Hello $first, $last"}
sayHelloFull("Alex", "Rongas")

def sayGreetingDefault ={
    name, greeting="Howdy" ->
        println "$greeting $name"
}

sayGreetingDefault("Alex", "Hello")
sayGreetingDefault("Alex")

def concat={String... args ->
    args.join(' ')
}

println concat("One","Little pig")


def printClosure(Closure c){
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def myClosure={ int x, int y -> x+y}

printClosure myClosure

List lst=[11,20,31,40,51]

lst.eachWithIndex{ int entry, int i -> println "$i: $entry"}

def even= lst.findAll {val->val%2==0}
println even


def numslst=[1,2,3,4,5,6]
def mult=numslst.collect {it*10}
println mult

