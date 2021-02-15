package com.fourzon.alexa.fourzonalexa;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.intentName;

public class FallbackIntentHandler implements RequestHandler {

	@Override
	public boolean canHandle(HandlerInput input) {
		// TODO Auto-generated method stub
		return input.matches(intentName("AMAZON.FallbackIntent"));
	}

	 @Override
	    public Optional<Response> handle(HandlerInput input) {
	        String speechText = "Sorry, I don't know that. You can say try saying help!";
	        return input.getResponseBuilder()
	                .withSpeech(speechText)
	                .withSimpleCard("HelloWorld", speechText)
	                .withReprompt(speechText)
	           .build();
	 }
}