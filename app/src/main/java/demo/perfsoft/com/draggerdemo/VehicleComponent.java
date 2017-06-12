package demo.perfsoft.com.draggerdemo;

import javax.inject.Singleton;

import dagger.Component;
import demo.perfsoft.com.draggerdemo.model.Vehicle;

/**
 * Created by Tong Hung on 09-May-17.
 * Copyright (C) SFR Software.
 */

@Component(modules = VehicleModule.class)
@Singleton
public interface VehicleComponent {
    Vehicle provideVehicle();
}
