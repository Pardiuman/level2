package ClassesAndMore

trait info{

  def show(): Unit
  def close() :Unit
}

object Main extends info {

  override def show(): Unit = {
    println("here is your documents")

  }

  override def close(): Unit = {

    print("now your document is closed")
  }

  @main private def anther(): Unit ={
    Main.show()

  }




}




