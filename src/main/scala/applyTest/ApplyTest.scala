package applyTest

object ApplyTest {
  def main(args: Array[String]): Unit = {
    println(ApplyObject(3, 1))
    val applyObject = new ApplyObject
    println(applyObject(2, 4))
  }

}

object ApplyObject {
  def apply(arg1:Int, arg2:Int): Int= {
    arg1 + arg2
  }

}
class ApplyObject{
  def apply(arg1:Int, arg2:Int) ={
    arg1 * arg2
  }

}

