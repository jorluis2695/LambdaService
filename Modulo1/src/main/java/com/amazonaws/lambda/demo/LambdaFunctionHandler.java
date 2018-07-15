package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;



public class LambdaFunctionHandler implements RequestHandler<Request, Response> {

    @Override
    public Response handleRequest(Request request, Context context) {
        String greetingString = String.format("Hello from Lambda! %d", request.getMinimumMemory()[1]);
        return new Response(greetingString);
    }
}


    

