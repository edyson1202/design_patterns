package org.example.lab_01.Builder;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class Satellite {

    private GPSType gpsType;
    private OrientationSystemType orientationSystemType;
    private PowerSourceType powerSourceType;

}
