package test.language.basics.controls

def foo() {
    // do stuff
    throw new Exception("Foo Exception")
}

List log = []

try {
    foo()
} catch( Exception e ) {
    log << e.message
} finally {
    log << 'finally'
}

println log

try {
    // do stuff
} catch( FileNotFoundException | NullPointerException e ) {
    println e.class.name
    println e.message
}
