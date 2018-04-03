object MyWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(6); val res$0 = 
  2+3;System.out.println("""res0: Int(5) = """ + $show(res$0));$skip(12); 
  var x = 5;System.out.println("""x  : Int = """ + $show(x ));$skip(29); 
  var odds = List(1,3,5,7,9);System.out.println("""odds  : List[Int] = """ + $show(odds ));$skip(27); 
  val str = "Scala Rocks!";System.out.println("""str  : String = """ + $show(str ));$skip(19); 
  val letter = 'A';System.out.println("""letter  : Char = """ + $show(letter ));$skip(10); val res$1 = 
  1 to 20;System.out.println("""res1: scala.collection.immutable.Range.Inclusive = """ + $show(res$1));$skip(15); 
  var y = true;System.out.println("""y  : Boolean = """ + $show(y ));$skip(19); 
  var pi = 3.14159;System.out.println("""pi  : Double = """ + $show(pi ));$skip(30); 
  def add(n:Int, m:Int) = n+m;System.out.println("""add: (n: Int, m: Int)Int""");$skip(11); val res$2 = 
  add(5,6);System.out.println("""res2: Int = """ + $show(res$2))}
}
