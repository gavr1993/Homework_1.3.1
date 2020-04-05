package com.example.homework_131;

import java.util.HashMap;
import java.util.Map;

public class Pressure {
    private Integer upper;
    private Integer lower;
    private Integer pulse;
    private Boolean tah;
    private String date;
    private String time;

public Pressure(String upper, String lower, String pulse, Boolean tah, String date, String time) {
    this.upper = Integer.parseInt(upper);
    this.lower = Integer.parseInt(lower);
    this.pulse = Integer.parseInt(pulse);
    this.tah = tah;
    this.date = date;
    this.time = time;

    Map pressure = new HashMap<>();
    pressure.put("Верхнее", upper);
    pressure.put("Нижнее", lower);
    pressure.put("Пульс", pulse);
    pressure.put("Тахикардия", tah);
    pressure.put("Дата", date);
    pressure.put("Время", time);
}
}
