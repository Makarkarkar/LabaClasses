class Words(){
    init{
        println("Класс Words был создан!")
    }
}
class Message constructor(username: String){
    var username: String
    fun introduce(){
        println("Привет, меня зовут ${username}")
    }
    init{
        this.username = username
    }
}
open class Animal constructor(food:String, location: String){
    var food: String
    var location: String
    init {
        this.food = food
        this.location = location
    }
    open fun makeNoise(){
        println("Такое-то животное не шумит")
    }
    open fun eat(){
        println("Такое-то животное ест")
    }
    fun sleep(){
        println("Животное спит")
    }
}
class Dog(food: String, location: String, size: String) : Animal(food, location) {
    override fun makeNoise(){
        println("Собака не шумит")
    }
    override fun eat(){
        println("Собака ест ${food}")
    }
}
class Cat(food: String, location: String, color: String) : Animal(food, location) {
    override fun makeNoise(){
        println("Кот не шумит")
    }
    override fun eat(){
        println("Кот ест ${food}")
    }
}
class Horse(food: String, location: String, height: String) : Animal(food, location) {
    override fun makeNoise(){
        println("Конь не шумит")
    }
    override fun eat(){
        println("Конь ест ${food}")
    }
}
class Veterinarian() {
    fun treatAnimal(animal: Animal){
        println("${animal.food}, ${animal.location}")
    }

}
fun main(args: Array<String>) {
    //val words = Words()
//    val message = Message("Makar")
//    message.introduce()
//    val horse = Horse("Овес","Поле", "132")
//    val cat = Cat("Корм для котов","Квартира", "Красный")
//    val dog = Dog("Корм для собак","Дом", "большой")
//    val veterinarian = Veterinarian()
//    val animals: List<Animal> = listOf(horse,cat,dog)
//    animals.forEach(){
//        veterinarian.treatAnimal(it)
//    }
}