package br.com.versa.art.controller.business;

public class InvalidIdConsumerException extends RuntimeException {
    public InvalidIdConsumerException(String message) {
        super(message);
    }
}
