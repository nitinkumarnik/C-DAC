import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SearchOptionsComponent } from './search-options/search-options.component';
import { SearchResultsComponent } from './search-results/search-results.component';
import { ModifyTabComponent } from './modify-tab/modify-tab.component';

@NgModule({
  declarations: [
    AppComponent,
    SearchOptionsComponent,
    SearchResultsComponent,
    ModifyTabComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
