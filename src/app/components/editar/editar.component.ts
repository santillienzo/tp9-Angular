import { Component, OnInit } from '@angular/core';
import { ProductoService } from '../service/producto.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit {

  items: any[] = [];

  constructor(protected productoService: ProductoService, protected router: Router) { }

  ngOnInit(): void {
    this.productoService.getAll()
    .subscribe(
      (data: any[]) => {
        this.items = data;
      },
      (error) => {
        console.error(error);
      }
    );
  }

  eliminar(id) {
    let index = this.items.indexOf(id);
    this.productoService.delete(id).subscribe(data => {
      console.log('Registro Eliminado');
      this.items.splice(index, 1);
    })
  }

  editar(id){
    this.router.navigate([`editar/${id}`]);
  }

  nuevo(){
    this.router.navigate([`editar/${-1}`]);
  }
}
