import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { TableModule } from 'primeng/table';
import { FormsModule } from '@angular/forms';
import { ButtonModule } from 'primeng/button';
import { InputTextModule } from 'primeng/inputtext';
import { InputSwitchModule } from 'primeng/inputswitch';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppComponent } from './app.component';
import { RestaurantsFilterPipe } from './services/restaurant-filter.pipe';
import { ValueOrHyphenPipe } from './services/valueOrHyphen.pipe';

@NgModule({
  declarations: [
    AppComponent,
    RestaurantsFilterPipe,
    ValueOrHyphenPipe
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    TableModule,
    FormsModule,
    ButtonModule,
    InputTextModule,
    InputSwitchModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }