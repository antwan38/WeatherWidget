package com.Antwan.WeatherWidget.service;

import com.Antwan.WeatherWidget.model.Widget;

import com.Antwan.WeatherWidget.model.WidgetData;
import com.Antwan.WeatherWidget.repository.WidgetDal;
import com.Antwan.WeatherWidget.repository.WidgetDataRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class WidgetService {
    /**
     * this is variable is used to connected to the repository.
     */
    private WidgetDal widgetDal;
    /**
     * this is variable is used to connected to the repository.
     */
    private WidgetDataRepository widgetRepository;
    /**
     * this constructor is used to inizialize the widget service.
     * @param widgetDal to connect to the repository
     * @param widgetRepository to connect to the repository
     */
    WidgetService(final WidgetDal widgetDal, final WidgetDataRepository widgetRepository) {
        this.widgetDal = widgetDal;
        this.widgetRepository = widgetRepository;
    }
    /**
     * this is method is used to get the widget data from an external api.
     * @return a widget
     * @param location of a widget
     */
    public Widget getWidget(final String location) {
        Widget widget = widgetDal.getWidget(location);
        if (widget != null) {
            return  widget;
        }
        return null;
    }
    /**
     * this is method is used to save a widget in the database.
     * @param widgetData
     */
   public void saveWidget(final WidgetData widgetData) {
        widgetRepository.save(widgetData);
   }
    /**
     * this is method is used to get the grid data of a user to place all the widgets in the right place.
     * @return a list of widgets
     */
   public List<WidgetData> getGrid() {
      return widgetRepository.findAll();
   }
    /**
     * this is method is used to delete a widget out of the grid.
     * @param id of a widget
     */
   public void deleteWidget(final Long id) {
        widgetRepository.deleteById(id);
   }
    /**
     * this is method is used to edit a widget in the grid.
     * @param widgetData of a widget
     */
   public void editWidget(final WidgetData widgetData) {
       widgetRepository.save(widgetData);

   }


}
