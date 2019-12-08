package com.mikeescom.countriesapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mikeescom.countriesapp.model.CountryModel;

import java.util.ArrayList;
import java.util.List;

public class ListViewModel extends ViewModel {
    public MutableLiveData<List<CountryModel>> countries = new MutableLiveData<>();
    public MutableLiveData<Boolean> countryLoadError = new MutableLiveData<>();
    public MutableLiveData<Boolean> loading = new MutableLiveData<>();

    public void refresh() {
        fetchCountries();
    }

    private void fetchCountries() {
        CountryModel country1 = new CountryModel("Albania", "Tirana", "");
        CountryModel country2 = new CountryModel("Brazil", "Brasilia", "");
        CountryModel country3 = new CountryModel("Colombia", "Bogota", "");

        List<CountryModel> countryModelList = new ArrayList<>();
        countryModelList.add(country1);
        countryModelList.add(country2);
        countryModelList.add(country3);

        countries.setValue(countryModelList);
        countryLoadError.setValue(false);
        loading.setValue(false);
    }

}
