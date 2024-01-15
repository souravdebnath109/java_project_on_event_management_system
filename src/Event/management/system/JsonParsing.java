////package Event.management.system;
////
////import com.google.gson.JsonArray;
////import com.google.gson.JsonObject;
////import com.google.gson.JsonParser;
////
////import javax.swing.*;
////import java.awt.*;
////import java.io.BufferedReader;
////import java.io.IOException;
////import java.io.InputStreamReader;
////import java.net.HttpURLConnection;
////import java.net.MalformedURLException;
////import java.net.URL;
////
////public class JsonParsing extends JFrame {
////    private JPanel cardsPanel;
////
////    public JsonParsing() {
////        setTitle("JSON Parser Swing App");
////        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        setExtendedState(JFrame.MAXIMIZED_BOTH);
////
////        cardsPanel = new JPanel();
////        cardsPanel.setLayout(new BoxLayout(cardsPanel, BoxLayout.Y_AXIS));
////        cardsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
////        cardsPanel.setBackground(Color.WHITE);
////
////        JScrollPane scrollPane = new JScrollPane(cardsPanel);
////        add(scrollPane, BorderLayout.CENTER);
////
////        fetchDataFromApi();
////
////        // Add Back button at the bottom
////        JButton backButton = new JButton("Back");
////        backButton.addActionListener(e -> {
////            // Add the code to handle the back button action (e.g., navigate to the previous window)
////            // For now, just close the current window
////            dispose();
////        });
////
////        JPanel bottomPanel = new JPanel();
////        bottomPanel.add(backButton);
////
////        add(bottomPanel, BorderLayout.SOUTH);
////    }
////
////    private void fetchDataFromApi() {
////        try {
////            URL url = new URL("https://api.myjson.online/v1/records/aaf6cf42-4043-489b-a39f-2805d6926083");
////            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
////            connection.setRequestMethod("GET");
////
////            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
////            BufferedReader reader = new BufferedReader(inputStreamReader);
////
////            StringBuilder response = new StringBuilder();
////            String line;
////
////            while ((line = reader.readLine()) != null) {
////                response.append(line);
////            }
////
////            reader.close();
////            connection.disconnect();
////
////            String json = response.toString();
////            jsonParse(json);
////
////        } catch (MalformedURLException ex) {
////            ex.printStackTrace();
////        } catch (IOException ex) {
////            ex.printStackTrace();
////        }
////    }
////
////    private void jsonParse(String response) {
////        JsonObject jsonObject = JsonParser.parseString(response).getAsJsonObject();
////        JsonArray dataArray = jsonObject.getAsJsonArray("data");
////
////        for (int i = 0; i < dataArray.size(); i++) {
////            JsonObject dataObject = dataArray.get(i).getAsJsonObject();
////
////            String details = dataObject.getAsJsonPrimitive("DETAILS").getAsString();
////            String eventName = dataObject.getAsJsonPrimitive("EVENT NAME").getAsString();
////
////            addCard(eventName, details);
////        }
////    }
////
////    private void addCard(String eventName, String details) {
////        JPanel cardPanel = new JPanel();
////        cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
////        cardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
////        cardPanel.setBackground(new Color(135, 206, 250));
////
////        JLabel eventNameLabel = new JLabel("Event Name: " + eventName);
////        JLabel detailsLabel = new JLabel("Event Details: " + details);
////
////        cardPanel.add(eventNameLabel);
////        cardPanel.add(detailsLabel);
////
////        cardsPanel.add(cardPanel);
////        cardsPanel.add(Box.createRigidArea(new Dimension(0, 10)));
////
////        revalidate();
////        repaint();
////    }
////
////    public static void main(String[] args) {
////        SwingUtilities.invokeLater(() -> {
////            JsonParsing app = new JsonParsing();
////            app.setVisible(true);
////        });
////    }
////}
//
//
//
//
////back er action perform add kora
//
//package Event.management.system;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class JsonParsing extends JFrame {
//    private JPanel cardsPanel;
//    private JLabel backgroundLabel;
//
//    public JsonParsing() {
//        setTitle("ALL EVENTS WITH DETAILS");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//
////        // Create a background label with an image
////        ImageIcon background = new ImageIcon("path/to/your/image.jpg"); // Replace with the actual path
////        backgroundLabel = new JLabel(background);
////        backgroundLabel.setLayout(new BorderLayout());
//
//        cardsPanel = new JPanel();
//        cardsPanel.setLayout(new BoxLayout(cardsPanel, BoxLayout.Y_AXIS));
//        cardsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//        cardsPanel.setBackground(new Color(3,45,48));
//
//        JScrollPane scrollPane = new JScrollPane(cardsPanel);
//        add(scrollPane, BorderLayout.CENTER);
//
//        fetchDataFromApi();
//
//        // Add Back button at the bottom
//        JButton backButton = new JButton("Back");
//        backButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Add the code to navigate to the Dashboard.java class
//                dispose(); // Close the current window
//                new Dashboard(); // Open the Dashboard.java class
//            }
//        });
//
//        JPanel bottomPanel = new JPanel();
//        bottomPanel.add(backButton);
//
//        add(bottomPanel, BorderLayout.SOUTH);
//    }
//
//    private void fetchDataFromApi() {
//        try {
//            URL url = new URL("https://api.myjson.online/v1/records/aaf6cf42-4043-489b-a39f-2805d6926083");
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//
//            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
//            BufferedReader reader = new BufferedReader(inputStreamReader);
//
//            StringBuilder response = new StringBuilder();
//            String line;
//
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//
//            reader.close();
//            connection.disconnect();
//
//            String json = response.toString();
//            jsonParse(json);
//
//        } catch (MalformedURLException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    private void jsonParse(String response) {
//        JsonObject jsonObject = JsonParser.parseString(response).getAsJsonObject();
//        JsonArray dataArray = jsonObject.getAsJsonArray("data");
//
//        for (int i = 0; i < dataArray.size(); i++) {
//            JsonObject dataObject = dataArray.get(i).getAsJsonObject();
//
//            String details = dataObject.getAsJsonPrimitive("DETAILS").getAsString();
//            String eventName = dataObject.getAsJsonPrimitive("EVENT NAME").getAsString();
//
//            addCard(eventName, details);
//        }
//    }
//
//    private void addCard(String eventName, String details) {
//        JPanel cardPanel = new JPanel();
//        cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
//        cardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//        cardPanel.setBackground(new Color(15, 213, 231));
//
//        JLabel eventNameLabel = new JLabel("Event Name: " + eventName);
//        JLabel detailsLabel = new JLabel("Event Details: " + details);
//        cardPanel.add(eventNameLabel);
//        cardPanel.add(detailsLabel);
//
//        cardsPanel.add(cardPanel);
//        cardsPanel.add(Box.createRigidArea(new Dimension(0, 10)));
//
//        revalidate();
//        repaint();
//    }
//
//    public static void main(String[] args) {
//            SwingUtilities.invokeLater(() -> {
//                JsonParsing app = new JsonParsing();
//                app.setVisible(true);
//            });
//    }
//}
//
//
//
//




