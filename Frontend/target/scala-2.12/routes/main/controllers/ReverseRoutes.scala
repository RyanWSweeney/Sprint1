// @GENERATOR:play-routes-compiler
// @SOURCE:D:/SoftwareEngineering/Sprint1/Frontend/conf/routes
// @DATE:Fri Mar 10 14:08:01 CST 2023

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def edit2(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "edit2")
    }
  
    // @LINE:18
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "edit")
    }
  
    // @LINE:16
    def application(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "application")
    }
  
    // @LINE:10
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:14
    def forgotPassword(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "forgotPassword")
    }
  
    // @LINE:8
    def loginHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:12
    def signupHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
