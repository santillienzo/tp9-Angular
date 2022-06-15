import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LugarComponent } from './components/lugar/lugar.component';
import { ListaComponent } from './components/lista/lista.component';
import { DetalleComponent } from './components/detalle/detalle.component';
import { EditarComponent } from './components/editar/editar.component';
import { FormComponent } from './components/form/form.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'home', component: HomeComponent},
  {path: 'dondeEstamos', component: LugarComponent},
  {path: 'lista', component: ListaComponent},
  {path: 'lista/:id', component: DetalleComponent},
  {path: 'editar', component: EditarComponent},
  {path: 'editar/:id', component: FormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
