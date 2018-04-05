object MovieMapChallenge {
  // create map of movies with ratings
  var movies = Map("Black Panther" -> "PG-13", "The Death of Stalin" -> "R", "Isle of Dogs" -> "PG-13", "Pandas: The IMAX 2D Experience" -> "G")
                                                  //> movies  : scala.collection.immutable.Map[String,String] = Map(Black Panther 
                                                  //| -> PG-13, The Death of Stalin -> R, Isle of Dogs -> PG-13, Pandas: The IMAX 
                                                  //| 2D Experience -> G)
  // use key to get rating
  println(movies("Black Panther"))                //> PG-13
  
  // print all values in map
  movies.foreach(println)                         //> (Black Panther,PG-13)
                                                  //| (The Death of Stalin,R)
                                                  //| (Isle of Dogs,PG-13)
                                                  //| (Pandas: The IMAX 2D Experience,G)
  // add new movie to list
  movies += ("The Shape of Water" -> "R")
  movies.foreach(println)                         //> (Isle of Dogs,PG-13)
                                                  //| (Pandas: The IMAX 2D Experience,G)
                                                  //| (The Shape of Water,R)
                                                  //| (Black Panther,PG-13)
                                                  //| (The Death of Stalin,R)
}