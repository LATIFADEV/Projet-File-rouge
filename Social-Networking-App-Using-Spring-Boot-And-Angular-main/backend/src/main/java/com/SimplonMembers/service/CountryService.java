package com.SimplonMembers.service;

import java.util.List;

import com.SimplonMembers.entity.Country;

public interface CountryService {
    Country getCountryById(Long id);
    Country getCountryByName(String name);
    List<Country> getCountryList();
}
