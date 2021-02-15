package com.fourzon.alexa.fourzonalexa;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.SessionEndedRequest;

import static com.amazon.ask.request.Predicates.requestType;



public class SessionEndedRequestHandler implements RequestHandler {

	@Override
	public boolean canHandle(HandlerInput input) {
		// TODO Auto-generated method stub
		 return input.matches(requestType(SessionEndedRequest.class));
	}


    @Override
    public Optional<Response> handle(HandlerInput input) {
        // any cleanup logic goes here
        return input.getResponseBuilder().build();
    }
}