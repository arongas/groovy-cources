package test.language.basics.closure

class Scope{
    def outerClosure = {
        println this.getClass().getName()
        println owner.getClass().getName()
        println delegate.getClass().getName()
        def innerClosure = {
            println this.getClass().getName()
            println owner.getClass().getName()
            println delegate.getClass().getName()
        }
        innerClosure()
    }
}

Scope sc=new Scope()
sc.outerClosure()




def writer ={
    append "Book: $it\n"
}
StringBuilder sb=new StringBuilder("My books:\n")
writer.delegate=sb
writer.resolveStrategy=Closure.DELEGATE_FIRST
writer("Groovy")
writer("Java")
println sb

void append(String s){
    println s
}

