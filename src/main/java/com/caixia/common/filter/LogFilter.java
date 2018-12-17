package com.caixia.common.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther: LiChaoChao
 * @date: 2018-11-28
 */
@WebFilter(urlPatterns = "/*", filterName = "logFilter")
public class LogFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        System.out.println("before ...");
        filterChain.doFilter(request, response);
//        System.out.println("after ...");
        return;
    }

}
