object CaseClasses {
  // define case class with default values
  case class Money(val amount: Int = 1, val currency: String = "USD") {
  		// override operation with "+" function
    def +(other: Money): Money = Money(amount + other.amount)
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(383); 

  // instantiation of case class doesn't require use of new keyword
  
  // supply some, no, or all params
  val defaultAmount = Money();System.out.println("""defaultAmount  : CaseClasses.Money = """ + $show(defaultAmount ));$skip(29); 
  val fiveDollars = Money(5);System.out.println("""fiveDollars  : CaseClasses.Money = """ + $show(fiveDollars ));$skip(40); 
  val alsoFiveDollars = Money(5, "USD");System.out.println("""alsoFiveDollars  : CaseClasses.Money = """ + $show(alsoFiveDollars ));$skip(38); 
  val euros = Money(currency = "EUR");System.out.println("""euros  : CaseClasses.Money = """ + $show(euros ));$skip(106); 
	
	// copy command to create new object, while optionally altering params
  val tenEuros = euros.copy(10);System.out.println("""tenEuros  : CaseClasses.Money = """ + $show(tenEuros ));$skip(51); 
  val tenDollars = tenEuros.copy(currency = "USD");System.out.println("""tenDollars  : CaseClasses.Money = """ + $show(tenDollars ));$skip(101); 
	
	// create objects with a list
  val moneyList = List(Money(), Money(50, "GBP"), Money(45, "EUR"));System.out.println("""moneyList  : List[CaseClasses.Money] = """ + $show(moneyList ));$skip(100); 
	// use overridden + operation
  println("add 10 + 15: " + { Money(10, "USD") + Money(15, "USD") })}
}
