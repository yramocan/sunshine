package com.example.yuriramocan.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Cloudy - 83/61",
                "Thursday - Rainy - 76/64",
                "Friday - Sunny - 89/73",
                "Saturday - Sunny - 80/70",
                "Sunday - Cloudy - 82/73",
                "Monday - Sunny - 87/77"
        };

        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray)
        );

        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(
                // Current context
                getActivity(),
                // ID of list item layout
                R.layout.list_item_forecast,
                // ID of TextView to populate
                R.id.list_item_forecast_textview,
                // Forecast data
                weekForecast
        );

        // Get reference to the ListView and attach adapter to it.
        ListView listView = (ListView) rootView.findViewById(
                R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
