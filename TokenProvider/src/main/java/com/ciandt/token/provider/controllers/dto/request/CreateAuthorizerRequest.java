package com.ciandt.token.provider.controllers.dto.request;

public class CreateAuthorizerRequest {

    private CreateAuthorizerRequestData data;

    public CreateAuthorizerRequest(CreateAuthorizerRequestData createAuthorizerRequestData) {
    }

    public CreateAuthorizerRequestData getData() {
        return data;
    }

    public void setData(CreateAuthorizerRequestData data) {
        this.data = data;
    }
}
