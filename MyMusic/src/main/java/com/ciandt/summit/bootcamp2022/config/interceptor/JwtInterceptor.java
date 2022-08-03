package com.ciandt.summit.bootcamp2022.config.interceptor;

import com.ciandt.summit.bootcamp2022.exceptions.ErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Component
public class JwtInterceptor implements HandlerInterceptor {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtInterceptor.class);
    private static final String HEADER_AUTH = "Authorization";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){

        final String header_auth = request.getHeader(HEADER_AUTH);

        if (header_auth != null && jwtTokenProvider.validateCredentials(catchHeaderData(header_auth))) {
            return true;
        } else {
            LOGGER.info("Usuário não autorizado!");
            throw new ErrorException("Usuário não autorizado!");
        }
    }

    private String[] catchHeaderData(String header_auth){
        byte[] credDecoded = Base64.getDecoder().decode(header_auth.replace("Basic ", ""));
        String credentials = new String(credDecoded, StandardCharsets.UTF_8);
        return credentials.split(":");
    }
}
