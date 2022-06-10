package compaionOnject

object CompanionObjectExample {
  def main(args: Array[String]): Unit = {
    CompanionObject.func

    val companionObject:CompanionObject = new CompanionObject(3)
    companionObject.func
  }
}
