object Arrays {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  var movies: Array[String] = new Array[String](5);System.out.println("""movies  : Array[String] = """ + $show(movies ));$skip(55); 
  movies(0) = "Hambre Pabtre and the Sorcerer's Stone";$skip(67); 
  var furniture = Array("Chair", "Sofa", "Table", "Bed", "Rocker");System.out.println("""furniture  : Array[String] = """ + $show(furniture ));$skip(18); 
  println(movies);$skip(20); 
	println(movies(0));$skip(20); 
	println(furniture);$skip(24); 
  println(furniture(0));$skip(74); 
  
  def print(strArray:Array[String]):Unit = {strArray.foreach(println)};System.out.println("""print: (strArray: Array[String])Unit""");$skip(16); 
  print(movies);$skip(19); 
  print(furniture);$skip(32); 
  var t = new Array[AnyVal] (3);System.out.println("""t  : Array[AnyVal] = """ + $show(t ));$skip(11); 
  t(0) = 1;$skip(14); 
  t(1) = true;$skip(13); 
  t(2) = 3.0;$skip(24); 
  
  t.foreach(println);$skip(11); 
  t(0) = 5;$skip(21); 
 	t.foreach(println)}
}