//rebody try 1
//package Event.management.system;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//
//import javax.swing.*;
//import java.awt.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class JsonParsing extends JFrame {
//    private JPanel cardsPanel;
//
//    public JsonParsing() {
//        setTitle("JSON Parser Swing App");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//
//        cardsPanel = new JPanel();
//        cardsPanel.setLayout(new BoxLayout(cardsPanel, BoxLayout.Y_AXIS));
//        cardsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//        cardsPanel.setBackground(Color.WHITE);
//
//        JScrollPane scrollPane = new JScrollPane(cardsPanel);
//        add(scrollPane, BorderLayout.CENTER);
//
//        fetchDataFromApi();
//
//        // Add Back button at the bottom
//        JButton backButton = new JButton("Back");
//        backButton.addActionListener(e -> {
//            // Add the code to handle the back button action (e.g., navigate to the previous window)
//            // For now, just close the current window
//            dispose();
//        });
//
//        JPanel bottomPanel = new JPanel();
//        bottomPanel.add(backButton);
//
//        add(bottomPanel, BorderLayout.SOUTH);
//    }
//
//    private void fetchDataFromApi() {
//        try {
//            URL url = new URL("https://api.myjson.online/v1/records/aaf6cf42-4043-489b-a39f-2805d6926083");
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//
//            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
//            BufferedReader reader = new BufferedReader(inputStreamReader);
//
//            StringBuilder response = new StringBuilder();
//            String line;
//
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//
//            reader.close();
//            connection.disconnect();
//
//            String json = response.toString();
//            jsonParse(json);
//
//        } catch (MalformedURLException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    private void jsonParse(String response) {
//        JsonObject jsonObject = JsonParser.parseString(response).getAsJsonObject();
//        JsonArray dataArray = jsonObject.getAsJsonArray("data");
//
//        for (int i = 0; i < dataArray.size(); i++) {
//            JsonObject dataObject = dataArray.get(i).getAsJsonObject();
//
//            String details = dataObject.getAsJsonPrimitive("DETAILS").getAsString();
//            String eventName = dataObject.getAsJsonPrimitive("EVENT NAME").getAsString();
//
//            addCard(eventName, details);
//        }
//    }
//
//    private void addCard(String eventName, String details) {
//        JPanel cardPanel = new JPanel();
//        cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
//        cardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//        cardPanel.setBackground(new Color(135, 206, 250));
//
//        JLabel eventNameLabel = new JLabel("Event Name: " + eventName);
//        JLabel detailsLabel = new JLabel("Event Details: " + details);
//
//        cardPanel.add(eventNameLabel);
//        cardPanel.add(detailsLabel);
//
//        cardsPanel.add(cardPanel);
//        cardsPanel.add(Box.createRigidArea(new Dimension(0, 10)));
//
//        revalidate();
//        repaint();
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JsonParsing app = new JsonParsing();
//            app.setVisible(true);
//        });
//    }
//}



