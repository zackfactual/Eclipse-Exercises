object NameListChallenge {
  case class Employee(id: Int, fName: String, lName: String) {
    override def toString: String = ("Employee ID: " + id + "\nFull Name: " + fName + " " + lName)
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(628); 

  var employees = List(
    Employee(10000, "Frodo", "Baggins"),
    Employee(10001, "Samwise", "Gamgee"),
    Employee(10002, "Gandalf", "the Grey"),
    Employee(10003, "Legolas", "Greenleaf"),
    Employee(10004, "Gimli", "son of Gloin"),
    Employee(10005, "Aragorn", "son of Arathorn"),
    Employee(10006, "Boromir", "son of Denethor II"),
    Employee(10007, "Meriadoc", "Brandybuck"),
    Employee(10008, "Peregrin", "Took"));System.out.println("""employees  : List[NameListChallenge.Employee] = """ + $show(employees ));$skip(30); 

  employees.foreach(println)}
}
