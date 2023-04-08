package Project

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

 private trait OtherService{  // private trait access onl in same file,if protected access in any file in same package
  def withdraw(AccNo:Int,amt :Int): Unit
  def addAmount(AccNo:Int,amt:Int):Unit

}

 private object Bank extends OtherService {
  private var list :ListBuffer[Banking] = ListBuffer.empty
  case class Banking(accNo: Int, name: String, amount: Int)

  override def withdraw(AccNo: Int, amt: Int): Unit = {


    var result = list.indexWhere(_.accNo == AccNo)
    if (list(result).amount < amt) {
      print("oops, it seems like you don't have enough money")
      return -1
    }
    else {
      list(result).amount - amt
      print("Amount withdraw successfully, Enjoy Sir")
    }

  }

  override def addAmount(AccNo: Int, amt: Int): Unit = {
    var result = list.indexWhere(_.accNo == AccNo)
    list(result).amount + amt
    print("money added successfully, visit again Sir")
  }

  private def existingCustomer(): Unit ={
    println("enter your credentials")
    print("enter AccNo. :- " )
    val accNo = StdIn.readInt()
    var index = list.indexWhere(_.accNo==accNo)
    var customer = list(index)
    println(s"welcome ${list(index).name}")
    println(s"your balance is :- ${customer.amount}")
    services(accNo)
  }

  private def newCustomer(): Banking = {
    print("enter the good name Sir :- ")
    var name = StdIn.readLine()
    var accNo: Int = list.size + 1
    println("with how much money you want to open your account :- ")
    var amount = StdIn.readInt()
    var customer = Banking(accNo, name, amount)
    list += customer

    println(s"here is your bank details:- name = ${customer.name} and Accno. = ${customer.accNo} and amount = ${customer.amount}")
    services(accNo)

    customer
  }

  private def services(accNo:Int): Unit ={   // private, so only in this class we can access this method
    println("if you want any other services press 'S' ")
    var serviceInput = StdIn.readLine()
    if (serviceInput.equals("s")) {

      println("if you want to withdraw money press 'w' and if you want to add press 'A' ")
      var input = StdIn.readLine()
      if (input.equals("w")) {
        println("enter the amount you want to withdraw")
        withdraw(accNo, amt = StdIn.readInt())

      }
      if (input.equals("a")) {
        println("enter the amount you want to add")
        addAmount(accNo, StdIn.readInt())
      }
    }

  }
  protected def start(): Unit ={   // protected, only this class or subclass can access it
    println("Greeting of the day")
    println("Press 'Y' If you are existing customer, 'N' for new Customer")
    val input = StdIn.readLine()
    if(input.equals("y") || input.equals("yes") ){
      existingCustomer()
    }
    if(input.equals("n")){
      newCustomer()
    }
  }

  def main(args: Array[String]): Unit = {
    start()
  }
}

class customer {
  Bank.withdraw(1,199)
//  Bank.start()   // hence this is not accessible because Start()method is declared prtected only same class or subclass can access it
}
