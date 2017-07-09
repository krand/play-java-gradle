package controllers;

import org.junit.Test;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithServer;

import static org.junit.Assert.*;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.fakeRequest;
import static play.test.Helpers.route;

public class PingControllerTest extends WithServer{
    @Test
    public void shouldPing() throws Exception {
        Http.RequestBuilder request = fakeRequest(GET, "/ping");
        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

}