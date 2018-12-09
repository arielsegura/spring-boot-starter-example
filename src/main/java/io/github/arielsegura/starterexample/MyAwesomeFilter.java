package io.github.arielsegura.starterexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyAwesomeFilter extends OncePerRequestFilter {

    private Logger logger = LoggerFactory.getLogger(MyAwesomeFilter.class);

    private final String phrase;

    public MyAwesomeFilter(String phrase) {
        this.phrase = phrase;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        logger.info(phrase);
    }
}
