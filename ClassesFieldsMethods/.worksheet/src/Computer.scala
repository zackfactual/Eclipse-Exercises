object Computer {

  class Computer(val make: String, val model: String, val ram: String) {
    override def toString: String = ("[" + make + ", " + model + ", " + ram + "]\n")
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(378); 

  val computers = List(
    new Computer("Dell", "Laptop", "16GB"),
    new Computer("Dell", "Desktop", "32GB"),
    new Computer("Mac", "Mini", "8GB"),
    new Computer("HP", "Notebook", "16GB"));System.out.println("""computers  : List[Computer.Computer] = """ + $show(computers ));$skip(30); 

  val first = computers.head;System.out.println("""first  : Computer.Computer = """ + $show(first ));$skip(29); 

  val rest = computers.tail;System.out.println("""rest  : List[Computer.Computer] = """ + $show(rest ));$skip(29); 
  computers.foreach(println)}
}
