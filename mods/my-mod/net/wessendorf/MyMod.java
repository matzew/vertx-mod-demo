package net.wessendorf;

import org.vertx.java.busmods.BusModBase;
import org.vertx.java.core.Handler;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.core.json.JsonObject;

public class MyMod extends BusModBase implements Handler<Message<JsonObject>> {

    @Override
    public void start() {
        super.start();
        System.out.println("\nSTART\n");
        eb.registerHandler("net.wessendorf.reg", this);
    }

    @Override
    public void stop() throws Exception {
        System.out.println("\nSTOP\n");
        super.stop();
    }

    @Override
    public void handle(Message<JsonObject> message) {
        System.out.println("\nGOT MESSAGE: " + message + "\n");
    }

}