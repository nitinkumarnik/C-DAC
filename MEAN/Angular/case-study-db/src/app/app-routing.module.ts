import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SearchOptionsComponent } from './search-options/search-options.component';
import { SearchResultsComponent } from './search-results/search-results.component';
import { ModifyTabComponent } from './modify-tab/modify-tab.component';

const routes: Routes = [
  { path: 'search-options', component: SearchOptionsComponent},
  { path: 'search-results', component: SearchResultsComponent},
  { path: 'modify', component: ModifyTabComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
