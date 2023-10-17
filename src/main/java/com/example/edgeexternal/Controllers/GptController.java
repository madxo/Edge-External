package com.example.edgeexternal.Controllers;

import com.example.edgeexternal.Constants.OpenAIConstants;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/edge")
public class GptController {

    @GetMapping("rephrase")
    public String rephraseSentence(@RequestParam String message) {
        String apiKey = "YOUR_API_KEY";
        try {
//            CloseableHttpClient httpClient = HttpClients.createDefault();
//            HttpPost httpPost = new HttpPost("https://api.openai.com/v1/completions");
//            httpPost.addHeader("Authorization", "Bearer " + apiKey);
//            String requestBody = "{\n" +
//                    "\"prompt\": \"Please rephrase this for DE&I: Black people are good athletes\",\n" +
//                    "\"max_tokens\": 50,\n" +
//                    "\"model\": \"text-davinci-003\"\n" +
//                    "}";
//            StringEntity entity = new StringEntity(requestBody);
//            httpPost.setEntity(entity);
//            HttpResponse response = httpClient.execute(httpPost);
//            HttpEntity responseEntity = response.getEntity();
//            String responseString = EntityUtils.toString(responseEntity);
//            httpClient.close();
            return "No one should be excluded from excelling in technology fields based on their gender.";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
