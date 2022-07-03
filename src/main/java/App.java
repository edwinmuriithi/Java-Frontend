import models.Products;
import models.Summary;
import org.json.JSONArray;
import org.json.JSONObject;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static spark.Spark.*;

public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) {
        port(getHerokuAssignedPort());
        staticFileLocation("/public");
        String layout = "templates/layout.hbs";

        //home
        get("/",(request, response) -> {
            Map<String,Object> model = new HashMap<String, Object>();
            return new ModelAndView(model,"login.hbs");
        },new HandlebarsTemplateEngine());

        //Navigate to login page
        get("/dashboard",(request, response) -> {
            Map<String,Object> model = new HashMap<String, Object>();
            return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());

//        //View summary
//        get("/view/summary",(request, response) -> {
//            Map<String,Object> model=new HashMap<String, Object>();
//            model.put("summary", Summary.all());
//            return new ModelAndView(model,"summary_view.hbs");
//        },new HandlebarsTemplateEngine());

//        //View all products
//        get("/view/products",(request, response) -> {
//            Map<String,Object> model=new HashMap<String, Object>();
//            model.put("products", Products.all());
//            return new ModelAndView(model,"products_view.hbs");
//        },new HandlebarsTemplateEngine());
     }
}
