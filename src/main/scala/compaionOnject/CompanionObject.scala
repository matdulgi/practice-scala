package compaionOnject
object CompanionObject {
  def func: Unit = {
    println("it's object")
  }

}

class CompanionObject(numb:Int) {
  def func: Unit = {
    println("it's " + numb + " class")
  }

}
