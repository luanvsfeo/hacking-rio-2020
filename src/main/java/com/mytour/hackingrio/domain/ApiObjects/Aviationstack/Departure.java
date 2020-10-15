package com.mytour.hackingrio.domain.ApiObjects.Aviationstack;

import java.util.Date;

public class Departure {

    public String airport;
    public String timezone;
    public String iata;
    public String icao;
    public String terminal;
    public String gate;
    public int delay;
    public Date scheduled;
    public Date estimated;
    public Date actual;
    public Date estimated_runway;
    public Date actual_runway;


    public Departure() {
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public Date getScheduled() {
        return scheduled;
    }

    public void setScheduled(Date scheduled) {
        this.scheduled = scheduled;
    }

    public Date getEstimated() {
        return estimated;
    }

    public void setEstimated(Date estimated) {
        this.estimated = estimated;
    }

    public Date getActual() {
        return actual;
    }

    public void setActual(Date actual) {
        this.actual = actual;
    }

    public Date getEstimated_runway() {
        return estimated_runway;
    }

    public void setEstimated_runway(Date estimated_runway) {
        this.estimated_runway = estimated_runway;
    }

    public Date getActual_runway() {
        return actual_runway;
    }

    public void setActual_runway(Date actual_runway) {
        this.actual_runway = actual_runway;
    }
}
