package com.fourzon.alexa.fourzonalexa;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

public class LaunchRequestHandler implements RequestHandler {

	@Override
	public boolean canHandle(HandlerInput input) {
		// TODO Auto-generated method stub
		return input.matches(Predicates.requestType(LaunchRequest.class));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		String speechText = "Welcome to the Alexa Skill Kit , You can say Hello";
		return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("HelloWorld", speechText)
				.withReprompt(speechText).build();
	}
}