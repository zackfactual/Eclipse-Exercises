object tuples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(49); 
  val tuple = (1, false, "Scala");System.out.println("""tuple  : (Int, Boolean, String) = """ + $show(tuple ));$skip(53); 
  val tuple2 = "computer" -> "Dell Pavilion Desktop";System.out.println("""tuple2  : (String, String) = """ + $show(tuple2 ));$skip(25); 
  val second = tuple2._2;System.out.println("""second  : String = """ + $show(second ));$skip(21); 

  val t = "a" -> 25;System.out.println("""t  : (String, Int) = """ + $show(t ));$skip(21); 
  val t2 = ("a", 25);System.out.println("""t2  : (String, Int) = """ + $show(t2 ));$skip(58); 

  def div10(n: Int): Tuple2[Int, Int] = (n / 10, n % 10);System.out.println("""div10: (n: Int)(Int, Int)""");$skip(31); 
  val (tens, ones) = div10(85);System.out.println("""tens  : Int = """ + $show(tens ));System.out.println("""ones  : Int = """ + $show(ones ));$skip(33); 
  println("tens digit: " + tens);$skip(33); 
  println("ones digit: " + ones)}
}
