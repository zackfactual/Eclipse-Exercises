object SpecialFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(48); val res$0 = 
  ((x:Int) => x+1) (5);System.out.println("""res0: Int = """ + $show(res$0));$skip(104); 
  
  // helper, anonymous, or lambda functions can be assigned to a variable
  val f = ((x:Int) => x+1);System.out.println("""f  : Int => Int = """ + $show(f ));$skip(61); val res$1 = 
  
  // functions have an implicit apply method
  f.apply(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(7); val res$2 = 
  f(5);System.out.println("""res2: Int = """ + $show(res$2));$skip(34); 
  
  val doubler = (i:Int)=>{i*2};System.out.println("""doubler  : Int => Int = """ + $show(doubler ));$skip(13); val res$3 = 
  doubler(6);System.out.println("""res3: Int = """ + $show(res$3));$skip(152); 
  
  	// higher order functions take other functions as parameters or result in a function
  def someOperation(f:(Int, Int)=>Int){
  		println(f(5,5))};System.out.println("""someOperation: (f: (Int, Int) => Int)Unit""");$skip(37); 
  	val add = (x:Int, y:Int) => x + y;System.out.println("""add  : (Int, Int) => Int = """ + $show(add ));$skip(22); 
  	someOperation(add);$skip(59); 
  	
  	def greeting() = (name:String) => {"Hello " + name};System.out.println("""greeting: ()String => String""");$skip(22); 
  	val g = greeting();System.out.println("""g  : String => String = """ + $show(g ));$skip(13); val res$4 = 
  	g("Zack");System.out.println("""res4: String = """ + $show(res$4));$skip(122); 
  	
  	// closure functions return values depend on value(s) of >= 1 variables declared outside the function
  	var y = 5;System.out.println("""y  : Int = """ + $show(y ));$skip(35); 
  	val multiplier = (x:Int) => x*y;System.out.println("""multiplier  : Int => Int = """ + $show(multiplier ));$skip(17); val res$5 = 
  	multiplier(4);System.out.println("""res5: Int = """ + $show(res$5))}
}
