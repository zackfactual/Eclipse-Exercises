object Computer {

  class Computer(val make: String, val model: String, val ram: String) {
    override def toString: String = ("[" + make + ", " + model + ", " + ram + "]\n")
  }

  val computers = List(
    new Computer("Dell", "Laptop", "16GB"),
    new Computer("Dell", "Desktop", "32GB"),
    new Computer("Mac", "Mini", "8GB"),
    new Computer("HP", "Notebook", "16GB"))       //> computers  : List[Computer.Computer] = List([Dell, Laptop, 16GB]
                                                  //| , [Dell, Desktop, 32GB]
                                                  //| , [Mac, Mini, 8GB]
                                                  //| , [HP, Notebook, 16GB]
                                                  //| )

  val first = computers.head                      //> first  : Computer.Computer = [Dell, Laptop, 16GB]
                                                  //| 

  val rest = computers.tail                       //> rest  : List[Computer.Computer] = List([Dell, Desktop, 32GB]
                                                  //| , [Mac, Mini, 8GB]
                                                  //| , [HP, Notebook, 16GB]
                                                  //| )
  computers.foreach(println)                      //> [Dell, Laptop, 16GB]
                                                  //| 
                                                  //| [Dell, Desktop, 32GB]
                                                  //| 
                                                  //| [Mac, Mini, 8GB]
                                                  //| 
                                                  //| [HP, Notebook, 16GB]
                                                  //| 
}