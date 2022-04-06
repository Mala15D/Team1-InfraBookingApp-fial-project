package com.infrabookingapp.apigateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class CustomFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		System.out.println("From custom filter...");
		return chain.filter(exchange);
	}
	
	/*@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		System.out.println("In filter->Doing preprocessing");
		ServerHttpRequest request = exchange.getRequest();
		HttpHeaders headers = request.getHeaders();

		List<String> list = headers.get("Authorization");

		if (list != null) {

			String authorizationHeaderValue = list.get(0);

			if (authorizationHeaderValue == null) {
				ServerHttpResponse response = exchange.getResponse();
				response.setStatusCode(HttpStatus.UNAUTHORIZED);
				return response.setComplete();
			}
		} else {
			ServerHttpResponse response = exchange.getResponse();
			response.setStatusCode(HttpStatus.UNAUTHORIZED);
			return response.setComplete();
		}
		return chain.filter(exchange);
	}*/

}
