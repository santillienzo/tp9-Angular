import { Component, OnInit } from '@angular/core';
import { ProductoService } from '../service/producto.service';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent implements OnInit {

  items: any = [];
  term: string;

  constructor(private productoService: ProductoService) {}

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
}
