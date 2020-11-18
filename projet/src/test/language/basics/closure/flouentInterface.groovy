package test.language.basics.closure

class Mailer {
    def test
    def to(String address) {
        println("to: $address")
    }

    def from(String address) {
        println("from: $address")
    }

    def subject(String subject) {
        println("subject: $subject")
    }

    def body(String msg) {
        println("body: $msg")
    }

    def static send(closure){
        Mailer mailer = new Mailer()
        println("sending...")
        mailer.with closure
        println "Test: $mailer.test"
    }
}


Mailer.send {
    to("a.rongas@gmail.com")
    from("tus@gmail.com")
    subject("Hello Alex")
    body("Sto ena xeri....?")
    test="This is my test"
}
