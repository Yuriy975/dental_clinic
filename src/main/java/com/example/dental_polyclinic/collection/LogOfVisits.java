package com.example.dental_polyclinic.collection;

import com.example.dental_polyclinic.Appointment;

public interface LogOfVisits {
    void add(Appointment appointment);

    void save(Appointment appointment);
    void update(Appointment appointment);
    void delete(Appointment appointment);
}
