package Gui_App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Objects;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class chatgptapi extends JFrame {

    private final HttpClient httpClient = HttpClients.createDefault();

    private final JTextArea chatArea;
    private final JTextField userInputField;
    private final JButton sendButton;
    private final JLabel robotLabel;

    public chatgptapi() {
        setTitle("OpenAI Chatbot");
        setSize(600, 800);
        setResizable(false); // Set the window to be non-resizable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());



        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setForeground(Color.WHITE);
        chatArea.setBackground(new Color(38, 50, 56));
        chatArea.setFont(new Font("Arial", Font.PLAIN, 16));
        chatArea.isCursorSet();
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        userInputField = new JTextField();
        userInputField.setForeground(Color.BLACK);
        userInputField.setBackground(new Color(207, 216, 220, 0));
        userInputField.setFont(new Font("Arial", Font.PLAIN, 16));


        sendButton = new JButton("Send");
        sendButton.setForeground(Color.WHITE);
        sendButton.setBackground(new Color(76, 175, 80));

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(userInputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.SOUTH);

        setupListeners();
        robotLabel = new JLabel(new ImageIcon(getClass().getResource("robot2.gif")));
        add(robotLabel, BorderLayout.NORTH);
    }

    private void setupListeners() {
        sendButton.addActionListener(e -> sendMessage());

        userInputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    sendMessage();
                }
            }
        });
    }

    private void sendMessage() {
        String userMessage = userInputField.getText();
        if (!userMessage.isEmpty()) {
            try {
                String botResponse = getChatbotResponse(userMessage);
                displayMessageWithAnimation("You: " + userMessage);
                displayMessageWithAnimation("Chatbot: " + botResponse);
                userInputField.setText("");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private String getChatbotResponse(String userMessage) throws IOException {
        String requestBody = "{\"messages\": [" +
                "{\"role\": \"system\", \"content\": \"You are a chatbot\"}," +
                "{\"role\": \"user\", \"content\": \"" + userMessage + "\"}" +
                "], " +
                "\"model\": \"gpt-3.5-turbo\"}";
        String endpoint = "https://api.openai.com/v1/chat/completions";
        HttpPost request = new HttpPost(endpoint);
        request.setHeader("Content-Type", "application/json");
        // Replace with your OpenAI API key
        String apiKey = "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";
        request.setHeader("Authorization", "Bearer " + apiKey);
        request.setEntity(new StringEntity(requestBody));

        try {
            org.apache.http.HttpResponse response = httpClient.execute(request);
            String responseBody = EntityUtils.toString(response.getEntity());

            JSONObject jsonResponse = new JSONObject(responseBody);
            JSONArray choicesArray = jsonResponse.getJSONArray("choices");
            JSONObject choice = choicesArray.getJSONObject(0);
            JSONObject message = choice.getJSONObject("message");
            return message.getString("content");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    private void displayMessageWithAnimation(String message) {
        String existingText = chatArea.getText();
        if (!existingText.isEmpty()) {
            existingText += "\n";
        }
        chatArea.setText(existingText + message);
        chatArea.setCaretPosition(chatArea.getDocument().getLength());

        Timer timer = new Timer(10, new ActionListener() {
            float alpha = 0f;

            @Override
            public void actionPerformed(ActionEvent e) {
                alpha += 0.02f;
                if (alpha >= 1) {
                    ((Timer) e.getSource()).stop();
                    return;
                }
                Color newColor = new Color(chatArea.getForeground().getRed(),
                        chatArea.getForeground().getGreen(), chatArea.getForeground().getBlue(), (int) (255 * alpha));
                chatArea.setForeground(newColor);
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new chatgptapi().setVisible(true);
        });
    }
}
