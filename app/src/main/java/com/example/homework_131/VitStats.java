package com.example.homework_131;

import java.util.HashMap;
import java.util.Map;

public class VitStats {
    private double weight;
    private int steps;

    public VitStats(String weight, String steps) {
        this.weight = Double.parseDouble(weight);
        this.steps = Integer.parseInt(steps);

        Map vitals = new HashMap<>();
        vitals.put("Вес", weight);
        vitals.put("Шагов", steps);
    }
}
