package test.language.basics.collections

List nums = [1,2,3,6,7,9,4,5,3,6,8,9]
List nums2 = [1,2,3,6,7,9,4,5,3,6,8,9] as LinkedList
println nums
println nums.class.name
println nums2.class.name

// add | remove | get | clear

nums.push(99)
nums.putAt(0,77)
nums[0] = 78
nums + 7
nums << 66

nums.pop()
nums.removeAt(0)
def newList = nums - 3
println newList
println newList - [6,7,9]


println nums.getAt(0..3)

nums = []
nums.clear()


// flatten
nums << [3,4,5, [6,7,8, [9,10]]]
nums << [1,2]
println nums
println nums.flatten()

// equals
def myNumbers = [1,2,3]
def myNumbers2 = [1,2,3]
println myNumbers.equals(myNumbers2)

nums=nums.flatten()
// findAll
println nums.findAll { it == 4 }
println nums.findAll { it < 5 }


// getAt(Range)
println nums.getAt(0..5)

println nums;
// reverse list
println nums.reverse()

// unique
nums+= 2
println nums
println nums.unique()

// Java Collections List(LinkedList) (Set,SortedSet)
def evens = [10,2,8,4,24,14,2] as Set
println evens
println evens.class.name

