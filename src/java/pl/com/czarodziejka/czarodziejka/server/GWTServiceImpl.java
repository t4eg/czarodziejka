/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.czarodziejka.czarodziejka.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import pl.com.czarodziejka.czarodziejka.client.GWTService;

/**
 *
 * @author admin
 */
public class GWTServiceImpl extends RemoteServiceServlet implements GWTService {

    public String myMethod(String s) {
        // Do something interesting with 's' here on the server.
        return "Server says: " + s;
    }
}
