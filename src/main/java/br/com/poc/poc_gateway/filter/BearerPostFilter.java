package br.com.poc.poc_gateway.filter;

import org.springframework.stereotype.Component;

/**
 * BearerPostFilter
 * Returns the bearer to the client as Authorization-Header
 */
@Component
public class BearerPostFilter extends KeycloakFilter {

    @Override
    protected boolean isPostFilter() {
        return true;
    }

    @Override
    public boolean shouldFilter() {
        return super.shouldFilter() && !getResponse().containsHeader(AUTHORIZATION);
    }

    @Override
    public Object run() {
        getResponse().addHeader(AUTHORIZATION, extractBearer());
        return null;
    }
}
