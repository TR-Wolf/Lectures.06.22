package com.example.Logging.controllers;

import com.example.Logging.dto.BitcoinDTO;
import com.example.Logging.services.BitcoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Logger Imports
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {

    //
    // Logging Lecture!!!
    //

    // 0. Prior to adding a logger in... is Spring using loggers?

    // 1. Create a logger
//    Logger logger = LoggerFactory.getLogger(HelloController.class);


    @Autowired
    BitcoinService bitcoinService;

    @GetMapping("/bitcoin")
    public String coin() {

        String logString = "Bitcoin endpoint has been called.";
        System.out.println(logString); // I do not want to do this anymore
        //.... put code here
        // 2. What did this do? why?


        // List of Differences:
        //   - Date and Time
        //   - Log Level
        //   - Class which called Logger

        // Check out different log styles and then add a few of each.

        StringBuilder coinPage = new StringBuilder();
        BitcoinDTO data = bitcoinService.getBitcoinData();

        coinPage.append("<html>\n");

        // Do we like it when this happens?
        if (data != null) {
            coinPage.append("<h1>" + "Coin Name: " + data.getName() + "</h1>\n");
            coinPage.append("<h2>" + "Symbol: " + data.getSymbol() + "</h2>\n");
            coinPage.append("<p>" + "Price USD: " + data.getPriceUsd() + "</p>\n");
            coinPage.append("<p>" + "Market Cap USD: " + data.getMarketCapUsd() + "</p>\n");
            coinPage.append("<p>" + "Rank: " + data.getRank() + "</p>\n");
        } else {
            coinPage.append("<h1> Error: Could not access API</h1>");
        }
        coinPage.append("</html>\n");

        return coinPage.toString();
    }
    //////////
    // Log Level hierarchy
    //////
    /////////||
    // TRACE: | Fine-grained level of logging
    //        | Very detailed information.
    //        | Code should be verbose
    /////////||
    // DEBUG: | Less fine-grained,
    /////////|| More output than the application
    /////////|| should put out normally.
    /////////|| high level debugging information
    /////////|| (as opposed to) logging every step that your application is going through.
    /////////||
    // INFO:  | SLF4J default
    /////////|| high level information about what
    /////////|| your application is doing,
    /////////|| e.g. a request was just processed
    /////////||
    // WARN:  | Indicate that non-fatal problem occurred
    /////////|| not expected to be used frequently.
    /////////||
    // ERROR: | There is an issue that is preventing the application from performing one of its functions.
    /////////||


    // After adding a few logs, let's edit our application properties

    // root
//    logging.level.root=WARN

    // our project
//    logging.level.com.example.Logging=INFO

    //output file
//    logging.file.name=bitcoin_query_requests.log


    // Suppose I know which user called an end point,
    // maybe I want to log it, so that I can track my users.


    // Briefly, how to format these files in a more standardized way.
    // resources/logback.xml


    @GetMapping("/hello")
    public String hello(@RequestParam(name = "targetName", defaultValue = "World") String name) {
        String apiExtension = "";//""/helloAPI";
        return String.format("<h1>Hello User Web Page</h1>" +
                        "<h3>A kind hello to %s, and to you a good day.</h3>" +
                        "<p><a href=\"/login\">Login Page</p>" +
                        "<p><a href=\"/logout\">Logout Page</p>" +
                        "<p><a href=\"" + apiExtension + "/status\">Admin-Only Status Page</p>"
                , name);
    }

    @GetMapping("/status")
    public String status() {
        String apiExtension = "";//""/helloAPI";
        return "<h1>Congratulations</h1>" +
                "<h3>You must be an admin since you can see the application's status information</h3>" +
                "<p>" +
                "   <a href=\"/login\">Login Page" +
                "</p>" +
                "<p>" +
                "   <a href=\"/logout\">Logout Page" +
                "</p>" +
                "<p>" +
                "   <a href=\"" + apiExtension + "/hello\">Hello User Page" +
                "</p>";
    }
    @GetMapping
    public String home() {
        return "<h3>Welcome to My website. Go to one of our web pages:</h3>" +
                "<p>" +
                "   <a href=\"/bitcoin\">Information about Bitcoin." +
                "</p>" +
                "<p>" +
                "   <a href=\"/login\">Login Page" +
                "</p>" +
                "<p>" +
                "   <a href=\"/logout\">Logout Page" +
                "</p>" +
                "<p>" +
                "   <a href=\"/hello\">Hello User Page" +
                "</p>" +
                "<p>" +
                "   <a href=\"/status\">Admins Only!" +
                "</p>"
                ;
    }


}