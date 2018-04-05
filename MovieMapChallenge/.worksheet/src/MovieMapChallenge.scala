object MovieMapChallenge {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(210); 
  // create map of movies with ratings
  var movies = Map("Black Panther" -> "PG-13", "The Death of Stalin" -> "R", "Isle of Dogs" -> "PG-13", "Pandas: The IMAX 2D Experience" -> "G");System.out.println("""movies  : scala.collection.immutable.Map[String,String] = """ + $show(movies ));$skip(62); 
  // use key to get rating
  println(movies("Black Panther"));$skip(58); 
  
  // print all values in map
  movies.foreach(println);$skip(69); 
  // add new movie to list
  movies += ("The Shape of Water" -> "R");$skip(26); 
  movies.foreach(println)}
}
