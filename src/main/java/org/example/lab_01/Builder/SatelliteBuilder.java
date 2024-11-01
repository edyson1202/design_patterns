package org.example.lab_01.Builder;

public class SatelliteBuilder {

    private GPSType gpsType;
    private OrientationSystemType orientationSystemType;
    private PowerSourceType powerSourceType;

    public SatelliteBuilder gps(GPSType gpsType) {
        this.gpsType = gpsType;
        return this;
    }

    public SatelliteBuilder orientationSystem(OrientationSystemType orientationSystemType) {
        this.orientationSystemType = orientationSystemType;
        return this;
    }

    public SatelliteBuilder powerSource(PowerSourceType powerSourceType) {
        this.powerSourceType = powerSourceType;
        return this;
    }

    public Satellite build() {
        return new Satellite(gpsType, orientationSystemType, powerSourceType);
    }

}
