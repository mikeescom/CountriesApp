package com.mikeescom.countriesapp.model;

import com.mikeescom.countriesapp.di.DaggerCountriesComponent;

import java.util.List;
import javax.inject.Inject;
import io.reactivex.Single;

public class CountriesService {

    private static CountriesService instance;
    @Inject
    public CountriesApi api;

    private CountriesService() {
        DaggerCountriesComponent.create().inject(this);
    }

    public static CountriesService getInstance() {
        if (instance == null) {
            instance = new CountriesService();
        }
        return instance;
    }

    public Single<List<CountryModel>> getCountries() {
        return api.getCountries();
    }
}
