import { Component, OnInit } from '@angular/core';
import { WeatherService } from '../current-temp-card/Services/weather.service';
import { WeatherData } from '../current-temp-card/Models/weathermodel';
@Component({
  selector: 'app-current-temp-card',
  templateUrl: './current-temp-card.component.html',
  styleUrls: ['./current-temp-card.component.css']
})
export class CurrentTempCardComponent implements OnInit {
  cityName: string = 'Paris';

  weatherData?: WeatherData;
  constructor(private weatherService: WeatherService) { }

  ngOnInit(): void {
    this.weatherService.getWeatherData('california')
       .subscribe({
     next: (response) =>{
       console.log(response);
       this.weatherData=response;
       console.log(this.weatherData);
     }
    });
   }

}
