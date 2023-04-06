package ClassesAndMore

private case class BankAccount(AccNo : Int , var Balance : Int = 0, InterestRate : Int) {


  def deposit(amount: Int): Unit = {
//    new BankAccount(AccNo, Balance + amount, InterestRate)

    this.Balance+=amount

    println("Hurray! amount added successfully")

  }

  def withdrow(amount: Int): Unit = {
//    new BankAccount(AccNo, Balance - amount, InterestRate)
    this.Balance-=amount
    println("Hope you are happy with our service")
  }

  def calculateInterest(): Int = {

    var result = this.Balance * this.InterestRate / 100
    result

  }
}
  object Account{
    def main(args: Array[String]): Unit = {

      var person:List[BankAccount] = List(BankAccount(1,10000,10))


      person(0).deposit(500)
      println(person(0).Balance)
      println(person(0).calculateInterest())
      println(person)




    }
  }

class another{

  def print(): Unit ={
    var ans = new BankAccount(2,0,10)
    
  }
}


