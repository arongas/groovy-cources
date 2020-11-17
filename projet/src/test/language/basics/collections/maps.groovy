package test.language.basics.collections

def map = [:]
println map
println map.getClass().getName()

def person = [first:"Alex",last:"Rongas",email:"a.rongas@gmail.com"]
def number=3
def person2 = [(1):"Alex",(2):"Rongas",(number):"a.rongas@gmail.com"]


println person
println person.first
println person.twitter

println person2.get(1)
println person2[2]

person.twitter = "@a.rongas"
person['fathername']='Jonathan'
person.put('mothersName','Maria')
println person

person.remove('fathername')
println person


println person.size()
println person.sort()

// looping through person
for( entry in person ) {
    println entry
}

for( key in person.keySet() ) {
    println "$key:${person[key]}"
}

// each | eachWithIndex
person.each{entry -> println "$entry.key: $entry.value"}
person2.eachWithIndex{entry, i -> println "$i $entry.key: $entry.value"}



