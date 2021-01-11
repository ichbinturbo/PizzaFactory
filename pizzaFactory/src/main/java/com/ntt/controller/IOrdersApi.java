package com.ntt.controller;

import java.io.IOException;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ntt.model.domain.CanonicalModelWithBase;
import com.ntt.model.domain.CanonicalModelWithOrder;
import com.ntt.model.domain.CanonicalModelWithOrderWithTime;
import com.ntt.model.domain.CanonicalModelWithToppings;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Orders", description = "the Orders API")
public interface IOrdersApi {

	 Logger log = LoggerFactory.getLogger(OrdersApi.class);

	    default Optional<ObjectMapper> getObjectMapper(){
	        return Optional.empty();
	    }

	    default Optional<HttpServletRequest> getRequest(){
	        return Optional.empty();
	    }

	    default Optional<String> getAcceptHeader() {
	        return getRequest().map(r -> r.getHeader("Accept"));
	    }

	    @ApiOperation(value = "Gets all the bases", nickname = "getAllBases", notes = "Gets all the bases", response = CanonicalModelWithBase.class, tags={ "Orders", })
	    @ApiResponses(value = { 
	        @ApiResponse(code = 200, message = "Successful request", response = CanonicalModelWithBase.class) })
	    @RequestMapping(value = "/options/bases",
	        produces = { "application/json" }, 
	        method = RequestMethod.GET)
	    default CompletableFuture<ResponseEntity<CanonicalModelWithBase>> getAllBases() {
	        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
	            if (getAcceptHeader().get().contains("application/json")) {
	                try {
	                    return CompletableFuture.completedFuture(new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"payload\" : [ {\r\n    \"price\" : 0,\r\n    \"name\" : \"name\",\r\n    \"cookingTime\" : \"2000-01-23T04:56:07.000+00:00\"\r\n  }, {\r\n    \"price\" : 0,\r\n    \"name\" : \"name\",\r\n    \"cookingTime\" : \"2000-01-23T04:56:07.000+00:00\"\r\n  } ],\r\n  \"correlationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n  \"sessionId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n  \"error\" : \"\"\r\n}", CanonicalModelWithBase.class), HttpStatus.NOT_IMPLEMENTED));
	                } catch (IOException e) {
	                    log.error("Couldn't serialize response for content type application/json", e);
	                    return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
	                }
	            }
	        } else {
	            log.warn("ObjectMapper or HttpServletRequest not configured in default OrdersApi interface so no example is generated");
	        }
	        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));
	    }


	    @ApiOperation(value = "Gets all the toppings", nickname = "getAllToppings", notes = "Gets all the toppings", response = CanonicalModelWithToppings.class, tags={ "Orders", })
	    @ApiResponses(value = { 
	        @ApiResponse(code = 200, message = "Successful request", response = CanonicalModelWithToppings.class) })
	    @RequestMapping(value = "/options/toppings",
	        produces = { "application/json" }, 
	        method = RequestMethod.GET)
	    default CompletableFuture<ResponseEntity<CanonicalModelWithToppings>> getAllToppings() {
	        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
	            if (getAcceptHeader().get().contains("application/json")) {
	                try {
	                    return CompletableFuture.completedFuture(new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"payload\" : [ [ \"payload\", \"payload\" ], [ \"payload\", \"payload\" ] ],\r\n  \"correlationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n  \"sessionId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n  \"error\" : \"\"\r\n}", CanonicalModelWithToppings.class), HttpStatus.NOT_IMPLEMENTED));
	                } catch (IOException e) {
	                    log.error("Couldn't serialize response for content type application/json", e);
	                    return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
	                }
	            }
	        } else {
	            log.warn("ObjectMapper or HttpServletRequest not configured in default OrdersApi interface so no example is generated");
	        }
	        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));
	    }


	    @ApiOperation(value = "Gets order by order Id", nickname = "getOrderByOrderId", notes = "Get order of pizza by ID", response = CanonicalModelWithOrderWithTime.class, tags={ "Orders", })
	    @ApiResponses(value = { 
	        @ApiResponse(code = 200, message = "Successful request", response = CanonicalModelWithOrderWithTime.class) })
	    @RequestMapping(value = "/orders/{orderId}",
	        produces = { "application/json" }, 
	        method = RequestMethod.GET)
	    default CompletableFuture<ResponseEntity<CanonicalModelWithOrderWithTime>> getOrderByOrderId(@ApiParam(value = "ID of order/s whose order the request will return",required=true) @PathVariable("orderId") Integer orderId
	) {
	        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
	            if (getAcceptHeader().get().contains("application/json")) {
	                try {
	                    return CompletableFuture.completedFuture(new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"payload\" : {\r\n    \"Time\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"OrderID\" : 0\r\n  },\r\n  \"correlationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n  \"sessionId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n  \"error\" : \"\"\r\n}", CanonicalModelWithOrderWithTime.class), HttpStatus.NOT_IMPLEMENTED));
	                } catch (IOException e) {
	                    log.error("Couldn't serialize response for content type application/json", e);
	                    return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
	                }
	            }
	        } else {
	            log.warn("ObjectMapper or HttpServletRequest not configured in default OrdersApi interface so no example is generated");
	        }
	        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));
	    }


	    @ApiOperation(value = "Creates an order.", nickname = "postOrder", notes = "Creates an order in the database using the Json body sent with the request", response = CanonicalModelWithOrderWithTime.class, tags={ "Orders", })
	    @ApiResponses(value = { 
	        @ApiResponse(code = 201, message = "Successful request", response = CanonicalModelWithOrderWithTime.class) })
	    @RequestMapping(value = "/orders",
	        produces = { "application/json" }, 
	        consumes = { "application/json" },
	        method = RequestMethod.POST)
	    default CompletableFuture<ResponseEntity<CanonicalModelWithOrderWithTime>> postOrder(@ApiParam(value = ""  )  @Valid @RequestBody CanonicalModelWithOrder body
	) {
	        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
	            if (getAcceptHeader().get().contains("application/json")) {
	                try {
	                    return CompletableFuture.completedFuture(new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"payload\" : {\r\n    \"Time\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"OrderID\" : 0\r\n  },\r\n  \"correlationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n  \"sessionId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n  \"error\" : \"\"\r\n}", CanonicalModelWithOrderWithTime.class), HttpStatus.NOT_IMPLEMENTED));
	                } catch (IOException e) {
	                    log.error("Couldn't serialize response for content type application/json", e);
	                    return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
	                }
	            }
	        } else {
	            log.warn("ObjectMapper or HttpServletRequest not configured in default OrdersApi interface so no example is generated");
	        }
	        return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));
	    }

}
