package com.Project

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer
import scala.io.StdIn
import scala.util.matching.Regex.Match

 private trait OtherService{  // private trait access onl in same file,if protected access in any file in same package
  def withdraw(AccNo:Int,amt :Int): Unit
  def addAmount(AccNo:Int,amt:Int):Unit

}

case class Bank(accNo: Int, name: String, var amount: Int)

object Bank extends OtherService {
  private val list :ListBuffer[Bank] = ListBuffer.empty
  var accNo = 0

  override def withdraw(AccNo: Int, amt: Int): Unit = {
    val result = list.indexWhere(_.accNo == AccNo)
    if (list(result).amount < amt) {
      println("oops, it seems like you don't have enough money")
      return -1
    }
    else {
      list(result).amount -= amt
      println(s"Amount withdraw successfully,current balance is ${list(result).amount} Enjoy Sir")
    }

  }

  override def addAmount(AccNo: Int, amt: Int): Unit = {
    val result = list.indexWhere(_.accNo == AccNo)
    list(result).amount += amt
    println(s"money added successfully, current balance is${list(result).amount} visit again Sir")
  }

  private def existingCustomer(): Unit ={
    println("enter your credentials")
    print("enter AccNo. :- " )
    accNo = StdIn.readInt()
    val index = list.indexWhere(_.accNo==accNo)
    val customer = list(index)
    println(s"welcome ${list(index).name}")
    println(s"your balance is :- ${customer.amount}")
    services(accNo)
  }

  private def newCustomer(): Bank = {
    print("enter the good name Sir :- ")
    val name = StdIn.readLine()
    accNo = list.size + 1
    println("with how much money you want to open your account :- ")
    val amount = StdIn.readInt()
    val customer = Bank(accNo, name, amount)
    list += customer

    println(s"here is your bank details:- name = ${customer.name} and Accno. = ${customer.accNo} and amount = ${customer.amount}")
    services(accNo)

    customer
  }
   private def services(accNo:Int): Unit ={   // private, so only in this class we can access this method
    println("if you want any other services press 'S' ")
     val serviceInput = StdIn.readLine()
     if (serviceInput.equals("s")) {
       rec(accNo)
     }
      @tailrec
      def rec(accNo:Int): Unit ={
        println("if you want to withdraw money press 'w' and if you want to add press 'A' ")
        val input = StdIn.readLine()
        if (input.equals("w")) {
          println("enter the amount you want to withdraw")
          withdraw(accNo, amt = StdIn.readInt())

        }
        if (input.equals("a")) {
          println("enter the amount you want to add")
          addAmount(accNo, StdIn.readInt())
        }
        rec(accNo)
      }
    }
    protected def start(): Unit ={   // protected, only this class or subclass can access it
      println("Greeting of the day")
      println("Press 'Y' If you are existing customer, 'N' for new Customer")
      val input = StdIn.readLine()
      if(input.equalsIgnoreCase("y")){
        existingCustomer()
      }
      if(input.equalsIgnoreCase("n")){
        newCustomer()
      }
    }

  def main(args: Array[String]): Unit = {
    var one = Bank(1,"pardum",500)
    var two = Bank(2,"dhankhar",1000)
    list += one += two
    start()
  }
}

class customer {
  Bank.withdraw(1,199)
//  Bank.start()   // hence this is not accessible because Start()method is declared prtected only same class or subclass can access it
}
