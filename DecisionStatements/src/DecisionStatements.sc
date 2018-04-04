object DecisionStatements {
  // if
  var hoursWorked = 40                            //> hoursWorked  : Int = 40
  var rate = 10                                   //> rate  : Int = 10

  def earnings(h: Double): Double = {
    if (h <= 40)
      h * rate
    else
      (h - 40) * rate * 1.5 + 40 * rate
  }                                               //> earnings: (h: Double)Double

  println("$" + earnings(hoursWorked))            //> $400.0
  println("$" + earnings(30))                     //> $300.0
  println("$" + earnings(45))                     //> $475.0

  // else if
  var x = 5                                       //> x  : Int = 5
  if (x < 0)
    println("negative")
  else if (x == 0)
    println("zero")
  else
    println("positive")                           //> positive

  // match
  val day1 = "FRI"                                //> day1  : String = FRI
  val day2 = "SAT"                                //> day2  : String = SAT
  val day3 = "AAA"                                //> day3  : String = AAA

  val result = day3 match {
    case "MON" | "TUE" | "WED" | "THU" | "FRI" => "weekday"
    case "SAT" | "SUN"                         => "weekend"
    case _                                     => "invalid day"
  }                                               //> result  : String = invalid day
  println(result)                                 //> invalid day
}