object GradesChallenge {
  var grades = List(50, 65, 69, 76, 77, 85, 86, 92, 93, 100)
                                                  //> grades  : List[Int] = List(50, 65, 69, 76, 77, 85, 86, 92, 93, 100)
  for (g <- grades)
    if (g < 69)
      println("F")
    else if (g < 77)
      println("D")
    else if (g < 86)
      println("C")
    else if (g < 93)
      println("B")
    else
      println("A")                                //> F
                                                  //| F
                                                  //| D
                                                  //| D
                                                  //| C
                                                  //| C
                                                  //| B
                                                  //| B
                                                  //| A
                                                  //| A

  var totalGrade = 0.0                            //> totalGrade  : Double = 0.0
  for (g <- grades) totalGrade += g
  println(totalGrade)                             //> 793.0
  var averageGrade = totalGrade / grades.length   //> averageGrade  : Double = 79.3
}