object NameListChallenge {
  case class Employee(id: Int, fName: String, lName: String) {
    override def toString: String = ("Employee ID: " + id + "\nFull Name: " + fName + " " + lName)
  }

  var employees = List(
    Employee(10000, "Frodo", "Baggins"),
    Employee(10001, "Samwise", "Gamgee"),
    Employee(10002, "Gandalf", "the Grey"),
    Employee(10003, "Legolas", "Greenleaf"),
    Employee(10004, "Gimli", "son of Gloin"),
    Employee(10005, "Aragorn", "son of Arathorn"),
    Employee(10006, "Boromir", "son of Denethor II"),
    Employee(10007, "Meriadoc", "Brandybuck"),
    Employee(10008, "Peregrin", "Took"))          //> employees  : List[NameListChallenge.Employee] = List(Employee ID: 10000
                                                  //| Full Name: Frodo Baggins, Employee ID: 10001
                                                  //| Full Name: Samwise Gamgee, Employee ID: 10002
                                                  //| Full Name: Gandalf the Grey, Employee ID: 10003
                                                  //| Full Name: Legolas Greenleaf, Employee ID: 10004
                                                  //| Full Name: Gimli son of Gloin, Employee ID: 10005
                                                  //| Full Name: Aragorn son of Arathorn, Employee ID: 10006
                                                  //| Full Name: Boromir son of Denethor II, Employee ID: 10007
                                                  //| Full Name: Meriadoc Brandybuck, Employee ID: 10008
                                                  //| Full Name: Peregrin Took)

  employees.foreach(println)                      //> Employee ID: 10000
                                                  //| Full Name: Frodo Baggins
                                                  //| Employee ID: 10001
                                                  //| Full Name: Samwise Gamgee
                                                  //| Employee ID: 10002
                                                  //| Full Name: Gandalf the Grey
                                                  //| Employee ID: 10003
                                                  //| Full Name: Legolas Greenleaf
                                                  //| Employee ID: 10004
                                                  //| Full Name: Gimli son of Gloin
                                                  //| Employee ID: 10005
                                                  //| Full Name: Aragorn son of Arathorn
                                                  //| Employee ID: 10006
                                                  //| Full Name: Boromir son of Denethor II
                                                  //| Employee ID: 10007
                                                  //| Full Name: Meriadoc Brandybuck
                                                  //| Employee ID: 10008
                                                  //| Full Name: Peregrin Took
}