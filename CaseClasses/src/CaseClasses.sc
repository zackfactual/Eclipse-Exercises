object CaseClasses {
  // define case class with default values
  case class Money(val amount: Int = 1, val currency: String = "USD") {
  		// override operation with "+" function
    def +(other: Money): Money = Money(amount + other.amount)
  }

  // instantiation of case class doesn't require use of new keyword
  
  // supply some, no, or all params
  val defaultAmount = Money()                     //> defaultAmount  : CaseClasses.Money = Money(1,USD)
  val fiveDollars = Money(5)                      //> fiveDollars  : CaseClasses.Money = Money(5,USD)
  val alsoFiveDollars = Money(5, "USD")           //> alsoFiveDollars  : CaseClasses.Money = Money(5,USD)
  val euros = Money(currency = "EUR")             //> euros  : CaseClasses.Money = Money(1,EUR)
	
	// copy command to create new object, while optionally altering params
  val tenEuros = euros.copy(10)                   //> tenEuros  : CaseClasses.Money = Money(10,EUR)
  val tenDollars = tenEuros.copy(currency = "USD")//> tenDollars  : CaseClasses.Money = Money(10,USD)
	
	// create objects with a list
  val moneyList = List(Money(), Money(50, "GBP"), Money(45, "EUR"))
                                                  //> moneyList  : List[CaseClasses.Money] = List(Money(1,USD), Money(50,GBP), Mon
                                                  //| ey(45,EUR))
	// use overridden + operation
  println("add 10 + 15: " + { Money(10, "USD") + Money(15, "USD") })
                                                  //> add 10 + 15: Money(25,USD)
}