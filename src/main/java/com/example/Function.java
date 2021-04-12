package com.example;

import static com.microsoft.azure.functions.HttpMethod.GET;
import static com.microsoft.azure.functions.HttpMethod.POST;
import static com.microsoft.azure.functions.HttpMethod.PUT;
import static com.microsoft.azure.functions.annotation.AuthorizationLevel.FUNCTION;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import io.micronaut.azure.function.http.AzureHttpFunction;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import java.util.Optional;

public class Function extends AzureHttpFunction {

  @FunctionName("router")
  public HttpResponseMessage run(
      @HttpTrigger(name = "req",  methods = {GET, POST, PUT},  authLevel = FUNCTION, route = "{*route}")
          HttpRequestMessage<Optional<String>> request,
      final ExecutionContext context) {
    return super.route(request, context);
  }
}
