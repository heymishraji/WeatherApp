import { Component, OnInit } from '@angular/core';
import { WeatherData } from './weather.model';
import { WeatherService } from './weather.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  constructor(private weatherService: WeatherService){
      
  }

  cityName: string = 'Paris';
  weatherData?: WeatherData; 

  ngOnInit(): void {
    this.getWeatherDataForecast(this.cityName);
    this.cityName = '';
  }

  onSubmit() {
    this.getWeatherDataForecast(this.cityName);
    this.cityName = '';
  }
  private getWeatherDataForecast(cityName: string) {
    this.weatherService.getWeatherDataForecast(cityName)
    .subscribe({
      next: (response) => {
        this.weatherData = response;
        console.log(response);
      }
    });
  }

}
