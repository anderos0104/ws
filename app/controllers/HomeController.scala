package controllers

import java.io.File
import javax.inject._

import play.api._
import play.api.mvc._


class HomeController extends Controller {

  def index = Action {
    request =>
    val file = new java.io.File("./public/index-dev.html")
    Ok.sendFile(file).as(HTML)
  }
}
