package Bank

import scala.io.StdIn

case class Bank (accNo : Int ,name : String , amount :Int ){
//  var list = List[Bank]

}

object Bank{
  var list :List[Bank] = List.empty

  def main(args: Array[String]): Unit = {



    start()
  }

  def existingCustomer(): Unit ={
    println("enter your credentials")
    print("enter AccNo. :- " )
    val accNo = StdIn.readInt()
  }

  def newCustomer(): Unit = {
    print("enter the good name Sir :- ")
    var name = StdIn.readLine()
    var accNo: Int = list.size + 1
    println("with how much money you want to open your account :- ")
    var amount = StdIn.readInt()
    var customer = Bank(accNo, name, amount)
    list = list :+ customer

    println(s"here is your bank details:- name = ${customer.name} and Accno. = ${customer.accNo} and amount = ${customer.amount}")


  }


  def start(): Unit ={
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
}
