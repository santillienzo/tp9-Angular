import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  constructor(private http: HttpClient) { }

  public getAll(){
    return this.http.get('http://localhost:9000/api/v1/instrumentos/');
  }

  public getOne(id: number){
    return this.http.get(`http://localhost:9000/api/v1/instrumentos/${id}`);
  }

  public post(data: any){
    return this.http.post('http://localhost:9000/api/v1/instrumentos/', data);
  }

  public put(id: number, data: any){
    return this.http.put(`http://localhost:9000/api/v1/instrumentos/${id}`, data);
  }

  public delete(id: number){
    return this.http.delete(`http://localhost:9000/api/v1/instrumentos/${id}`);
  }
}
