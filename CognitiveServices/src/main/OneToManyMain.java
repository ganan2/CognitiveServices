package main;

import domain.Request;
import domain.Response;
import service.OneToManyService;

import java.util.List;

public class OneToManyMain {

    public static void main(String[] args){
        List<Request> requestList = OneToManyService.getRequest(5);
        List<Response> responseList = OneToManyService.getResponse(requestList, 10);
        try {
            String respnseString = OneToManyService.getResponseMessage(responseList);
            System.out.println(respnseString);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
