object Lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(50); 
  val empty: List[Nothing] = List();System.out.println("""empty  : List[Nothing] = """ + $show(empty ));$skip(29); 
  var a = List(3.0, "Hello");System.out.println("""a  : List[Any] = """ + $show(a ));$skip(34); 
  var x1 = List(1, 2, 3, 4, 5, 6);System.out.println("""x1  : List[Int] = """ + $show(x1 ));$skip(45); 
  var x2 = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: Nil;System.out.println("""x2  : List[Int] = """ + $show(x2 ));$skip(30); 
  var x3 = List.range(10, 20);System.out.println("""x3  : List[Int] = """ + $show(x3 ));$skip(32); 
  var x4 = List.range(3, 21, 3);System.out.println("""x4  : List[Int] = """ + $show(x4 ));$skip(64); 

  // merge lists using ::: or List.concat
  var x5 = x1 ::: x3;System.out.println("""x5  : List[Int] = """ + $show(x5 ));$skip(32); 

  var x6 = List.concat(x1, x3);System.out.println("""x6  : List[Int] = """ + $show(x6 ));$skip(22); 
  x1.foreach(println);$skip(14); 
  var sum = 0;System.out.println("""sum  : Int = """ + $show(sum ));$skip(23); 
  x1.foreach(sum += _);$skip(15); 
  println(sum);$skip(86); 

  var rainbow = List("red", "orange", "yellow", "green", "blue", "indigo", "violet");System.out.println("""rainbow  : List[String] = """ + $show(rainbow ));$skip(32); 
  for (c <- rainbow) println(c);$skip(23); 
   var z = x1.map(_*2);System.out.println("""z  : List[Int] = """ + $show(z ))}
}
