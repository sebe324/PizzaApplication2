package pl.sebastian.pizza.domain.service;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) { super(message);}

}
