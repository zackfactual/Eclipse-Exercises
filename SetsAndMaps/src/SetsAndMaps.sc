object SetsAndMaps {
  val fruit = Set("apple","orange","peach","banana", 1, 2, 3)
                                                  //> fruit  : scala.collection.immutable.Set[Any] = Set(peach, banana, 1, orange, 
                                                  //| 2, 3, apple)
	// default function is contains
	fruit("peach")                            //> res0: Boolean = true
	fruit("potato")                           //> res1: Boolean = false
	
	// sets cannot have duplicates
	var s = Set(1,2,3,4,5,5,4,3,2,1)          //> s  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
	
	// add to a set
	s += 6
	println(s)                                //> Set(5, 1, 6, 2, 3, 4)
	
	// remove from a set
	s -= 6
	println(s)                                //> Set(5, 1, 2, 3, 4)
	
	
	if(s.isEmpty) println("Set was empty") else println(s.head)
                                                  //> 5
	
	println(s.tail)                           //> Set(1, 2, 3, 4)
	
	fruit ++ s                                //> res2: scala.collection.immutable.Set[Any] = Set(peach, 5, banana, 1, orange,
                                                  //|  2, 3, apple, 4)
  val s1 = Set(1,2,3)                             //> s1  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  
  // check for overlap between two sets
  s1.&(s)                                         //> res3: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  
  // maps
  var g = Map(1 -> "Milk", 2 -> "Bread", 3 -> "Juice", 4 -> "Eggs")
                                                  //> g  : scala.collection.immutable.Map[Int,String] = Map(1 -> Milk, 2 -> Bread,
                                                  //|  3 -> Juice, 4 -> Eggs)
  // retrieve element from map
  g(1)                                            //> res4: String = Milk
 
 	// add to map
  g = g + (5 -> "Hash Browns")
  println(g)                                      //> Map(5 -> Hash Browns, 1 -> Milk, 2 -> Bread, 3 -> Juice, 4 -> Eggs)
  
  g.get(6)                                        //> res5: Option[String] = None
  g.getOrElse(6, "No match")                      //> res6: String = No match
}