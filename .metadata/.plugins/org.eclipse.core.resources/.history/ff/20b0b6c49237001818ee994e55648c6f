object SpecialFunctions {
  ((x:Int) => x+1) (5)                            //> res0: Int = 6
  
  // helper, anonymous, or lambda functions can be assigned to a variable
  val f = ((x:Int) => x+1)                        //> f  : Int => Int = SpecialFunctions$$$Lambda$9/93122545@7c30a502
  
  // functions have an implicit apply method
  f.apply(5)                                      //> res1: Int = 6
  f(5)                                            //> res2: Int = 6
  
  val doubler = (i:Int)=>{i*2}                    //> doubler  : Int => Int = SpecialFunctions$$$Lambda$10/1239731077@2133c8f8
  doubler(6)                                      //> res3: Int = 12
  
  	// higher order functions take other functions as parameters or result in a function
  def someOperation(f:(Int, Int)=>Int){
  		println(f(5,5))}                  //> someOperation: (f: (Int, Int) => Int)Unit
  	val add = (x:Int, y:Int) => x + y         //> add  : (Int, Int) => Int = SpecialFunctions$$$Lambda$11/997110508@1e643faf
  	someOperation(add)                        //> 10
  	
  	def greeting() = (name:String) => {"Hello " + name}
                                                  //> greeting: ()String => String
  	val g = greeting()                        //> g  : String => String = SpecialFunctions$$$Lambda$12/1854778591@7a79be86
  	g("Zack")                                 //> res4: String = Hello Zack
  	
  	// closure functions return values depend on value(s) of >= 1 variables declared outside the function
  	var y = 5                                 //> y  : Int = 5
  	val multiplier = (x:Int) => x*y           //> multiplier  : Int => Int = SpecialFunctions$$$Lambda$13/1531333864@57829d67
  	multiplier(4)                             //> res5: Int = 20
}