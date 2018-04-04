object GradesChallenge {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  var grades = List(50, 65, 69, 76, 77, 85, 86, 92, 93, 100);System.out.println("""grades  : List[Int] = """ + $show(grades ));$skip(203); 
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
      println("A");$skip(24); 

  var totalGrade = 0.0;System.out.println("""totalGrade  : Double = """ + $show(totalGrade ));$skip(36); 
  for (g <- grades) totalGrade += g;$skip(22); 
  println(totalGrade);$skip(48); 
  var averageGrade = totalGrade / grades.length;System.out.println("""averageGrade  : Double = """ + $show(averageGrade ))}
}
