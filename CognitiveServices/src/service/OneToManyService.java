package service;

import domain.Request;
import domain.Response;

import java.util.ArrayList;
import java.util.List;

public class OneToManyService {

    public static List<Request> getRequest(double size){
        List<Request> requestList = new ArrayList<>();

        for(int i = 0; i < size; i++){
            Request request = new Request();
            request.setInputVar(Math.random());
            requestList.add(request);
        }

        return requestList;
    }

    public static List<Response> getResponse(List<Request> requestList, double responseSize){
        List<Response> overallResponse = new ArrayList<>();

        for(Request request: requestList){
            List<Response> responseList = new ArrayList<>();
            for(int i = 0; i < responseSize; i++){
                Response response = new Response();
                response.setId(i);
                response.setInputVar(request.getInputVar());
                response.setPrescriptiveOutputVar(i + 100);
                response.setPredictiveOutputVar((i + 100) + Math.random() * 100);
                responseList.add(response);
            }
            overallResponse.addAll(responseList);
        }

        return overallResponse;
    }

    public static String getResponseMessage(List<Response> responseList) throws Exception{
        String message = null;
        for(Response response: responseList){
            System.out.println(response.toString());
            if(response != null){
                if(response.getPredictiveOutputVar() > 100 && response.getPredictiveOutputVar() < 125){
                    message = "Hell yeah!";
                    break;
                }
                else if(response.getPredictiveOutputVar() >= 125 && response.getPredictiveOutputVar() < 150){
                    message = "Later please.";
                    break;
                }
                else if(response.getPredictiveOutputVar() >= 150 && response.getPredictiveOutputVar() < 175){
                    message = "What dang?";
                    break;
                }
                else if(response.getPredictiveOutputVar() >= 175 && response.getPredictiveOutputVar() < 200){
                    message = ":|";
                    break;
                }
                else if(response.getPredictiveOutputVar() > 200){
                    message = "Sorry, I am not in a good mood right now!";
                    Exception exception = new Exception();
                }
            }
        }

        return message;
    }
}
