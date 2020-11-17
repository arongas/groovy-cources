package test.language.basics.collections

Range r = 0..10
println r
println r.class.name
println r.from
println r.to

assert r.contains(0)
assert r.contains(10)
assert !r.contains(-1)
assert !r.contains(11)

assert (0..<10).contains(0)
assert !(0..<10).contains(10)

println r.get(3)
println r.getFrom()
println r.getTo()
println r.isReverse()
println r.size()
println r.subList(2,5)


enum Days {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

def dayRange = Days.SUNDAY..Days.SATURDAY

dayRange.each { day ->
    println day
}

println dayRange.size()
println dayRange.contains(Days.WEDNESDAY)


def wednesday = Days.WEDNESDAY
def thursday = Days.THURSDAY
assert Days.THURSDAY == ++wednesday
assert Days.WEDNESDAY == --wednesday

assert Days.THURSDAY == wednesday.next()
assert Days.WEDNESDAY == thursday.previous()

