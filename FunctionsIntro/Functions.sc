object Functions {
  val x = println(2)                              //> 2
                                                  //| x  : Unit = ()
  def printHello(i:String) = "Hello " + i         //> printHello: (i: String)String
  printHello("Zack")                              //> res0: String = Hello Zack
  
  def Hello() = {"Hello world!"}                  //> Hello: ()String
  Hello()                                         //> res1: String = Hello world!
  
  def add(x:Int, y:Int):Int = x + y               //> add: (x: Int, y: Int)Int
  add(8,7)                                        //> res2: Int = 15
}