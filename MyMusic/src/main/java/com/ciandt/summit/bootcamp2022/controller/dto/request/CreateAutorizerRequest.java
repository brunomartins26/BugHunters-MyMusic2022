package com.ciandt.summit.bootcamp2022.controller.dto.request;

import com.ciandt.token.provider.controllers.dto.request.CreateAuthorizerRequestData;

public class CreateAutorizerRequest {
    private CreateAuthorizerRequestData data;

    public CreateAuthorizerRequestData getData() {
        return data;
    }

    public void setData(CreateAuthorizerRequestData data) {
        this.data = data;
    }
}
