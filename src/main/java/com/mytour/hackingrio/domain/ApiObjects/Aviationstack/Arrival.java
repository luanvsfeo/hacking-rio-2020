package com.mytour.hackingrio.domain.ApiObjects.Aviationstack;

import java.util.Date;

public class Arrival {

    public String airport;
    public String timezone;
    public String iata;
    public String icao;
    public Object terminal;
    public Object gate;
    public Object baggage;
    public Object delay;
    public Date scheduled;
    public Date estimated;
    public Object actual;
    public Object estimated_runway;
    public Object actual_runway;


    public Arrival( ) {
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

    public Object getTerminal() {
        return terminal;
    }

    public void setTerminal(Object terminal) {
        this.terminal = terminal;
    }

    public Object getGate() {
        return gate;
    }

    public void setGate(Object gate) {
        this.gate = gate;
    }

    public Object getBaggage() {
        return baggage;
    }

    public void setBaggage(Object baggage) {
        this.baggage = baggage;
    }

    public Object getDelay() {
        return delay;
    }

    public void setDelay(Object delay) {
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

    public Object getActual() {
        return actual;
    }

    public void setActual(Object actual) {
        this.actual = actual;
    }

    public Object getEstimated_runway() {
        return estimated_runway;
    }

    public void setEstimated_runway(Object estimated_runway) {
        this.estimated_runway = estimated_runway;
    }

    public Object getActual_runway() {
        return actual_runway;
    }

    public void setActual_runway(Object actual_runway) {
        this.actual_runway = actual_runway;
    }
}
