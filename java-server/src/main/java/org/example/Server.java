package org.example;

import java.io.IOException;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;
import org.example.Annuaire;

public class Server {

    private static int PORT = 8084;


    public static void main(String[] args) throws XmlRpcException, IOException {
        WebServer ws = new WebServer(PORT);
        PropertyHandlerMapping mapping = new PropertyHandlerMapping();
        mapping.addHandler("ANN",Annuaire.class);

        ws.getXmlRpcServer().setHandlerMapping(mapping);
        ws.start();
        System.out.printf("Server listening on port " + PORT);
    }
}