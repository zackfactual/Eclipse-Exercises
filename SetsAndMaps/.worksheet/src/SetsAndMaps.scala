object SetsAndMaps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  val fruit = Set("apple","orange","peach","banana", 1, 2, 3);System.out.println("""fruit  : scala.collection.immutable.Set[Any] = """ + $show(fruit ));$skip(49); val res$0 = 
	// default function is contains
	fruit("peach");System.out.println("""res0: Boolean = """ + $show(res$0));$skip(17); val res$1 = 
	fruit("potato");System.out.println("""res1: Boolean = """ + $show(res$1));$skip(68); 
	
	// sets cannot have duplicates
	var s = Set(1,2,3,4,5,5,4,3,2,1);System.out.println("""s  : scala.collection.immutable.Set[Int] = """ + $show(s ));$skip(27); 
	
	// add to a set
	s += 6;$skip(12); 
	println(s);$skip(32); 
	
	// remove from a set
	s -= 6;$skip(12); 
	println(s);$skip(65); 
	
	
	if(s.isEmpty) println("Set was empty") else println(s.head);$skip(19); 
	
	println(s.tail);$skip(14); val res$2 = 
	
	fruit ++ s;System.out.println("""res2: scala.collection.immutable.Set[Any] = """ + $show(res$2));$skip(22); 
  val s1 = Set(1,2,3);System.out.println("""s1  : scala.collection.immutable.Set[Int] = """ + $show(s1 ));$skip(53); val res$3 = 
  
  // check for overlap between two sets
  s1.&(s);System.out.println("""res3: scala.collection.immutable.Set[Int] = """ + $show(res$3));$skip(81); 
  
  // maps
  var g = Map(1 -> "Milk", 2 -> "Bread", 3 -> "Juice", 4 -> "Eggs");System.out.println("""g  : scala.collection.immutable.Map[Int,String] = """ + $show(g ));$skip(38); val res$4 = 
  // retrieve element from map
  g(1);System.out.println("""res4: String = """ + $show(res$4));$skip(49); 
 
 	// add to map
  g = g + (5 -> "Hash Browns");$skip(13); 
  println(g);$skip(14); val res$5 = 
  
  g.get(6);System.out.println("""res5: Option[String] = """ + $show(res$5));$skip(29); val res$6 = 
  g.getOrElse(6, "No match");System.out.println("""res6: String = """ + $show(res$6))}
}
