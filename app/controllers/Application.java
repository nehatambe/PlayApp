package controllers;

import play.*;
import play.mvc.*;
import play.mvc.results.Result;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render("This is my first Play framework application.");
    }
    public static Result addDetails() {
        return ok(
                addDetails.render()
        );
    }
}