//import slick.jdbc.H2Profile.api._
import slick.jdbc.H2Profile.api._

//import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by totala on 5/12/17.
  */


/*
h2mem1 = {
  url = "jdbc:h2:mem:test1"
  driver = org.h2.Driver
  connectionPool = disabled
  keepAliveConnection = true
}
*/

object main extends App {
   print("args: ")
    args foreach print _
    println

  val db = Database.forURL("jdbc:h2:mem:test1;DB_CLOSE_DELAY=-1", driver="org.h2.Driver")

/*
  val db = Database.forConfig("h2mem1")
  try {
    // ...
  } finally db.closs
*/

}
