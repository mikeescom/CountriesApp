package com.mikeescom.countriesapp.di;

import com.mikeescom.countriesapp.model.CountriesService;
import com.mikeescom.countriesapp.viewmodel.ListViewModel;

import dagger.Component;

@Component(modules = {CountriesModule.class})
public interface CountriesComponent {
    void inject(CountriesService service);
    void inject(ListViewModel viewModel);
}
