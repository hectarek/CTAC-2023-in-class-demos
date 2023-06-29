package com.example.day84thymeleafdemo._07_errorHandling;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController  {

    @RequestMapping("/error")
    public String handleError(Model model, HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        
        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());
        
            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                return "error/error-404";
            }
            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
            	Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
            	while (exception != null && exception.getCause() != null) {
            		exception = (Exception) exception.getCause();
            	}
            	model.addAttribute("errorMessage", exception != null ? exception.getMessage() : "No massage");
                return "error/error-500";
            }
        }
        return "error";
    }

//    @Override
//    public String getErrorPath() {
//        return null;
//    }
}