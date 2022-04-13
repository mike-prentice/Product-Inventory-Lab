package services;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import models.Sneaker;
import models.Whiskey;
import utils.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WhiskeyService {
    private static int nextId = 1;  // (1)

    public static List<Whiskey> inventory = new ArrayList<>();

    public static Whiskey createWhiskey(String name, String type,
                                 int size, float price,
                                 int rating, int qty) {
        Whiskey createdWhiskey = new Whiskey(nextId++, name, type, size, price, rating, qty);
        inventory.add(createdWhiskey);
        return createdWhiskey;
    }

    public static Whiskey findWhiskey(int id) {
        return inventory.get(id);
    }

    public static List<Whiskey> findAll() {
        for (Whiskey w : inventory
        ) {
            System.out.println("Whiskey name: " + w.getName() + ", " + "Type: " + w.getType() + ", " + "Available bottles: " + w.getQty() + " \n");
        }
        return inventory;
    }

    public static void deleteWhiskey(int id) {
        inventory.remove(0);
    }

    public static void setQty(String whiskey, int newQty) {
        for (Whiskey w : inventory) {
            if (w.getName().equals(whiskey)) {
                w.setQty(newQty);
            }
        }
    }

    public static void getRatings(){
        for (Whiskey w : inventory
        ) {
            System.out.println("Whiskey name: " + w.getName() + ", " + "Rating: " + w.getRating() + ", " + "Available bottles: " + w.getQty() + " \n");
        }
    }

    public static void saveData() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("whiskey.json"), inventory);

        //        String csvFile = "src/main/Whiskey.csv";
//        FileWriter writer = new FileWriter(csvFile); //(1)
//
//        Utils.writeLine(writer, new ArrayList<String>(Collections.singletonList(String.valueOf(nextId))));  // (2)
//
//        for (Whiskey w : inventory) {
//            List<String> list = new ArrayList<>(); // (3)
//            list.add(String.valueOf(w.getId()));
//            list.add(w.getName());
//            list.add(w.getType());
//            list.add(String.valueOf(w.getSize()));
//            list.add(String.valueOf(w.getPrice()));
//            list.add(String.valueOf(w.getRating()));
//            list.add(String.valueOf(w.getQty()));
//
//            Utils.writeLine(writer, list);  // (4)
//        }
//
//// (5)
//        inventory.clear();
//        writer.flush();
//        writer.close();
    }

    public static void loadData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        inventory = objectMapper.readValue(new File("sneaker.json"), new TypeReference<List<Whiskey>>(){});

        //        // (1)
//        String csvFile = "src/main/Whiskey.csv";
//        String line = "";
//        String csvSplitBy = ",";
//
//        // (2)
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//            nextId = Integer.parseInt(br.readLine());  // (3)
//
//            while ((line = br.readLine()) != null) {
//                // split line with comma
//                String[] beer = line.split(csvSplitBy);
//
//                // (4)
//                int id = Integer.parseInt(beer[0]);
//                String name = beer[1];
//                String type = beer[2];
//                int size = Integer.parseInt(beer[3]);
//                float price = Float.parseFloat(beer[4]);
//                int rating = Integer.parseInt(beer[5]);
//                int qty = Integer.parseInt(beer[6]);
//
//                // (5)
//                WhiskeyService.inventory.add(new Whiskey(nextId++, name, type, size, price, rating, qty));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
