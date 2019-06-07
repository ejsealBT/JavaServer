package io.swagger.api;

import io.swagger.model.Employee;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Swagger Employee Demo
 *
 * <p>Sample Swagger Demo
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface EmployeeApi  {

    /**
     * Find employee by ID
     *
     * Returns a single Employee
     *
     */
    @GET
    @Path("/findEmployeeDetails/{employeeId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find employee by ID", tags={ "employee" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Employee.class),
        @ApiResponse(code = 400, message = "Invalid Employee ID supplied"),
        @ApiResponse(code = 404, message = "Employee not found") })
    public Employee getEmployeeDetails(@PathParam("employeeId") Long employeeId);
}

