import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BrandComponent } from './components/brand/brand.component';
import { ModeloComponent } from './components/modelo/modelo.component';

const routes: Routes = [
  {
    path: 'marca'
    , component: BrandComponent
  },{
    path:'modelo'
    , component:ModeloComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
