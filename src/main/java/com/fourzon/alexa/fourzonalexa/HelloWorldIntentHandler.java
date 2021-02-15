package com.fourzon.alexa.fourzonalexa;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

public class HelloWorldIntentHandler implements RequestHandler {

	@Override
	public boolean canHandle(HandlerInput input) {
		// TODO Auto-generated method stub
		return input.matches(Predicates.intentName("HelloWorldIntent"));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		// TODO Auto-generated method stub
		String speechText = "Hello world";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .build();
	}

}
