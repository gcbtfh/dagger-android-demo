package demo.perfsoft.com.draggerdemo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import demo.perfsoft.com.draggerdemo.model.Motor;
import demo.perfsoft.com.draggerdemo.model.Vehicle;

/**
 * Created by Tong Hung on 09-May-17.
 * Copyright (C) SFR Software.
 */

@Module
public class VehicleModule {
    @Provides @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