//
////back er action perform add kora
//
//package Event.management.system;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class JsonParsing extends JFrame {
//    private JPanel cardsPanel;
//    private JLabel backgroundLabel;
//
//    public JsonParsing() {
//        setTitle("ALL EVENTS WITH DETAILS");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//
////        // Create a background label with an image
////        ImageIcon background = new ImageIcon("path/to/your/image.jpg"); // Replace with the actual path
////        backgroundLabel = new JLabel(background);
////        backgroundLabel.setLayout(new BorderLayout());
//
//        cardsPanel = new JPanel();
//        cardsPanel.setLayout(new BoxLayout(cardsPanel, BoxLayout.Y_AXIS));
//        cardsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//        cardsPanel.setBackground(new Color(3,45,48));
//
//        JScrollPane scrollPane = new JScrollPane(cardsPanel);
//        add(scrollPane, BorderLayout.CENTER);
//
//        fetchDataFromApi();
//
//        // Add Back button at the bottom
//        JButton backButton = new JButton("Back");
//        backButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Add the code to navigate to the Dashboard.java class
//                dispose(); // Close the current window
//                new Dashboard(); // Open the Dashboard.java class
//            }
//        });
//
//        JPanel bottomPanel = new JPanel();
//        bottomPanel.add(backButton);
//
//        add(bottomPanel, BorderLayout.SOUTH);
//    }
//
//    private void fetchDataFromApi() {
//        try {
//            URL url = new URL("https://api.myjson.online/v1/records/aaf6cf42-4043-489b-a39f-2805d6926083");
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//
//            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
//            BufferedReader reader = new BufferedReader(inputStreamReader);
//
//            StringBuilder response = new StringBuilder();
//            String line;
//
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//
//            reader.close();
//            connection.disconnect();
//
//            String json = response.toString();
//            jsonParse(json);
//
//        } catch (MalformedURLException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    private void jsonParse(String response) {
//        JsonObject jsonObject = JsonParser.parseString(response).getAsJsonObject();
//        JsonArray dataArray = jsonObject.getAsJsonArray("data");
//
//        for (int i = 0; i < dataArray.size(); i++) {
//            JsonObject dataObject = dataArray.get(i).getAsJsonObject();
//
//            String details = dataObject.getAsJsonPrimitive("DETAILS").getAsString();
//            String eventName = dataObject.getAsJsonPrimitive("EVENT NAME").getAsString();
//
//            addCard(eventName, details);
//        }
//    }
//
//    private void addCard(String eventName, String details) {
//        JPanel cardPanel = new JPanel();
//        cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
//        cardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//        cardPanel.setBackground(new Color(15, 213, 231));
//
//        JLabel eventNameLabel = new JLabel("Event Name: " + eventName);
//        JLabel detailsLabel = new JLabel("<html><div style='width:300px; text-align: justify;'>" + "Event Details: " + details + "</div></html>");
//
//        cardPanel.add(eventNameLabel);
//        cardPanel.add(detailsLabel);
//
//        cardsPanel.add(cardPanel);
//        cardsPanel.add(Box.createRigidArea(new Dimension(0, 10)));
//
//        revalidate();
//        repaint();
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JsonParsing app = new JsonParsing();
//            app.setVisible(true);
//        });
//    }
//}



