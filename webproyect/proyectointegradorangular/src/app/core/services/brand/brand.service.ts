import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Brand } from '../../model/brand/brand.model';
import { environment } from '../../../../environments/environment';
import { map, catchError, switchMap, filter } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class BrandService {

  private basePath = environment.apiUrl.concat('brand')

  constructor(private http:HttpClient) { }

  getBrand(){
    return this.http.get<Brand[]>(this.basePath, {
      headers: new HttpHeaders({
        'Content-type': 'application/json; charset=utf-8',
        'Access-Control-Allow-Headers':'Content-Type'
      })
    }).pipe(map((res)=>res));
  }

  getBrandById(id:number){
    return this.http.get<Brand>(`${this.basePath}/${id}`, {
      headers: new HttpHeaders({
        'Content-type': 'application/json; charset=utf-8',
        'Access-Control-Allow-Headers':'Content-Type'
      })
    }).pipe(map((res)=>res));
  }

  saveBrand(brand:Brand){
    return this.http.post<Brand>(this.basePath, brand, {
      headers: new HttpHeaders({
        'Content-type': 'application/json; charset=utf-8',
        'Access-Control-Allow-Headers':'Content-Type'
      })
    }).pipe(map((res)=>res));
  }

  deleteBrand(id:number){
    return this.http.delete<Object>(`${this.basePath}/${id}`, {
      headers: new HttpHeaders({
        'Content-type': 'application/json; charset=utf-8',
        'Access-Control-Allow-Headers':'Content-Type'
      })
    })
  }

}
