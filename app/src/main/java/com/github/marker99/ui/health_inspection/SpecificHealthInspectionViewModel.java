package com.github.marker99.ui.health_inspection;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.github.marker99.persistence.health_inspection.HealthInspection;
import com.github.marker99.persistence.health_inspection.HealthInspectionRepository;

public class SpecificHealthInspectionViewModel extends AndroidViewModel {

    private final HealthInspectionRepository repository;
    private HealthInspection inspection;

    public SpecificHealthInspectionViewModel(Application application) {
        super(application);
        repository = HealthInspectionRepository.getInstance(application);
    }

    public void setInspection(HealthInspection inspection){
        this.inspection = inspection;
    }

    public HealthInspection getInspection(){
        return inspection;
    }

}