//rebody try 2

package Event.management.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonParsing extends JFrame {
    private JPanel cardsPanel;

    public JsonParsing() {
        setTitle("ALL EVENTS WITH DETAILS:");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        cardsPanel = new JPanel();
        cardsPanel.setLayout(new BoxLayout(cardsPanel, BoxLayout.Y_AXIS));
        cardsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        cardsPanel.setBackground(new Color(3,45,48));

        JScrollPane scrollPane = new JScrollPane(cardsPanel);//scroll hoy
        add(scrollPane, BorderLayout.CENTER);

        try {
            fetchDataFromApi();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error fetching data from the API: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Add Back button at the bottom
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add the code to navigate to the Dashboard.java class
                dispose(); // Close the current window
                new Dashboard(); // Open the Dashboard.java class
            }
        });


        JPanel bottomPanel = new JPanel();
        bottomPanel.add(backButton);

        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void fetchDataFromApi() throws IOException {
        try {
            URL url = new URL("https://api.myjson.online/v1/records/7649a0c0-3f67-435b-9f7f-b71904654f02"); // Replace with the actual URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            String json = response.toString();
            jsonParse(json);

        } catch (MalformedURLException ex) {
            throw new IOException("Malformed URL: " + ex.getMessage(), ex);
        } catch (IOException ex) {
            throw new IOException("Error fetching data: " + ex.getMessage(), ex);
        }
    }

    private void jsonParse(String response) {
        JsonObject rootObject = JsonParser.parseString(response).getAsJsonObject();
        JsonObject dataObject = rootObject.getAsJsonObject("data");
        JsonArray eventsArray = dataObject.getAsJsonArray("events");

        for (int i = 0; i < eventsArray.size(); i++) {
            JsonObject eventObject = eventsArray.get(i).getAsJsonObject();

            String details = eventObject.getAsJsonPrimitive("details").getAsString();
            String duration = eventObject.getAsJsonPrimitive("duration").getAsString();
            String attendees = eventObject.getAsJsonPrimitive("attendees").getAsString();
            String eventName = eventObject.getAsJsonPrimitive("event_name").getAsString();
            String specialElements = eventObject.getAsJsonArray("special_elements").toString();

            addCard(eventName, details, duration, attendees, specialElements);
        }
    }

    private void addCard(String eventName, String details, String duration, String attendees, String specialElements) {
        JPanel cardPanel = new JPanel();
        cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
        cardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        cardPanel.setBackground(new Color(15, 213, 231));//15, 213, 231));

        JLabel eventNameLabel = new JLabel("Event Name: " + eventName);
        JLabel detailsLabel = new JLabel("Details: " + details);
        JLabel durationLabel = new JLabel("Duration: " + duration);
        JLabel attendeesLabel = new JLabel("Attendees: " + attendees);
        JLabel specialElementsLabel = new JLabel("Special Elements: " + specialElements);

        cardPanel.add(eventNameLabel);
        cardPanel.add(detailsLabel);
        cardPanel.add(durationLabel);
        cardPanel.add(attendeesLabel);
        cardPanel.add(specialElementsLabel);

        cardsPanel.add(cardPanel);
        cardsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JsonParsing app = new JsonParsing();
            app.setVisible(true);
        });
    }
}


