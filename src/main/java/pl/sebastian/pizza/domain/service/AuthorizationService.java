package pl.sebastian.pizza.domain.service;

public class AuthorizationService {
    public static void checkToken(String token){
        if (token == null || !token.equals("xyz")){
            throw new UnauthorizedException("Błędny token");
        }
    }
}
