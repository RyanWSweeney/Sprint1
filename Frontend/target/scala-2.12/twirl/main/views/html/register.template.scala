
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
                <strong>Register User</strong>
            </h1>
        </header>



        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*32.36*/routes/*32.42*/.HomeController.signupHandler()),format.raw/*32.73*/("""" method="GET">

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
                                <label for="security">Security Question: What was the name of your first pet?</label>
                                <br>
                                <input id="security" name="security" type="password" class="validate">

                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <label for="title">Title</label>
                                <br>
                                <br>
                                <select id="title" name="title" style="display: block;">
                                    <option value="Mr.">Mr.</option>
                                    <option value="Mrs.">Mrs.</option>
                                    <option value="Ms.">Ms.</option>
                                    <option value="Dr.">Dr.</option>
                                    <option value="Prof.">Prof.</option>
                                </select>

                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="researchArea" name="researchArea" type="text" class="validate">
                                <label for="researchArea">Research Area</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="firstName" name="firstName" type="text" class="validate">
                                <label for="firstName">First Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="lastName" name="lastName" type="text" class="validate">
                                <label for="lastName">Last Name</label>
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

                                <input id="fax" name="fax" type="text" class="validate">
                                <label for="fax">Fax</label>
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

                                <input id="comment" name="comment" type="text" class="validate">
                                <label for="comment">Comments</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <label for="status">Status</label>
                                <br>
                                <br>
                                <select id="status" name="status" style="display: block;">
                                    <option value="Student">Student</option>
                                    <option value="Faculty">Faculty</option>
                                    <option value="Staff">Staff</option>
                                </select>
                            </div>
                        </div>
                        <div>If student answer the following questions</div>
                        <div class="row">
                            <div class="input-field col s12">
                                <label for="degree">Current Degree Plan</label>
                                <br>
                                <br>
                                <select id="degree" name="degree" style="display: block;">
                                    <option value="Ph.D.">Ph.D.</option>
                                    <option value="D.E.-SE">D.E.-SE</option>
                                    <option value="MS-CS">MS-CS</option>
                                    <option value="MS-SE">MS-SE</option>
                                    <option value="MS-Cybersecurity">MS-Cybersecurity</option>
                                    <option value="BS-CS">BS-CS</option>
                                    <option value="BA-CS">BA-CS</option>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <label for="semester">Starting Semester</label>
                                <br>
                                <br>
                                <select id="semester" name="semester" style="display: block;">
                                    <option value="Fall">Fall</option>
                                    <option value="Spring">Spring</option>
                                    <option value="Summer">Summer</option>
                                </select>
                                <br>
                                <br>
                                <select id="year" name="year" style="display: block;">
                                    <option value="2019">2019</option>
                                    <option value="2020">2020</option>
                                    <option value="2021">2021</option>
                                    <option value="2022">2022</option>
                                    <option value="2023">2023</option>
                                    <option value="2024">2024</option>
                                    <option value="2025">2025</option>
                                    <option value="2026">2026</option>
                                    <option value="2027">2027</option>
                                    <option value="2028">2028</option>
                                    <option value="2029">2029</option>
                                    <option value="2030">2030</option>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <label for="month">Graduation</label>
                                <br>
                                <br>
                                <select id="month" name="month" style="display: block;">
                                    <option value="January">January</option>
                                    <option value="February">February</option>
                                    <option value="March">March</option>
                                    <option value="April">April</option>
                                    <option value="May">May</option>
                                    <option value="June">June</option>
                                    <option value="July">July</option>
                                    <option value="August">August</option>
                                    <option value="September">September</option>
                                    <option value="October">October</option>
                                    <option value="November">November</option>
                                    <option value="December">December</option>
                                </select>
                                <br>
                                <br>
                                <select id="year2" name="year2" style="display: block;">
                                    <option value="2019">2019</option>
                                    <option value="2020">2020</option>
                                    <option value="2021">2021</option>
                                    <option value="2022">2022</option>
                                    <option value="2023">2023</option>
                                    <option value="2024">2024</option>
                                    <option value="2025">2025</option>
                                    <option value="2026">2026</option>
                                    <option value="2027">2027</option>
                                    <option value="2028">2028</option>
                                    <option value="2029">2029</option>
                                    <option value="2030">2030</option>
                                </select>
                            </div>
                        </div>
                        """),_display_(/*257.26*/if(authorizeMessage!= null)/*257.53*/{_display_(Seq[Any](format.raw/*257.54*/("""
                            """),format.raw/*258.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*259.30*/authorizeMessage),format.raw/*259.46*/("""
                            """),format.raw/*260.29*/("""</div>
                            <br>
                        """)))}),format.raw/*262.26*/("""

                        """),format.raw/*264.25*/("""<div class="row">
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
                  DATE: 2023-03-02T11:21:19.154
                  SOURCE: D:/SoftwareEngineering/Sprint1/Frontend/app/views/register.scala.html
                  HASH: 844a17b8ca5aaa8a0a5e2102b8ef333d06904d3b
                  MATRIX: 951->1|1071->28|2658->1590|2673->1596|2725->1627|14970->13844|15007->13871|15047->13872|15105->13901|15209->13977|15247->13993|15305->14022|15402->14087|15457->14113
                  LINES: 28->1|33->2|63->32|63->32|63->32|288->257|288->257|288->257|289->258|290->259|290->259|291->260|293->262|295->264
                  -- GENERATED --
              */
          