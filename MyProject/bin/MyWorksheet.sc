object MyWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  2+3                                             //> res0: Int(5) = 5
  var x = 5                                       //> x  : Int = 5
  var odds = List(1,3,5,7,9)                      //> odds  : List[Int] = List(1, 3, 5, 7, 9)
  val str = "Scala Rocks!"                        //> str  : String = Scala Rocks!
  val letter = 'A'                                //> letter  : Char = A
  1 to 20                                         //> res1: scala.collection.immutable.Range.Inclusive = Range 1 to 20
  var y = true                                    //> y  : Boolean = true
  var pi = 3.14159                                //> pi  : Double = 3.14159
  def add(n:Int, m:Int) = n+m                     //> add: (n: Int, m: Int)Int
  add(5,6)                                        //> res2: Int = 11
}