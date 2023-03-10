
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import java.math.BigInteger;var i = 0


Seq[Any](format.raw/*2.1*/("""    """),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Login Message</strong>
            </h1>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">"""),_display_(/*16.34*/message),format.raw/*16.41*/("""</p>

        </header>

        <div class="row">
            <div class="card col s4 offset-s4">
                <div class="card-panel">
                    <a href=""""),_display_(/*23.31*/routes/*23.37*/.HomeController.application()),format.raw/*23.66*/("""">Submit a TA Application</a>
                    <a href=""""),_display_(/*24.31*/routes/*24.37*/.HomeController.edit()),format.raw/*24.59*/("""">Edit User Details</a>
                </div>
            </div>
        </div>

    </body>
</html>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-10T13:51:24.167
                  SOURCE: D:/SoftwareEngineering/Sprint1/Frontend/app/views/index.scala.html
                  HASH: 02d511431eb4eb23493e9304c0abb1e0cd3650e0
                  MATRIX: 948->1|1038->24|1104->19|1134->62|1705->607|1733->614|1930->784|1945->790|1995->819|2082->879|2097->885|2140->907
                  LINES: 28->1|31->2|34->2|34->3|47->16|47->16|54->23|54->23|54->23|55->24|55->24|55->24
                  -- GENERATED --
              */
          