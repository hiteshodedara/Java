package Gui_App;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class chatgpt {

    public static void main(String[] args) throws IOException {
        String apiKey = "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";
        String endpoint = "https://api.openai.com/v1/chat/completions";
        String userMessage = "Tell me a joke."; // User's input message

        HttpClient httpClient = HttpClients.createDefault();
        HttpPost request = new HttpPost(endpoint);
        request.setHeader("Content-Type", "application/json");
        request.setHeader("Authorization", "Bearer " + apiKey);

        String requestBody = "{\"messages\": [" +
                "{\"role\": \"system\", \"content\": \"You are a chatbot\"}," +
                "{\"role\": \"user\", \"content\": \"" + userMessage + "\"}" +
                "], " +
                "\"model\": \"gpt-3.5-turbo\"}";
        request.setEntity(new StringEntity(requestBody));

        org.apache.http.HttpResponse response = httpClient.execute(request);
        String responseBody = EntityUtils.toString(response.getEntity());

        // Parse the JSON response
        JSONObject jsonResponse = new JSONObject(responseBody);
        JSONArray choicesArray = jsonResponse.getJSONArray("choices");
        JSONObject choice = choicesArray.getJSONObject(0);
        JSONObject message = choice.getJSONObject("message");
        String botResponse = message.getString("content");

        System.out.println(botResponse);
    }
}
