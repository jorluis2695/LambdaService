package com.amazonaws.lambda.demo;

import java.util.ArrayList;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;



public class LambdaFunctionHandler implements RequestHandler<Request, Response> {
	
	App al;
	@Override
    public Response handleRequest(Request request, Context context) {
        String greetingString = String.format("total memory %d", request.getTotalMemory());
        
        double []weights = {1.0,1.0};
    	double M = 30.0;
    	double [] m_ = {10.0, 5.0};
    	ArrayList<UtilityFunction> functions = new ArrayList<UtilityFunction>();
    	UtilityFunction f1 = new UtilityFunction();
    	f1.addPoint(0,0.0);
    	f1.addPoint(10,0.25);
    	f1.addPoint(20,0.35);
    	f1.addPoint(30,0.49);
    	f1.addPoint(40,0.60);
    	functions.add(f1);
    	UtilityFunction f2 = new UtilityFunction();
    	f2.addPoint(0,0.0);
    	f2.addPoint(10,0.5);
    	f2.addPoint(20,0.7);
    	f2.addPoint(30,0.97);
    	f2.addPoint(40,0.99);
    	functions.add(f2);
    	al = new App(4);
    	double[] result=al.probabilisticAdactiveSearch(10,5,functions,weights,500, M, m_);
    	for (int i=0;i< result.length; i++ ) {
    		System.out.println(result[i]);
    	}
    	
    	
        return new Response(greetingString);
    }
    
    
    
}



    

