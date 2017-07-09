package controllers;

import utils.HealthCheck;
import play.mvc.*;

public class PingController extends Controller {

    private HealthCheck healthCheck = new HealthCheck();

    public Result ping() {
        return ok("Hi, I am " + healthCheck.status());
    }

}
