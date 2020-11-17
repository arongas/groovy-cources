package test.language.basics.operators

import groovy.transform.ToString

@ToString
class Bag{
    List<String> items=[]

    Bag plus(Bag other){
        new Bag(items:other.items+this.items)
    }

}

Bag bag1=new Bag()
bag1.items << 'USB stick'
bag1.items << 'Keys'
Bag bag2=new Bag()

bag2.items << 'Mouse'
bag2.items << 'Keyboard'

println bag1+bag2
