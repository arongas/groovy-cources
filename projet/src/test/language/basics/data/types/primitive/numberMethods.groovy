package test.language.basics.data.types.primitive

// times | upto | downto | step

20.times {
    print '-'
}

1.upto(10) { num ->
    println num
}

10.downto(1) { num ->
    println num
}

0.step(1,0.1) { num ->
    println num
}
