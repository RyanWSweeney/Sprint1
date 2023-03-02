// @GENERATOR:play-routes-compiler
// @SOURCE:D:/SoftwareEngineering/Sprint1/Frontend/conf/routes
// @DATE:Thu Mar 02 11:37:49 CST 2023


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
