fun main() {
    var people=Human("Jane",23,53)
people.eat(10)
    people.speak("shorty is short")
    people.birthday()
    var details= User("sande","oyuga","miriamsandeoyuga@gmail.com",111817308,"samina")
println(details.firstName)
    println(details.password)

}
class Human(var name: String,var age:Int,var weight:Int) {

    fun eat(foodWeight: Int) {
        weight += foodWeight
        println("I am eating $foodWeight kg of food")


    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        println (age+1)
    }

}
data class User(var firstName:   String,var lastName:String,var email:String,var phoneNumber: Int,var password: String)
