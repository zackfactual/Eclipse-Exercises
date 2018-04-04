object DecisionStatements {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  // if
  var hoursWorked = 40;System.out.println("""hoursWorked  : Int = """ + $show(hoursWorked ));$skip(16); 
  var rate = 10;System.out.println("""rate  : Int = """ + $show(rate ));$skip(124); 

  def earnings(h: Double): Double = {
    if (h <= 40)
      h * rate
    else
      (h - 40) * rate * 1.5 + 40 * rate
  };System.out.println("""earnings: (h: Double)Double""");$skip(40); 

  println("$" + earnings(hoursWorked));$skip(30); 
  println("$" + earnings(30));$skip(30); 
  println("$" + earnings(45));$skip(26); 

  // else if
  var x = 5;System.out.println("""x  : Int = """ + $show(x ));$skip(107); 
  if (x < 0)
    println("negative")
  else if (x == 0)
    println("zero")
  else
    println("positive");$skip(31); 

  // match
  val day1 = "FRI";System.out.println("""day1  : String = """ + $show(day1 ));$skip(19); 
  val day2 = "SAT";System.out.println("""day2  : String = """ + $show(day2 ));$skip(19); 
  val day3 = "AAA";System.out.println("""day3  : String = """ + $show(day3 ));$skip(217); 

  val result = day3 match {
    case "MON" | "TUE" | "WED" | "THU" | "FRI" => "weekday"
    case "SAT" | "SUN"                         => "weekend"
    case _                                     => "invalid day"
  };System.out.println("""result  : String = """ + $show(result ));$skip(18); 
  println(result)}
}
