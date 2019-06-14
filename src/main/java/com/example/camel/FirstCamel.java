package com.example.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FirstCamel {
    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:/home/sol/workspace/dummies/files?noop=true")
                        .to("file:/home/sol/workspace/dummies/files/out");
            }
        });
        context.start();
        Thread.sleep(10000);
        context.stop();
    }
}
