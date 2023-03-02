
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Play Setup Demo</strong>
            </h1>
        </header>


        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*31.36*/routes/*31.42*/.HomeController.signupHandler()),format.raw/*31.73*/("""" method="GET">

                        <div class="row">
                            <div class="input-field col s12">

                                <input id="username" name="username" type="text" class="validate">
                                <label for="username">Username</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="password" name="password" type="password" class="validate">
                                <label for="password">Password</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="title" name="title" type="text" class="validate">
                                <label for="title">Title</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="firstname" name="firstname" type="text" class="validate">
                                <label for="firstname">First Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="lastname" name="lastname" type="text" class="validate">
                                <label for="lastname">Last Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="position" name="position" type="text" class="validate">
                                <label for="position">Position</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="affiliation" name="affiliation" type="text" class="validate">
                                <label for="affiliation">Affiliation</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="email" name="email" type="text" class="validate">
                                <label for="email">Email</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="phone" name="phone" type="text" class="validate">
                                <label for="phone">Phone</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="address" name="address" type="text" class="validate">
                                <label for="address">Address</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="city" name="city" type="text" class="validate">
                                <label for="city">City</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="country" name="country" type="text" class="validate">
                                <label for="country">Country</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="zip" name="zip" type="text" class="validate">
                                <label for="zip">Zip Code</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="comments" name="comments" type="text" class="validate">
                                <label for="comments">Comments</label>
                            </div>
                        </div>

                        """),_display_(/*132.26*/if(authorizeMessage!= null)/*132.53*/{_display_(Seq[Any](format.raw/*132.54*/("""
                            """),format.raw/*133.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*134.30*/authorizeMessage),format.raw/*134.46*/("""
                            """),format.raw/*135.29*/("""</div>
                            <br>
                        """)))}),format.raw/*137.26*/("""

                        """),format.raw/*139.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-01T22:04:09.585
                  SOURCE: D:/SoftwareEngineering/Sprint1/Frontend/app/views/register.scala.html
                  HASH: c3ce32c5e2ae165a5a0ee714df86d86ec1c1731d
                  MATRIX: 951->1|1071->28|2659->1591|2674->1597|2726->1628|7518->6392|7555->6419|7595->6420|7653->6449|7757->6525|7795->6541|7853->6570|7950->6635|8005->6661
                  LINES: 28->1|33->2|62->31|62->31|62->31|163->132|163->132|163->132|164->133|165->134|165->134|166->135|168->137|170->139
                  -- GENERATED --
              */
          