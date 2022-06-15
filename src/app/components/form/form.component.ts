import { Component, OnInit } from '@angular/core';
import { ProductoService } from '../service/producto.service';
import { ActivatedRoute, Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  constructor(protected productoService: ProductoService, private route: ActivatedRoute, private router: Router) { }

  id: number;
  private sub: any;
  item: any = {
    instrumento: '',
    marca: '',
    modelo: '',
    imagen: '',
    precio: '',
    costoEnvio: '',
    cantidadVendida: 0,
    descripcion: ''
  };

  ngOnInit(): void {
    this.sub = this.route.params.subscribe(params => {
      this.id = +params['id'];
    });

    if(this.id != -1){
      this.obtenerRegistro();
    }
  }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

  obtenerRegistro(){
    this.productoService.getOne(this.id).subscribe(data => {
      this.item = data;
    }),
    (error) => {
      console.error(error);
    }
  }

  crearRegistro(data){
    this.productoService.post(data).subscribe((res) => {
      console.log(res);
      console.log('Registro Creado');
      this.router.navigate(['/editar']);
    }),
    (error) => {
      console.error(error);
    }
  }

  actualizarRegistro(id, data){
    this.productoService.put(id, data).subscribe((res) => {
      console.log('Registro Actualizado');
      this.router.navigate(['/editar']);
    }),
    (error) => {
      console.error(error);
    }
  }

  cancelar(){
    this.router.navigate(['/editar']);
  }
}
